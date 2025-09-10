#include <stdio.h>
void convert() {
    int min, h, r;
    printf("Enter minutes: ");
    scanf("%d", &min);
    h = min / 60;
    r = min % 60;
    printf("%d minutes = %d hours %d minutes", min, h, r);
}
int main() {
    convert();
    return 0;
}

