
public class LCSApp {
	static String matrix[][];
	static String string1="abcdefghi";
	static String string2="hefg";
	static int m;
	static int n;
public static void main(String[] args) {
	matrix = new String[string1.length()][string2.length()];
String longest =	longestsub(string1,string2);
System.out.println("Final longest substring : " +  longest);
for (String[] string : matrix) {
	for (String string2 : string) {
		System.out.println(string2);
	}
}

}

private static String longestsub(String str1, String str2) {
	// TODO Auto-generated method stub
	m=str1.length()-1;
	n=str2.length()-1;
	
	if(matrix[m][n]!=null)
		return matrix[m][n];
	if(m==n)
	{
		System.out.println("length equal"+ str1+ str2);
		if(str1.matches(str2))
		{
			System.out.println("str1 : "+str1);
			return str1;
		}
		else
			return "w";
	}
	if(m==1)
		return str1;
	if(n==1)
		return str2;
	//System.out.println(matrix[m][n]+ " "+str1+" "+str2+" "+m+ " "+n);
	String first=longestsub(str1.substring(1),str2);
	System.out.println("first : " +first);
	String second=longestsub(str1,str2.substring(1));
	//System.out.println("second :" + second);
	matrix[m][n]=first.length()>second.length()?first:second;
	return matrix[m][n];
}

}
