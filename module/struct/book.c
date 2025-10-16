typedef struct book{
	int bookId;
	char name[30];
	char author[30];
	char category[30];
	char summary[200];
	float price;
	float rating;
}book;

void addNewBook(book*, int*,int );
void display(book*,int);
void removebook(book* ,int*,int);
void searchbook(book* ,int ,char*,int*);
void showAuthorBooks(book*,char*,int*);
void showBooksByCategory(book*,char*,int*);
void updateBook(book* ,int ,int*);
void sortbyasc(book* ,int*);
void sortbydec(book*,int *);
void sortbyrating(book* ,int* );
void sortbyratingdsc(book* ,int* );
void getSummarybyName(book*,int* ,char* );
void sortBysubname(book* , char* ,int* );

static void add_Book(book* );
void main(){
	book* b;
	int totalbook=5;
	int capacity=15;
	b=malloc(capacity*sizeof(book));
	add_Book(b);
	


	while(1){
			printf("\n--- Book Management System ---\n");
printf("1. Add Book\n2. Remove Book\n3. Search Book\n4. Show Author's Books\n5. Show Category's Books\n6. Update Book Data\n7. Display Sorted Books\n8. Display All Books\n9. Summary \n 10.Exit \n");
printf("Enter your choice: ");
	
	
	
	int choice;

	scanf("%d",&choice);
	
	
	switch(choice){
		case 1:
			addNewBook( b ,&totalbook,capacity);
			break;
			
		case 2:
		//remove book
		 {
    int id;
    printf("Enter book ID to remove: ");
    scanf("%d", &id);
    removebook(b, &totalbook, id);
    break;
}
		
		case 3:
						// Search Book 
		{
		
		int id;
		char name[30];
		printf("enter id of book : ");
		scanf("%d",&id);
		printf("enter name of book : ");
		scanf(" %[^\n]",name);
		searchbook(b,id,name,&totalbook);
		
		break;
	}
		case 4:
					//Show Author's Books
					{
					char name[30];
					printf("enter name of author :");
					scanf(" %[^\n]",name);
					showAuthorBooks(b, name,&totalbook);
			break;}
			case 5:
		//show Category's Books
			{
					char cat_name[30];int i=0;
				
						printf("enter category : ");
					
					scanf(" %[^\n]",cat_name);
					showBooksByCategory(b, cat_name,&totalbook);
			break;}
		case 6:
			//Update Book Data
			{
			int id;
			printf("enter id of book :");
			scanf("%d",&id);
		updateBook(b,id,&totalbook);
		}
			break;
			
			
			case 7:
			// Display Sorted Books
		{
				int value,value2;
			printf("enter sort by \n 1 price \n 2 rating ");
			scanf("%d",&value);
			printf("enter sorting order \n 1. Ascending \n 2.Descending ");
			scanf("%d",&value2);
			if(value==1 && value2==1){
			
			sortbyasc(b,&totalbook);
		}
		if(value==1 && value2==2){
		
			sortbydec(b,&totalbook);
									}
									
		if(value==2 && value2==1){
			sortbyrating(b,&totalbook);
		}
		
		if(value==2 && value2==2){
			sortbyratingdsc(b,&totalbook);
		}
									
									
			break;
		}
			
			case 8:
					display(b,totalbook);
				break;
				
				case 9:{
					char name[20];
					printf("enter book name :");
					scanf(" %[^\n]",name);
					getSummarybyName(b,&totalbook,name);
					
					break;
				}
				
			case 10:
				printf("sub name ");
				sortBysubname(b,"the",&totalbook);
				break;
				
					
				case 11:
					return;
					break;
					default:
						printf("enter valid choice :");
						
						

			
	}
	
	

}
free(b);

}

void addNewBook(book* b,int* totalbook,int capacity){
	if(*totalbook<capacity){

		printf(" enter book id : ");
		scanf("%d",&b[*totalbook].bookId);
		printf("\n enter name : ");
		scanf(" %[^\n]",b[*totalbook].name);
		printf(" \n enter author name : ");
		scanf(" %[^\n]",b[*totalbook].author);
		printf("\n enter category : ");
		scanf(" %[^\n]",b[*totalbook].category);
		printf(" \n enter price :");
		scanf("%f",&b[*totalbook].price);
		printf("\n enter rating from 5 :");
		scanf("%f",&b[*totalbook].rating);
		printf("Enter summary: ");
		scanf(" %[^\n]", b[*totalbook].summary);
		(*totalbook)++;
		
		
	}
}


void sortbyasc(book* b,int* totalbook){

int i=0,j;
for(i=0;i<(*totalbook);i++){
	for(j=i+1;j<(*totalbook);j++){
		if(b[i].price>b[j].price){
		book temp = b[i];
b[i] = b[j];
b[j] = temp;

		}
	}
}
display(b,*totalbook);
	
}
void sortbydec(book* b,int* totalbook){
	int i=0,j;
	book temp;
	for(i=0;i<(*totalbook);i++){
		for(j=i+1;j<(*totalbook);j++){
			if(b[i].price<b[j].price){
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
	}
	display(b,*totalbook);
}

void sortbyrating(book* b,int* totalbook){
	int i=0,j;
	book temp;
	for(i=0;i<(*totalbook);i++){
		for(j=i+1;j<(*totalbook);j++){
			if(b[i].rating>b[j].rating){
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
				
			}
		}
	}
	display(b,*totalbook);
}

void sortbyratingdsc(book*b ,int* totalbook ){
		int i=0,j;
	book temp;
	for(i=0;i<(*totalbook);i++){
		for(j=i+1;j<(*totalbook);j++){
			if(b[i].rating<b[j].rating){
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
				
			}
		}
	}
	display(b,*totalbook);
}




void searchbook(book* b ,int id,char* name,int* totalbook){
	int i=0;
	for(i=0;i<(*totalbook);i++){
		if(b[i].bookId==id && strcmp(name,b[i].name)==0){
				printf(" \n \n no of book %d",i+1);
		printf("\n Book-id : %d ",b[i].bookId);
		printf("\n Book-name : %s",b[i].name);
		printf("\n Book-author : %s",b[i].author);
		printf("\n Book-Categoy : %s",b[i].category);
		printf("\n Book-Price : %.1f",b[i].price);
		printf("\n Book-rating : %.1f",b[i].rating);
		return;
		}
		
	}
	printf("not found ");
}
void showBooksByCategory(book* b,char* cat_name ,int* totalbook){

int i=0;
	for(i=0;i<(*totalbook);i++){
	
	if(strcmp(cat_name,b[i].category)==0){
			printf(" \n \n no of book %d",i);
		printf("\n Book-id : %d ",b[i].bookId);
		printf("\n Book-name : %s",b[i].name);
		printf("\n Book-author : %s",b[i].author);
		printf("\n Book-Categoy : %s",b[i].category);
		printf("\n Book-Price : %.1f",b[i].price);
		printf("\n Book-rating : %.1f",b[i].rating);
	}
}}
void showAuthorBooks(book* b,char* name,int* totalbook){
	int i=0;
	for(i=0;i<(*totalbook);i++){
	
	if(strcmp(name,b[i].author)==0){
			printf(" \n \n no of book %d",i+1);
		printf("\n Book-id : %d ",b[i].bookId);
		printf("\n Book-name : %s",b[i].name);
		printf("\n Book-author : %s",b[i].author);
		printf("\n Book-Categoy : %s",b[i].category);
		printf("\n Book-Price : %.1f",b[i].price);
		printf("\n Book-rating : %.1f",b[i].rating);
	}
}
}

void display(book *b,int totalbook){
	
	int i;
	for(i=0;i<totalbook;i++){
		if(b[i].bookId!=0 && b[i].bookId>0 && b[i].name[0]!='\0'){
		printf(" \n \n no of book %d",i+1);
		printf("\n Book-id : %d ",b[i].bookId);
		printf("\n Book-name : %s",b[i].name);
		printf("\n Book-author : %s",b[i].author);
		printf("\n Book-Categoy : %s",b[i].category);
		printf("\n Book-Price : %.1f",b[i].price);
		printf("\n Book-rating : %.1f",b[i].rating);
	}
		
	}
	
}
void updateBook(book* b ,int id,int* totalbook){
int i=0;
	for(i=0;i<(*totalbook);i++){
				if(b[i].bookId==id){
					printf("select things you want  to update :");
					printf("\n 1: name ");
					printf("\n 2: author  ");
					printf("\n 3: category");
					printf("\n 4: price");
					printf("\n 5: rating");
						printf("\n 6: Summary");
					printf("\n 7: exit");
					while(1){
						int choice ;
						printf("enter your choice : ");
						scanf("%d",&choice);
						switch(choice){
						
				case 1:
                printf("Enter new name: ");
                scanf(" %[^\n]", b[i].name);
                break;
            case 2:
                printf("Enter new author: ");
                scanf(" %[^\n]", b[i].author);
               
                break;
            case 3:
                printf("Enter new category: ");
                scanf(" %[^\n]", b[i].category);
                
                break;
            case 4:
                printf("Enter new price: ");
                scanf("%f", &b[i].price);
                
                break;
            case 5:
                printf("Enter new rating: ");
                scanf("%f", &b[i].rating);
            
                break;
                case 6:
                printf("Enter new rating: ");
                scanf(" %[^\n]", &b[i].summary);
            
                break;
            case 7:
               return ;
               break;
            default:
                printf("Invalid choice. Try again.\n");
                break;
        }}
					}
				}
}
void removebook(book* b, int* totalbook, int id) {
    int found = 0,i,j;
    for ( i = 0; i < *totalbook; i++) {
        if (b[i].bookId == id) {
            found = 1;
           
            for ( j = i; j < *totalbook - 1; j++) {
                b[j] = b[j + 1];
            }
            (*totalbook)--;
            printf("? Book with ID %d removed successfully.\n", id);
            break;
        }
    }

    if (!found) {
        printf("? Book with ID %d not found.\n", id);
    }
}

void getSummarybyName(book* b,int* totalbook,char* name){
	int i;
	for(i=0;i<(*totalbook);i++){
		if(strcmp(b[i].name,name)==0){
			printf(" %s ",b[i].summary);
			return;
		}
	}
}


void sortBysubname(book* b, char* name, int* totalbooks) {
    int i, found = 0;
    for (i = 0; i < *totalbooks; i++) {
        if (strstr(b[i].name, name)) {
            printf("\nBook ID: %d", b[i].bookId);
            printf("\nBook name: %s", b[i].name);
           
            found = 1;
        }
    }

    if (!found) {
        printf("\nNo books found containing '%s' in name.\n", name);
    }
}





   static void add_Book(book* b) {
    b[0].bookId = 1;
    strcpy(b[0].name, "Atomic Habits");
    strcpy(b[0].author, "James Clear");
    strcpy(b[0].category, "Personal Development");
    strncpy(b[0].summary,
        "Atomic Habits is a guide with practical strategies for forming good habits, "
        "breaking bad ones, and mastering behaviors that lead to results.",
        199);
    b[0].summary[199] = '\0';
    b[0].price = 139;
    b[0].rating = 4.9;

    b[1].bookId = 2;
    strcpy(b[1].name, "The Psychology of Money");
    strcpy(b[1].author, "Morgan Housel");
    strcpy(b[1].category, "Personal Finance");
    strncpy(b[1].summary,
        "Explores how people perceive money and how that shapes financial decisions, "
        "blending storytelling with behavioral finance insights.",
        199);
    b[1].summary[199] = '\0';
    b[1].price = 260;
    b[1].rating = 4.8;

    b[2].bookId = 3;
    strcpy(b[2].name, "The Power of Your Subconscious Mind");
    strcpy(b[2].author, "Joseph Murphy");
    strcpy(b[2].category, "Self-Help / Spiritual");
    strncpy(b[2].summary,
        "A timeless self-help book exploring the subconscious mind’s potential to shape reality, health, ",
        199);
    b[2].summary[199] = '\0';
    b[2].price = 99;
    b[2].rating = 4.9;

    b[3].bookId = 4;
    strcpy(b[3].name, "Ikigai: The Japanese Secret to a Long & Happy Life");
    strcpy(b[3].author, "Héctor García & Francesc Miralles");
    strcpy(b[3].category, "Philosophy / Self-Help");
    strncpy(b[3].summary,
        "Ikigai explains how aligning life with passions, mission, vocation, and profession leads to balance and fulfillment.",
        199);
    b[3].summary[199] = '\0';
    b[3].price = 95;
    b[3].rating = 4.8;

    b[4].bookId = 5;
    strcpy(b[4].name, "Can We Be Strangers Again?");
    strcpy(b[4].author, "Sudeep Nagarkar");
    strcpy(b[4].category, "Fiction / Romance");
    strncpy(b[4].summary,
        "A heartfelt novel exploring love, heartbreak, healing, and second chances through rich characters and storytelling.",
        199);
    b[4].summary[199] = '\0';
    b[4].price = 101;
    b[4].rating = 5.0;
}


