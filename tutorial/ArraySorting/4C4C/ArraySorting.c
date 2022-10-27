#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char** argv){
	if(argc < 2) exit(0);
	int len = argc-1;
	int* array = malloc(sizeof(int)*(len));
	for(int i = 0; i < len; i++) array[i] = atoi(argv[i+1]);		
		
	//insertion_sort??		
	for(int i = 1; i < len; i++){
		int key = array[i];
		int j = i-1;
		while(array[j]>key && j >= 0){
			array[j+1] = array[j];  
			j--;
		}
		array[j+1] = key;
	}

	for(int i = 0; i < len; i++) printf("%d - ", array[i]);
}
