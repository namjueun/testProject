

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
	  System.out.println("�̸�: " + T.name+ ", ����: " + T.age);
	  J= new Person("Julie", 19);
	  System.out.println("�̸�: " + J.name+ ", ����: " + J.age);
  }
}
