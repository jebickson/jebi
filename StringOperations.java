import java.net.SocketPermission;
import java.util.Scanner;
public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String Concatenation
        System.out.println("Enter the first string for conctenation:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string for concatenation:");
        String str2 =scanner.nextLine();
        String concatenatedString=str1.concat(str2);
        System.out.println("concatenated String:"+concatenatedString);
        //Search a substring
        System.out.println("\nEnter a string to search:");
        String searchstring = scanner.nextLine();
        if(concatenatedString.contains(searchstring))
        {
            System.out.println("Substring'"+ searchstring+"'found in the concatenated string.");
        }
        else
        {
            System.out.println("Substring'"+searchstring+"'not found in the concatenated string.");
            //Extraxt substring
            System.out.println("\nEnter the starting index to extract substring:");
            int startIndex=scanner.nextInt();
            System.out.println("Enter the ending index to extract substring:");
            int endIndex=scanner.nextInt();
            if(startIndex >=0 && startIndex<endIndex && endIndex <=concatenatedString.length())
            {
                String extractedSubString= concatenatedString.substring(startIndex, endIndex);
                System.out.println("Extracted substring:"+extractedSubString);
            }
            else{
                    System.out.println("Invalid indices provided.Extraction failed.");
            }
            scanner.close();
        }
    }
}
