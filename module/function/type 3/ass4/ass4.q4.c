#include <stdio.h>

void isarmstrong(int num) {
    int rem, sum = 0;
    int no = num;
    while (num != 0) {
        rem = num % 10;
        num = num / 10;
        sum += rem * rem * rem;
    }
    if (no == sum) {
        printf("it is armstrong");
    } else {
        printf("it is not armstrong");
    }
}

void main() {
    int num = 153;
    isarmstrong(num);
}

