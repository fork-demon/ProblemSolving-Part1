import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;

public class LongestSubString {
	
	
	public static void printCommonSubString(char[] content, char[] subStr){
		
		int smallLength = subStr.length;
		int biggerLength = content.length;
		char[] tmpContent = Arrays.copyOf(content, biggerLength+2);
		char[] tmpSubStr = Arrays.copyOf(subStr, smallLength+2);
		
		int Max=0;
		int localMax =0;
		
		for(int i=0,k=0;i<biggerLength&& k<smallLength; ){
			
			if(tmpContent[i] == tmpSubStr[k]){
				
				localMax++;
				if(localMax > Max){
					Max = localMax;
					
				}
				i++;
				k++;
				
				continue;
			}
			else{
				localMax =0;
				if(tmpContent[i+1] == tmpSubStr[k]){
					i++;
				}else if(tmpContent[i] == tmpSubStr[k+1]){
					k++;
				}
				else{
					i++;
					
				}
				
			}
		}
		System.out.println(Max);
		
		
	}
	public static void main(String[] args) {
		printCommonSubString("abvcdef".toCharArray(), "abcdef".toCharArray());
		List<GarbageCollectorMXBean> list = ManagementFactory.getGarbageCollectorMXBeans();
		
		for(GarbageCollectorMXBean bean : list){
			
			System.out.println("Name :: "+bean.getName());
			System.out.println("Number of collection :: "+bean.getCollectionCount());
			System.out.println("Collection time :: "+bean.getCollectionTime());
			System.out.println("pool names ::");
			
			for (String name : bean.getMemoryPoolNames()) {
				System.out.println("\t"+ name);
			}
			System.out.println();
		}
	}

}
