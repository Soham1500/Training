//  Write a C program to find the area of a circle.

double area_of_circle(int r);

void main(){
	int rad;
	printf("enter radius :");
	scanf("%d",&rad);
	printf(area_of_circle(rad));
}

double area_of_circle(int y){
	return 3.14*y*y;
	
}
