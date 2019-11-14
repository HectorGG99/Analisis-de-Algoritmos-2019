#include <stdio.h> 
#include <string.h> 
#define d 256 
  
void empateCadena(char pat[], char txt[], int q) 
{ 
    int M = strlen(pat); //Numero de caracteres apra ambas cadenas
    int N = strlen(txt); 
    int i, j; 
    int p = 0; // valor hash para el patron
    int t = 0; // valor hash para el texto
    int h = 1; 
	int c=0;
    for (i = 0; i < M - 1; i++) 
        h = (h * d) % q; 
  
    for (i = 0; i < M; i++) { 
        p = (d * p + pat[i]) % q; 
        t = (d * t + txt[i]) % q; 
    } 
  
    for (i = 0; i <= N - M; i++) { 
      if (p == t) { //Si se encuentra coincidencia del valor hash
            for (j = 0; j < M; j++) { //Se busca por fuerza bruta
                if (txt[i + j] != pat[j]) 
                    break; 
            } 
  
            if (j == M) //Si se encuentra todo el patrón en el texto
                c++;//Se aumentan las coincidencias
        } 
  
        if (i < N - M) { 
            t = (d * (t - txt[i] * h) + txt[i + M]) % q; 
            if (t < 0) 
                t = (t + q); 
        } 
    } 
    printf("Numero de coincidencias: %i \n", c);
} 
  
int main() 
{ 
    char txt[100],  pat[100];
	printf("Introduce el texto: \n");
	scanf("%s",txt); 
	printf("Introduce el patron a buscar: \n");
	scanf("%s",&pat);
    int primo = 9; 
    empateCadena(pat, txt, primo); 
    return 0; 
} 
