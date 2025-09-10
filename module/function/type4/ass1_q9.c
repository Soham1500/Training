//Write a C program to input the base and height of a triangle and calculate its area.

double area_triangle(int base,int height);

void main(){
	int base,height;
	printf("enter base and height: ");
	scanf("%d%d",&base,&height);
	printf("%.2lf",area_triangle(base,height));
	
}

double area_triangle(int base,int height){
	return 0.5*base*height;
	
}
