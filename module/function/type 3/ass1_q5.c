//Write a C program to input five numbers and find their average.

void avg(int ,int ,int ,int ,int);

void main(){
	int a,b,c,d,e;
	printf("enter nos: ");
	scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
	avg(a,b,c,d,e);
}

void avg(int z,int y ,int x,int v,int u){
	float aver=(z+y+x+v+u)/5;
	printf("%.1f",aver);
}
