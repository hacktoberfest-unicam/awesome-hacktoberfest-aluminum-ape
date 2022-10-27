#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char** args){
	if(argc != 2) exit(0);
	char* string = args[1];
	int len = strlen(args[1]);
	int flag = 1;
	for(int i = 0; i < len/2; i++){
		if(string[i] != string[len-i-1]) flag = 0;
	}
	

	
	if(flag) printf("PALINDROMA\n");
	else printf("NON PALINDROMA\n");

	return 0;
	
}
