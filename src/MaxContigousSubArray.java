
public class MaxContigousSubArray {
	
	public static void printMaxSumSubarray(int[] arr, int len){
		
		int[] _sum = new int[len];
			_sum[0] = arr[0]>0?arr[0]:0;
			int currIndex =0,startIndex,endIndex;
		
			for(int i=1;i<len;i++){
				
				if(_sum[i-1] + arr[i] > 0){
					_sum[i] = _sum[i-1] + arr[i];
					endIndex = i;
					startIndex = currIndex;
				}
				else{
					_sum[i] = 0;
					currIndex = i+1;
				}
					
			}
			int maxSum =0;
			for (int i : _sum) {
				if(i > maxSum){
					maxSum = i;
				}
			}
			
			System.out.println("max sum:: "+maxSum);
		
	}

}
