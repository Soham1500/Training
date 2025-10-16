#include <stdio.h>

// Static function (file-local)
static void helper() {
    printf("File1 helper\n");
}

void callFile1Helper() {
    helper();  // works inside this file
}
	
