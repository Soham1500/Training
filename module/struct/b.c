#include <stdio.h>

// Static function (file-local)
static void helper() {
    printf("File2 helper\n");
}

void callFile2Helper() {
    helper();  // works inside this file
}

