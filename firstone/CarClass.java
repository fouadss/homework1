package firstone;

public class CarClass {

	
	
	//Create Car class and use object, constructor, create methods, use if else, for loop
	
	String brand;
	int model;
	double price;
	
	// create default constructor
	
	CarClass(){
		System.out.println("this is car class ");
		
	}
	
	// create parameterized constructor
	CarClass(String brand){
		
	}
	// create non-return method
	public void setModel() {
		
		
	}
	// create return method
	public double setPrice(double price) {
		this.price= price;
		
		for(int a=2; a<5; a++) {
			System.out.println(price);
			if(price<4563.253) {
				System.out.println(" the price is affordable");
			}else {
				System.out.println("the price is high");
			}
		}
		
		
		System.out.println(price);
		return price;
		
	}
	public static void main(String[] args) {
		CarClass s3= new CarClass();
		CarClass s4 = new CarClass();
		s4.setPrice(58684.2354);
		
	}
}
