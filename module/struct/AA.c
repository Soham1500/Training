#include <stdio.h>

// Declarations of functions from File1.c and File2.c
void callFile1Helper();
void callFile2Helper();

int main() {
    callFile1Helper();  // prints: File1 helper
    callFile2Helper();  // prints: File2 helper
    return 0;
}

