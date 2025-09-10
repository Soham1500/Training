//Write a C program to input five numbers and find their average.

float avg(int ,int ,int ,int ,int);

void main(){
	int a,b,c,d,e;
	printf("enter nos: ");
	scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
	printf("%f",avg(a,b,c,d,e));
}

float avg(int z,int y ,int x,int v,int u){
	return (z+y+x+v+u)/5;

}
