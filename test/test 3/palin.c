//#include <string.h>
//void main(){
//	char str[]="abcba";
//	char pqr[20];
//	strcpy(pqr,str);
////	printf("%d \n",strlen(str));
////	printf("%s \n",strupr(str));
////	printf("%s \n",strlwr(str));
////	strrev(str);
////	strncpy(str,pqr,3);
////	 
////	printf("%s ",str);
//////	strcat(str,pqr);
////	printf("%s",str);
////if(strcmp(str,pqr)==0){
////	printf("palindrone");
////}
////else{
////	printf("not palindrone");
////}
//
//int result=strncmp(str,pqr,3);
//printf
//}
//
//#include <stdio.h>
#include <string.h>
//
//int main() {
//    char str[] = "hello";
//    char *ptr = strrchr(str, 'l');
//    if(ptr != NULL) printf("Last occurrence of 'l': %s\n", ptr);
//    else printf("Character not found\n");
//    return 0;
////}
//
//#include <stdio.h>
//#include <string.h>
//
//int main() {
//    char str[] = "hello";
//    char *ptr = strstr(str, "lo");
//    if(ptr != NULL) printf("Substring found: %s\n", ptr);
//    else printf("Substring not found\n");
//    return 0;
//}
//
//
//void main(){
//	char str[]="h,e,l,l,o";
//	char* str1=strtok(str,",");
//	while(str1!=NULL){
//		printf("%s \n",str1);
//		strtok(NULL,);
//	}
//}
//
//#include <stdio.h>
//#include <string.h>
//
//int main() {
//    char str[] = "hello";
//    char *ptr = strstr(str, "lo");
//    if(ptr != NULL) printf("Substring found: %s\n", ptr);
//    else printf("Substring not found\n");
//    return 0;
//}


void main(){
	char* str="Ksoj@gmail.com";
	char* res=strstr(str,"@gmail.com");
	printf("%s ",res);
	}
