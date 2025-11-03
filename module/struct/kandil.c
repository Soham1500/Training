#include <stdio.h>

int main() {
    int i, j, k;

    // Top rectangle part
    for (i = 0; i < 6; i++) {
        for (k = 0; k < 10; k++) {
            printf(" ");
        }
        for (j = 0; j < 11; j++) {
            printf("* ");
        }
        printf("\n");
    }

    // Lower triangle part
    for (i = 0; i < 12; i++) {
        // Left side spaces
        for (j = 0; j < 10 - i; j++) {
            printf(" ");
        }

        // Left diagonal star
        printf("*");

        // Middle spaces
        for (j = 0; j < 21 + 2 * i; j++) {
            printf(" ");
        }

        // Right diagonal star
        printf("*");

        printf("\n");
    }

    return 0;
}

