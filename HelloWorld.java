

public class HelloWorld {

	public static void main(String[] args) {
		
		
	if(args.length==0) {
			System.out.println("Hello World");
		}else if(args.length==1) {
			System.out.println("Hello World My name is "+args[0]);
		}else if(args.length==2) {
			System.out.println("Hello World My name is "+args[0]+" I live in " +args[1]);
		}else if(args.length==3) {
			System.out.println("Hello World My name is "+args[0]+" I live in " +args[1]+ " And I am "+args[2]+" years old");
		}        
	    
	    

	}

}
