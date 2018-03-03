import java.util.Random;

public class GarbageCollectionDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		int arraySize = 1000000;
		
		GCMe[] gems = new GCMe[arraySize];
		int count =0;
		Random rnd = new Random();
		while(true){
			gems[rnd.nextInt(arraySize)] = new GCMe();
			if(count % 1000000 == 0){
				System.out.print(".");
			}
			count ++;
			//Thread.sleep(1);
		}
		
	}
	

}

class GCMe{
	long a;
	long aa;
	long aaa;
	long aaaa;
	long aaaaa;
	long aaaaaa;
	long aaaaaaa;
	long aaaaaaaa;
	long aaaaaaaaaa;
	long aaaaaaaaaaa;
	long aaaaaaaaaaaa;
	long aaaaaaaaaaaaa;
	long aaaaaaaaaaaaaa;
	long aaaaaaaaaaaaaaa;
	long aaaaaaaaaaaaaaaa;
	long aaaaaaaaaaaaaaaaa;
}
