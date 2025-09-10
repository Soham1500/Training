// area of rect and perimeter
#include<stdio.h>
int areaofRect(){
	int l,b,area;
	
	printf("enter l and b:");
	scanf("%d%d",&l,&b);
	area=l*b;
	printf("area is : %d\n",area);
	return area;
}
int perimeter(){
	int l,b,peri;
	
	printf("enter l and b:");
	scanf("%d%d",&l,&b);
	peri=2*(l+b);
	printf("peri is : %d",peri);
	return peri;
	
}

int main(){
	areaofRect();
	
	perimeter();
	
}
