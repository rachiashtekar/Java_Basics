package Logical_program_pract;
//
//public class SimpleStringCompression {
//	
//	public static void main(String[] args) {
//        String input = "AAB BBBC";
//        String[] words = input.split(" "); // Split the input string into words
//        String result = ""; // Initialize the result string
//
//        for (int i = 0; i < words.length; i++) {
//            char firstChar = words[i].charAt(0); // Get the first character
//            int count = 0; // Initialize count for occurrences of the first character
//            
//            // Count occurrences of the first character
//            for (int j = 0; j < words[i].length(); j++) {
//                if (words[i].charAt(j) == firstChar) {
//                    count++; // Increment count if the character matches
//                }
//            }
//            
//            // Build the result
//            result += count + words[i].substring(1) + " "; 
//        }
//
//        System.out.println(result.trim()); // Print the final result
//    }
//	}
//
//
public class SimpleStringCompression {
    public static void main(String[] args) {
        String input = "AAB BBBC";
        String[] words = input.split(" "); // Split the input string into words
        String result = ""; // Initialize the result string

        for (int i = 0; i < words.length; i++) {
            char firstChar = words[i].charAt(0); // Get the first character
            int count = 0; // Initialize count for occurrences of the first character
            
            // Count occurrences of the first character
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == firstChar) {
                    count++; // Increment count if the character matches
                }
            }
            
            // Build the result by appending count and the rest of the word (excluding first character)
            result += count + words[i].substring(1) + " "; 
        }

        System.out.println(result.trim()); // Print the final result
    }
}
