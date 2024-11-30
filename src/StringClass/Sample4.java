package StringClass;

public class Sample4 {
	public static void main(String[] args) {
		String s1="velocity";
		String s2="abcd";
		String s3="xyz";
		String s4=" abc  xyz ";
		String s5="my name is abc";
		String s6="rachi";
		
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1, 5));
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2).concat(s3).concat(s6));
		System.out.println(s4.trim());
		System.out.println(s5.replace("abc", "xyz"));
	}

}
