#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char** args){
	if(argc != 2) exit(0);
	int num = atoi(args[1]);
	int j = 1;
	for(int i = 31; i >= 0; i-- ){
		printf("%d", !!(num&(1<<i)));
	}
	printf("\n");
}
