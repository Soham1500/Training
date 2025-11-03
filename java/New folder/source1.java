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
}
class test1{
public static void main(String[] args){

Date d;
//9System.out.println(d);
d=new Date();
//System.out.println(d);
System.out.printf("%d/%d/%d %s",d.day,d.month,d.yr,d.dow);

//d.day=2;
//d.month=10;
//d.yr=2025;
//d.dow="friday";
//System.out.printf("\n %d/%d/%d %s",d.day,d.month,d.yr,d.dow);

d.setMonth(12);
d.setDay(23);
d.setYr(2025);
System.out.printf("\n %d/%d/%d %s",d.day,d.month,d.yr,d.dow);
}}