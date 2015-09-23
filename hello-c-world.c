#include <stdio.h>
#include <unistd.h>

int main(void){
    int a;
    printf("Please enter an integer: ");
    scanf("%d", &a);
    int b;
    b = a * 2;
    printf("%d", b);
    sleep(10);
    return 0;
}
