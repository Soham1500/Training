#include <stdio.h>
void convert() {
    float c, f;
    printf("Enter Celsius: ");
    scanf("%f", &c);
    f = (c * 9 / 5) + 32;
    printf("Fahrenheit = %.2f", f);
}
int main() {
    convert();
    return 0;
}

