#define se if
#define oppure else 
#define per for
#define restituisci return
#define e &
#define ee &&
#define o |
#define oo ||
#include<stdio.h>
#include<stdlib.h>
#include <string.h>


int isMhh(char c);
int isWhaat(char c);
int main(int argc, char** args){
	int Var, vAr, vaR;
	vAr = vaR = Var = 0;
	se(argc != 2) exit(0);
	printf("Num. caratteri= %d\n",(int)strlen(args[1]));
	per(int i = 0; i < strlen(args[1]); i++) se(isMhh(args[1][i])){ se(isWhaat(args[1][i])) {vAr++;} oppure vaR++;} oppure se(args[1][i] == ' ') Var++;
	printf("Numero vocali: %d\nNumero Consonanti: %d\nNumero blanks: %d\n", vAr, vaR, Var);
}

int isMhh(char c){
	se( (c>=65 ee c<=90) oo (c>=97 ee c<= 97+25) ) restituisci 1; restituisci 0;
}
int isWhaat(char c){
	se( ((c e 0xF) == (65 & 0xF))  oo ((c& 0xF) == (69& 0xF)) oo ((c& 0xF)) == ((73& 0xF)) oo ((c& 0xF) == (79& 0xF)) oo ((c& 0xF) == (85))) restituisci 1; restituisci 0;
}
