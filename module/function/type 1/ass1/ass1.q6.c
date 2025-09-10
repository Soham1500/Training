#include <stdio.h>
void power() {
    int n;
    printf("Enter number: ");
    scanf("%d", &n);
    printf("Square = %d\n", n * n);
    printf("Cube = %d", n * n * n);
}
int main() {
    power();
    return 0;
}

