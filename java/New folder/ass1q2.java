


class Triangle{

int base;
int height; double ar;

void area(int b,int h){
this.base=b;
this.height=h;

this.ar=0.5*base*height;
System.out.println("area ="+ar);
}

}

class Rect{
double len;
double bre;
double ar;
void area(double l,double b){
this.len=l;
this.bre=b;
ar=l*b;
System.out.println("area ="+ar);
}
}

class Circle{
int r;double ar;

void area(int r){
this.r=r;
ar=3.14*r*r;

System.out.println("area : "+ar);
}
}

class Shape{
public static void main(String[] args){
Triangle t=new Triangle();
t.area(12,12);

Rect r=new Rect();
r.area(5.0,10.0);

Circle c =new Circle();
c.area(5);

}}
