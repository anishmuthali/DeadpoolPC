#include <stdio.h>
#include <unistd.h>

int main(void){
    int a;
<<<<<<< HEAD
    printf("Please enter an integer: ");
    scanf("%d", &a);
=======
>>>>>>> b28367e025bd0751a39621293a8bf9010675096b
    int b;
    printf("Please enter an integer: ");
    scanf("%d", &a);
    b = a * 2;
    printf("%d", b);
<<<<<<< HEAD
    sleep(10);
    return 0;
=======
    return 0;
    
>>>>>>> b28367e025bd0751a39621293a8bf9010675096b
}
