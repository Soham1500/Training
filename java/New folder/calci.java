class calci{

void add(int a,float b){
float sum=a+b;
System.out.println("fun1");
System.out.println("sum = " +sum);
}

void add(float a,float b){
float sum=a+b;
System.out.println("fun2");
System.out.println("sum = " +sum);
}

void add(int a,double b){
double sum=a+b;
System.out.println("fun3");
System.out.println("Sum=" +sum);

}

void add(double a,int b){
double sum=a+b;
System.out.println("fun4");
System.out.println("sum ="+sum);

}

void sub(int a,int b){
int sub=a-b;
System.out.println("fun1");
System.out.println("sub = " +sub);
}

void sub(float a,float b){
float sub=a-b;
System.out.println("fun2");
System.out.println("sub = " +sub);
}

void sub(int a,double b){
double sub=a-b;
System.out.println("fun3");
System.out.println("Sub=" +sub);

}

void sub(double a,int b){
double sub=a-b;
System.out.println("fun4");
System.out.println("sub ="+sub);

}
void mul(int a,int b){
int mul=a*b;
System.out.println("fun1");
System.out.println("mul = " +mul);
}

void mul(float a,float b){
float mul=a*b;
System.out.println("fun2");
System.out.println("mul = " +mul);
}

void mul(int a,double b){
double mul=a*b;
System.out.println("fun3");
System.out.println("m =" +mul);

}

void mul(double a,int b){
double mul=a*b;
System.out.println("fun4");
System.out.println("mul ="+mul);

}


void div(int a,int b){
double div=a/b;
System.out.println("fun1");
System.out.println("div = " +div);
}

void div(float a,float b){
float div=a/b;
System.out.println("fun2");
System.out.println("div = " +div);
}

void div(int a,double b){
double div=a/b;
System.out.println("fun3");
System.out.println("div=" +div);

}

void div(double a,int b){
double div=a/b;
System.out.println("fun");
System.out.println("div ="+div);

}
}

class Test{
public static void main(String[] args){
calci c=new calci();
  c.add(12, 12.2f);
        c.add(2.2f, 3.4f);
        c.add(12, 3.5);
        c.add(12.5, 3);

  c.sub(20, 10);
        c.sub(7.5f, 3.2f);
        c.sub(15, 2.5);
        c.sub(12.6, 5);

 c.mul(5, 6);
        c.mul(2.5f, 4.0f);
        c.mul(3, 2.5);
        c.mul(2.5, 3);

 c.div(20, 5);
        c.div(9.0f, 3.0f);
        c.div(10, 4.0);
        c.div(12.0, 3);


}
}