package OJ;

public class InterleavingString {

	public static boolean isInterleave(String s1, String s2, String s3) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(s1.length() + s2.length() != s3.length()) return false;
        return helper(s1.toCharArray(), 0, s2.toCharArray(), 0, s3.toCharArray(), 0);
        
    }
    
    private static boolean helper(char[] s1, int n1, char[] s2, int n2, char[] s3, int n3){
        if(n1 == s1.length && n2 == s2.length && n3 == s3.length) return true;
        if(n1 == s1.length) return (s2[n2] == s2[n3] && helper(s1, n1, s2, n2+1, s3, n3+1));
        if(n2 == s2.length) return (s1[n1] == s3[n3] && helper(s1, n1+1, s2, n2, s3, n3+1));
        
        return (s1[n1] == s3[n3] && helper(s1, n1+1, s2, n2, s3, n3+1)) || (s2[n2] == s3[n3] && helper(s1, n1, s2, n2+1, s3, n3+1));
    }
	public static void main(String[] args) {
		String s1 =  "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
		System.out.println(isInterleave(s1, s2, s3));

	}

}
