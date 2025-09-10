#include <stdio.h>
void add() {
    int a, b, sum;
    printf("Enter two integers: ");
    scanf("%d%d", &a,&b);
    sum = a + b;
    printf("Sum = %d", sum);
}
int main() {
    add();
    return 0;
}

