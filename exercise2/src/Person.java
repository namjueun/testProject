

public class Person {
 String name;
 int age;
 Person(){
	 name = "Tom";
	 age = 10;
 }
 Person(String n, int a){
	 name = n;
	 age = a;
 }
  public static void main(String args[]) {
	  Person J,T;
	  T = new Person();
	  System.out.println("이름: " + T.name+ ", 나이: " + T.age);
	  J= new Person("Julie", 19);
	  System.out.println("이름: " + J.name+ ", 나이: " + J.age);
  }
}
