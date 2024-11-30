package Logical_program_pract;

public class CapatlilizeWords {
	public static void main(String[] args) {
        String input = "i am rachi ashtekar";
        String result = "";
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
//            result += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
        	result= result + words[i].substring(0,1).toUpperCase() + words[i].substring(1) + " ";
        }

//       System.out.println(result.trim());
        System.out.println(result);
    }
}
