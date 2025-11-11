class Date{
int day , month, yr;
String dow;
void setDay(int dd){
this.day=dd;
}
void setMonth(int m){
this.month=m;
}
void setYr(int y){
this.yr=y;
}
Date(){
this.day=11;
this.month=2;
this.yr=20;
System.out.println("Constructor called ");


}
int getDay(){
return this.day;
}
int getMonth(){return this.month;}

int getYr(){return this.yr;
}

void display(){
System.out.println(this.getDay()+" /" +this.getMonth()+" / "+this.getYr());}
}

class test1{
public static void main(String[] args){

Date d;
//9System.out.println(d);
d=new Date();
//System.out.println(d);
//System.out.printf("%d/%d/%d %s",d.day,d.month,d.yr,d.dow);

//d.day=2;
//d.month=10;
//d.yr=2025;
//d.dow="friday";
//System.out.printf("\n %d/%d/%d %s",d.day,d.month,d.yr,d.dow);

d.setMonth(12);
d.setDay(23);
d.setYr(2025);

System.out.println(d.getDay()+" /" +d.getMonth()+" / "+d.getYr());

Date d2=new Date();
d2.setMonth(2);
d2.setDay(3);
d2.setYr(2011);


d2.display();

if(d.getYr()>d2.getYr()){
System.out.println("d is older");}

}

}