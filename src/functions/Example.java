package functions;

public class Example {
	static final String key = get();
	
	final String lock;
	
	
	
	public Example(){
		lock = "pqr";
	}
	
	static{
		//key = "abc";
	}
	
	static String get(){
		return  "";
	}

}

 interface type{
	 default public void get(){
		 System.out.println("arv");
	 }
	
}
 
 class A implements type{
	 @Override
	 public void get(){
		 
	 }
 }
