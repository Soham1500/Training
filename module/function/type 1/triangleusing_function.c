// Accept three sides of a triangle from the user and determine whether the triangle is
// equilateral, isosceles, or scalene.

void main(){
	triangle();
	
}
	void triangle(){
		int n1=10,n2=20,n3=10;
		if(n1==n2==n3){
			printf("equilateral triangle ");
		}
		else if(n1==n2 || n2==n3 || n1==n3){
			printf("isoscales triangle");
		}
		else{
			printf("scalene triangle");
		}
	}

