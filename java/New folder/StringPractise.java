class Source{
public static void main(String[] args){
String s="abcdeF";
System.out.println(s);
System.out.println(s.charAt(2));
System.out.println(s.substring(1,3));
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s.indexOf('a')+1);
System.out.println(s.replace('o','a'));
String b="abcdef";
System.out.println(s.equals(b));
System.out.println(s.equalsIgnoreCase(b));
System.out.println(s.compareTo(b));


}
}