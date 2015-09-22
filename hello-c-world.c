#include <stdio.h>

int main(void){
    char* name;
    printf("Enter your name: ");
    scanf("%[^\n]", name);
    printf("%s", name);
    return 0;
}
