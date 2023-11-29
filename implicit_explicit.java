package assignments12;

public class implicit_explicit {
	
	    public static void main(String[] args) {

	        int intValue = 10;
	        double doubleValue = intValue; 

	        System.out.println("Implicit Casting:");
	        System.out.println("intValue: " + intValue);
	        System.out.println("doubleValue: " + doubleValue);
	        System.out.println();

	        
	        doubleValue = 15.75;
	        int truncatedValue = (int) doubleValue; 

	        System.out.println("Explicit Casting:");
	        System.out.println("doubleValue: " + doubleValue);
	        System.out.println("truncatedValue: " + truncatedValue);
	    }
	}



