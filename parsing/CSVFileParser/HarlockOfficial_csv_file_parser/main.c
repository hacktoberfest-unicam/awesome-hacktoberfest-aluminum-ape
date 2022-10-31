#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "linked_list.h"

void print_menu(void);
void show_file(char *file_path, short has_to_show_line_number);
void insert_value(char *file_path, char *column_separator, short has_header);
void delete_value(char *file_path);

void open_file(char *file_path, char *open_mode, FILE **fp);
void get_first_line(char *file_path, char* column_separator, char ***header);
void array_to_csv_line(char **array, long long array_length, char *column_separator, char **new_line);
void delete_line_from_file(char *file_path, long long line_number);

int main (int argc, char **argv){
    char file_path[500];
    char column_separator[500];
    short has_header;
    printf("Insert CSV file path> ");
    scanf("%s", file_path);
    
    printf("Insert CSV column separator> ");
    scanf("%s", column_separator);
    
    printf("Insert 1 if CSV has header, 0 otherwise> ");
    scanf("%hd", &has_header);
    
    int choice = -1;
    
    while(choice != 0){
        print_menu();
        printf("> ");
        scanf("%d", &choice);
        switch(choice){
            case 1:
                show_file(file_path, 0);
                break;
            case 2:
                insert_value(file_path, column_separator, has_header);
                break;
            case 3:
                delete_value(file_path);
                //Missing break is voluntary
            case 0:
                break;
        }
    }
    
    return 0;
}

void open_file(char *file_path, char *open_mode, FILE **fp){
    *fp = fopen(file_path, open_mode);
    if(*fp == NULL){
        perror("Error opening file");
        exit(EXIT_FAILURE);
    }
}

void get_first_line(char *file_path, char* column_separator, char ***header) {
    FILE *fp;
    open_file(file_path, "r", &fp);
    char *line = NULL;
    size_t len = 0;
    char *retourned_token;
    
    if(getline(&line, &len, fp) == -1){
        perror("Error header not present");
        exit(EXIT_FAILURE);
    }
    linked_list list;
    init_list(&list);
    
    retourned_token = strtok(line, column_separator);
    while(retourned_token != NULL){
        add_to_tail(retourned_token, &list);
        retourned_token = strtok(NULL, column_separator);
    }
    linked_list_to_array(sizeof(char), list, (void***)header);
    free(list);
    free(retourned_token);
    free(line);
    fclose(fp);
}

void array_to_csv_line(char **array, long long array_length, char *column_separator, char **new_line){
    long long line_length = 0;
    long long column_separator_length = strlen(column_separator);
    for(int i = 0; i<array_length; ++i){
        line_length += strlen(array[i]);
        if(i+1<array_length){
            line_length += column_separator_length;
        }
    }
    *new_line = calloc(line_length, sizeof(char));
    for(int i = 0; i<array_length; ++i){
        strcat(*new_line, array[i]);
        if(i+1<array_length){
            strcat(*new_line, column_separator);
        }
    }
}

void delete_line_from_file(char *file_path, long long line_number){
    FILE *fp_old, *fp_new;
    char *line = NULL;
    size_t len = 0;
    long long line_counter = 0L;
    
    open_file(file_path, "r", &fp_old);
    open_file("./tmp_file.csv", "w", &fp_new);
    
    while (getline(&line, &len, fp_old) != -1) {
        if(line_counter != line_number){
            fputs(line, fp_new);
        }
        line_counter+=1;
    }
    remove(file_path);
    rename("./tmp_file.csv", file_path);
    free(line);
    fclose(fp_new);
    fclose(fp_old);
}

void print_menu(){
    printf("Select which action to perform.\r\n");
    printf("Insert: \r\n");
    printf("\t1 to show the entire file.\r\n");
    printf("\t2 to insert a new value\r\n");
    printf("\t3 to delete a value\r\n");
    printf("\t0 to exit\r\n");
}

void show_file(char *file_path, short has_to_show_line_number){
    FILE *fp;
    char *line = NULL;
    size_t len = 0;
    long long line_counter = 0L;
    printf("Start of File Content\n");
    
    open_file(file_path, "r", &fp);
    
    while (getline(&line, &len, fp) != -1) {
        if(has_to_show_line_number!=0){
            printf("%lld ", line_counter);
            line_counter+=1;
        }
        printf("%s\r\n",line);
    }
    
    printf("End of File Content\n");
    
    free(line);
    fclose(fp);
}

void insert_value(char *file_path, char* column_separator, short has_header){
    char **header;
    long long header_length;
    FILE *fp;
    char *new_line, *final_line;
    
    if(has_header != 0){
        get_first_line(file_path, column_separator, &header);
        header_length = sizeof(header)/sizeof(header[0]);
    }else{
        open_file(file_path, "r", &fp);
        fseek(fp, 0, SEEK_END);
        long int file_size = ftell(fp);
        fclose(fp);
        if(file_size>0){
            get_first_line(file_path, column_separator, &header);
        }else{
            printf("Insert how many values you want to save> ");
            scanf("%lld", &header_length);
            header = calloc(header_length, sizeof(char*));
            for(long long i = 0; i<header_length; ++i){
                header[i] = calloc(50, sizeof(char));
                strcpy(header[i], "Position ");
                char* value=calloc(40, sizeof(char));
                sprintf(value, "%lld", i+1);
                strcat(header[i], value);
            }
        }
    }
    
    for(int i = 0; i<header_length; ++i){
        printf("Insert value for %s> ", header[i]);
        scanf("%s", header[i]);
    }
    
    array_to_csv_line(header, header_length, column_separator, &new_line);
    printf("Resulting line: %s\n", new_line);
    
    final_line = calloc((sizeof(new_line)/sizeof(char))+2, sizeof(char));
    strcpy(final_line, new_line);
    strcat(final_line, "\r\n");
    
    open_file(file_path, "a", &fp);
    fputs(new_line, fp);
    
    free(final_line);
    free(new_line);
    free(header);
    fclose(fp);
}

void delete_value(char *file_path){
    long long line_number = -1;
    printf("Current file:\r\n");
    show_file(file_path, 1);
    printf("Insert the line number to delete> ");
    scanf("%lld", &line_number);
    delete_line_from_file(file_path, line_number);
}
