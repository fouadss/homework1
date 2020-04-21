package firstone;

public class ComputerClass {

	// Create Computer class and use object, constructor, create methods, use if
	// else, for loop

	// declare variables
	String brand;
	 double price;
	int memory;
	
	
	// create default constructor
     ComputerClass() {

		System.out.println("this is computer class");

	}

	
	// create constructor with parameter
	ComputerClass(String brand) {
		this.brand = brand;
System.out.println("this computer is ");
	}

	
	
	// create non-return method
	public  void setprice() {
     System.out.println("this is our computer price");
	this.price=2563.254;
	
		for(int a=0;a<4;a++) {
			System.out.println(price);
			if(price<2563.255) {
				System.out.println("this computer is cheap");}else {
					System.out.println("this cmputer is expensive");
				}
		}
	}
	

	// create return method
	public int setmemory(int memory) {
    this.memory= memory;

		return memory;

	}

}
