import java.util.Arrays;

public class LongestCommonSubSequence {
	
	public static int[][] longCommonSubSeqInternal(char[] str1, char[] str2){
		
		int len1 = str1.length;
		int len2 = str2.length;
		
		int[][] M = new int[len1+1][len2+1];
		
		for (int i = len1-1; i >= 0; i--) {
			
			for (int j = len2 - 1; j >= 0; j--) {

				M[i][j] = M[i + 1][j + 1];
				if (str1[i] == str2[j]) {
					M[i][j]++;
				}

				if (M[i][j + 1] > M[i][j])
					M[i][j] = M[i][j + 1];
				if (M[i + 1][j] > M[i][j])
					M[i][j] = M[i + 1][j];
			}
			
		} 
		return M;
		
	}
	
	public static int[][] longCommonSubSeq(char[] str1, char[] str2){
		
		int len1 = str1.length;
		int len2 = str2.length;
		
		int[][] M = new int[len1+1][len2+1];
		
		for (int i = 0; i <= len1; i++) {
			
			for (int j = 0; j <= len2; j++) {
				
				if( i==0 || j==0){
					
					 M[i][j] =0;
				}
				else if(str1[i-1] == str2[j-1]){
					M[i][j] = M[i-1][j-1] + 1;
				}
				else{
					M[i][j] = Math.max(M[i][j-1], M[i-1][j]);
				}
			}
			
		}
		return M;
		
	}
	
	public static void findSubSeq(String s1, String s2){
		int[][] lonSeq = longCommonSubSeqInternal(s1.toCharArray(), s2.toCharArray());
		
		System.out.println("max sub string :: "+lonSeq[0][0]);
	}
	
	public static void main(String[] args) {
		findSubSeq("abcdfrab","cdftyrabx");
		
	}

}
