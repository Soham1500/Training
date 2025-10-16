
typedef struct mob{
	int mid;
	char mname[15];
	float price;
	char brand[15];
} mob;

void accept(mob* m, int index);
void display(mob* m, int totalsize);

void main(){
	int totalsize = 10;
	int current = 0;
	mob* m = malloc(totalsize * sizeof(mob));
	
	while(1){
		int n;
		printf("Enter 1 to accept details\nEnter 2 to display details\nEnter 3 to exit: ");
		scanf("%d", &n);

		if(n == 1){
			if(current < totalsize){
				accept(m, current);
				current++;
			}else{
				printf("Array full!\n");
			}
		}
		else if(n == 2){
			display(m, current);
		}
		else{
			break;
		}
	}

	free(m);
}

void accept(mob* m, int index){
	printf("Enter mobile id: ");
	scanf("%d", &m[index].mid);

	printf("Enter name: ");
	scanf("%s", m[index].mname);

	printf("Enter price: ");
	scanf("%f", &m[index].price);

	printf("Enter brand: ");
	scanf("%s", m[index].brand);
}

void display(mob* m, int totalsize){
	int i=0;
	for(i = 0; i < totalsize; i++){
		printf("\nMobile ID: %d\n", m[i].mid);
		printf("Name: %s\n", m[i].mname);
		printf("Price: %.2f\n", m[i].price);
		printf("Brand: %s\n", m[i].brand);
	}
}

