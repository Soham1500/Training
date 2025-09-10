#include <stdio.h>
void perimeter() {
    int l, w, p;
    printf("Enter length and width: ");
    scanf("%d %d", &l, &w);
    p = 2 * (l + w);
    printf("Perimeter = %d", p);
}
int main() {
    perimeter();
    return 0;
}

