//Write a C program to input the base and height of a triangle and calculate its area.

void area_triangle(int base,int height);

void main(){
	int base,height;
	printf("enter base and height: ");
	scanf("%d%d",&base,&height);
	area_triangle(base,height);
}

void area_triangle(int base,int height){
	double area=0.5*base*height;
	printf("%.2lf",area);
}
