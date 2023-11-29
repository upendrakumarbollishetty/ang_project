package assignments12;

// 
	class AccessModifiers {

	    public int publicVar = 10;


	    int defaultVar = 20;


	    protected int protectedVar = 30;


	    private int privateVar = 40;


	    public void publicMethod() {
	        System.out.println("Public method");
	    }


	    void defaultMethod() {
	        System.out.println("Default method");
	    }


	    protected void protectedMethod() {
	        System.out.println("Protected method");
	    }


	    private void privateMethod() {
	        System.out.println("Private method");
	    }
	}


	public class AccessModifiersExample {
	    public static void main(String[] args) {

	        AccessModifiers obj = new AccessModifiers();


	        System.out.println("Public variable: " + obj.publicVar);
	        obj.publicMethod();


	        System.out.println("Default variable: " + obj.defaultVar);
	        obj.defaultMethod();


	        System.out.println("Protected variable: " + obj.protectedVar);
	        obj.protectedMethod();
	        
	        


	    }
	}




