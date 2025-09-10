#include <stdio.h>
void result() {
    int s1, s2, s3, s4, s5, total;
    float per;
    printf("Enter marks of 5 subjects: ");
    scanf("%d %d %d %d %d", &s1, &s2, &s3, &s4, &s5);
    total = s1 + s2 + s3 + s4 + s5;
    per = (total / 500.0) * 100;
    printf("Total = %d\n", total);
    printf("Percentage = %.2f%%", per);
}
int main() {
    result();
    return 0;
}

