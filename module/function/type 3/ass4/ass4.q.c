#include <stdio.h>

void isStrong(int num) {
    int temp, rem, i, fact, sum = 0;
    temp = num;
    while (num != 0) {
        rem = num % 10;
        num = num / 10;
        fact = 1;
        for (i = 1; i <= rem; i++) {
            fact = fact * i;
        }
        sum += fact;
    }
    if (sum == temp) {
        printf("Strong number");
    } else {
        printf("Not Strong number");
    }
}

void main() {
    int num = 145;
    isStrong(num);
}

