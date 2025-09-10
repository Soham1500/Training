#include <stdio.h>
void swap() {
    int a, b, temp;
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    temp = a;
    a = b;
    b = temp;
    printf("After swapping: a=%d b=%d", a, b);
}
int main() {
    swap();
    return 0;
}

