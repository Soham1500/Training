#include <stdio.h>

void area() {
    float r, a,pi=3.14;
    printf("Enter radius: ");
    scanf("%f", &r);
    a = pi * r * r;
    printf("Area = %.2f", a);
}
int main() {
    area();
    return 0;
}

