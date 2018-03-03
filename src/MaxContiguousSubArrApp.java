
public class MaxContiguousSubArrApp {
	
	
	public static int findMCSum(int[] arr, int size){
		
		final int[] maxSumTable = new int[size];
		
		maxSumTable[0]=arr[0]>0?arr[0]:0;
		int curentIndex = 1, startIndex = 0, endIndex = 0;
		
		
		for(int index=1; index<size; index++){
			if(maxSumTable[index-1] + arr[index] > 0){
				
				maxSumTable[index] = maxSumTable[index-1] + arr[index];
				endIndex = index;
				startIndex = curentIndex;
			}
			else{
				maxSumTable[index] =0;
				curentIndex = index +1;
			}
			
		}
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < maxSumTable.length; i++) {
			if(maxSumTable[i] > maxSum){
				endIndex = i;
				maxSum = maxSumTable[i];
			}
			if(maxSumTable[i] == 0){
				startIndex = i+1;
				
			}
		}
		
		System.out.println("startIndex :: "+startIndex + " endIndex:: "+endIndex);
		return maxSum;
	}
	

	public static void main(String[] args) {
		
		int[] arr = {-2,11,-3,-17,13,-5,2,21};
		int xxx = findMCSum(arr, arr.length);
		System.out.println(xxx);
	}

}
