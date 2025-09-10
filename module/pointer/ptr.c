#include <stdio.h>

int main() {
    int a = 10, b = 20, c;
    int *ptr = &a;
    c = *ptr;
    int *p = &b;
    *p = 25;
    p = ptr;
    c = *p;
    int *x = p;
    x = ptr;
    *x = 53;

    printf("a=%d b=%d c=%d *ptr=%d *p=%d *x=%d\n", a, b, c, *ptr, *p, *x);
    printf("ptr=%p p=%p x=%p\n", (void*)ptr, (void*)p, (void*)x);

    return 0;
}

