package firstone;

public class MobileClass {
 
	
	//Create Mobile class and use object, constructor, create methods, use if else, for loop
	
	// declare variables
	String brand;
	int model;
	double price;
	
	// create constructor
	
	MobileClass(){
		
		System.out.println("this is my mobile class");
	}
	// create parameterized constructor
	MobileClass(String brand){
		this.brand=brand;
		System.out.println(brand);
		
	}
	// create non return method
	public void setPrice() {
		System.out.println("this is mobile price");
		this.price = 1200.23;
		for(int a=0;a<5;a++) {
			System.out.println(price);
			if(price>2000.25) {
				System.out.println("this mobile is so expensive");
			}else if(price<1100.35) {
				System.out.println("this mobile price is good");
			}
		}
		
		
	}
	// create return method
	public int setmodel(int model) {
		
		System.out.println("this mobile is made in "+model);
		return model;
	}
public static void main(String[] args) {
	MobileClass obj5 = new MobileClass();
	MobileClass obj6 = new MobileClass("samsung");
	obj5.setmodel(2011);
	obj5.setPrice();
	
}
	
	
}
