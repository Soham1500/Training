//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.

void main(){
int side1,side2,side3;
printf("enter 3 sides of triangle:");
scanf("%d%d%d",&side1,&side2,&side3);
if(side1 && side2 && side3){
	if(side1==side2==side3){
		printf("equilateral triangle");
	}
	if(side1==side2 || side2==side3 ||side3==side1){
		printf("isosceles triangle");
	}
	if(side1!=side2!=side3){
		printf("Scalene triangle");
		
	}
}
else{
	printf("enter proper value");
}
}
