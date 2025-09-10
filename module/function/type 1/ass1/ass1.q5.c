#include <stdio.h>
void average() {
    int a, b, c, d, e;
    float avg;
    printf("Enter five numbers: ");
    scanf("%d %d %d %d %d", &a, &b, &c, &d, &e);
    avg = (a + b + c + d + e) / 5.0;
    printf("Average = %.2f", avg);
}
int main() {
    average();
    return 0;
}

