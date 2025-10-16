// main.c
#include <stdio.h>

// Declarations of functions from file1.c and file2.c
void callFile1Helper();
void callFile2Helper();

int main() {
    callFile1Helper();  // prints: File1 helper
    callFile2Helper();  // prints: File2 helper
    return 0;
}

