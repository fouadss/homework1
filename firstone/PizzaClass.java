package firstone;

public class PizzaClass {

	
	//Create Pizza class and use object,constructor, create methods, use if else, for loop
	// declare variables
	String name;
	String country;
	 String ingredients;
	double price;
	double priceIncrease ;
	// create default constructor
	PizzaClass(){
		
		System.out.println(" this is our pizza class");
		
		
	}
	
	// create paramiterized constructor
	PizzaClass(String name){
		
		this.name=name;
		
		System.out.println(this.name);
		
		
	}
	
	public static void setcountry(String country,String ingredients) {
		
		
		country= country;
		ingredients=ingredients;
		
		
		System.out.println(country+ingredients);
	}
	
		
	public double setPrice(double price) {
		System.out.println("the price is: "+"$"+price);
		price=15.99;
		if(price<15) {
			System.out.println("this pizza's price is affordable");
		}else if(price>15) {
			System.out.println("this pizza is so expensive");
		}else {
			System.out.println("it's your choice  ");
	}
		
		
		
		return price;
		
		
		
}
	
	
	public  void setPrices(double priceIncrease) {
		double price=priceIncrease;
		int[] a= {5,6,8,9};
		
		for(priceIncrease=0;priceIncrease<5;priceIncrease++) {
			
			System.out.println(priceIncrease);
			
		}
		
		
		
	}
	
}
	
	
	

