#include <stdio.h>

int main(){
    int num;
    printf("Please type an integer: \n");
    scanf("%d", &num);
    while (num > 0){
        int bin = num % 2;
        printf("%d \n", bin);
        num = num/2;
    }
}