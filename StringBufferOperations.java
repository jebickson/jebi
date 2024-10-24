import java.util.Scanner;
public class StringBufferOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Get the string input from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        StringBuffer sb =new StringBuffer(input);
        //a)Length of a string
        int length = sb.length();
        System.out.println("Length of the string:"+length);
        //b)Reverse a string
        StringBuffer reversedString = sb.reverse();
        System.out.println("Reversed string:"+reversedString);
        //Restore original string to demonstrate next operation
        sb.reverse();
        //Get the substring to delete from the user
        System.out.println("Enter the substring to delete:");
        String subStringToDelete=scanner.nextLine();
        //c)Delete a substring from the given string
        int start = sb.indexOf(subStringToDelete);
        if (start != -1){
            int end = start + subStringToDelete.length();
            sb.delete(start,end);
            System.out.println("sub after deletion:"+sb);
        }else{
            System.out.println("Substring not found in the strimng.");
        }
        scanner.close();
    }
}
