class Distance{
int km,m,total;

void inKm(int k){
this.km=k;
}

void inM(int meter){
this.m=meter;
}

void totalDisInM(){
total=km*1000+m;
}
}

class Test{
public static void main(String[] args){

Distance d=new Distance();
d.inKm(8);
d.inM(200);
d.totalDisInM();
System.out.println(d.km+ " " +d.m+" "+d.total);
}}