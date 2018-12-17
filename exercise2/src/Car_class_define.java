
 
public class Car_class_define {

	 String color;
	 String size; 
	 boolean engineState;
	 void showAtts( ) {
		System.out.println("This car is a " + color + " " +size+ ".");
		if(engineState == true) {
			System.out.println("The engine is on.");
		}
		else {
			System.out.println("The engine is off");
		}
	 }
	 void startEngine() {
		 if(engineState == true) {
			 System.out.println("The engine is alread on. \n");
	 }
	 	else{
		 System.out.println("The engine was started. \n");
	 }
    }
	 void stopEngine() {
		 if(engineState==false)
			 System.out.println("The engine is already off. \n");
		 else {
			 engineState = false;
			 System.out.println("The engine was stopped \n ");
		 }
	 }
	 
	 public static void main(String[] args) {
		Car_class_define myCar = new Car_class_define();
		// myCar.color = "white";
		// myCar.size = "compact";
		// myCar.showAtts();
		// myCar.startEngine();
		// myCar.showAtts();
		// myCar.stopEngine();
		 
		 Car_class_define yourCar = new Car_class_define();
		 yourCar.color = "blue";
		 yourCar.size ="mid-size";
		 yourCar.showAtts();
		 yourCar.startEngine();
		 yourCar.showAtts();
		 yourCar.stopEngine();
	 }
	 
 }
  

