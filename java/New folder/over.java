class Printer{

void print(){
System.out.println("this is printer method " );
}

void print(int a){

System.out.println(a);
}

void print(char ch){

System.out.println(ch);
}
void print(String name){

System.out.println(name);
}

void print(String n, int a){
System.out.println("hiii")
;}

void print(int a,String n){
System.out.println("hello")
;}

}

class Test{
public static void main(String[] args){
Printer p1=new Printer();
p1.print();
p1.print(10);
p1.print('a');
p1.print("sam");

}}