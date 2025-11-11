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

int getinKM(){
return this.km;
}

int getM(){
return this.m;
}

int getTotal(){
return this.total;
}

void display(){
System.out.println("km="+this.getinKM()+" m= "+this.getM()+" total in m = "+this.getTotal());

}

Distance(){
this.km=10;
this.m=200;
this.total=km*1000+m;
System.out.println("km="+this.km+" m= "+this.m+" total in m = "+this.total);
}
Distance(int k,int mm){
this.km=k;
this.m=mm;
this.total=km*1000+m;
System.out.println(this.km+" "+this.m+" "+this.total);

}
}


class Test{
public static void main(String[] args){

Distance d=new Distance();
d.inKm(8);
d.inM(200);
d.totalDisInM();
d.display();


Distance d2=new Distance(10,300);
}}