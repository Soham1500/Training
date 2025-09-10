//Accept the age and check if the person is:
//Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above)
#include<stdio.h>

char* age_group(){
	int age;
	printf("enter age :");
	scanf("%d",&age);
	
	if(age<=12){
		return "child";
	}
	else if(age>12 && age<=19){
		return "Teenager";
	}
	else if(age>19 && age<60){
		return "Adult";
	}
	else{
		return "Senior";
	}

}
int main(){
	printf("%s",age_group());
	return 0;
}
