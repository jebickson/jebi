import java.util.Scanner;
public class StringManipulation
{
public static void main(String[]args)
{
Scanner scanner = new Scanner(System.in);
//Input the first string
System.out.println("Enter the first string:");
String input1= scanner. nextLine();
char[] String1=input1.toCharArray();
//a) String length
int length1=stringLength(String1);
System.out.println("Length of the first string:"+length1);
//b) Finding a character at a particular position
System.out.println("Enter the position to find the character (0-based index):");
int position = scanner.nextInt();
scanner.nextLine(); // consume newline
if(position>=0 && position < length1)
{
char character = charAt(String1,position);
System.out.println("Character at position "+position+":"+character);
}
else
{
System.out.println("Position out of bounds.");
}
// Input the second string 
System.out.println("Enter the second string:");
String input2=scanner.nextLine();
char[] string2=input2.toCharArray();
// c) Concatenating two strings
char[]concatenatedString=concatenate(String1,string2);
System.out.println("concatenated String:"+new String(concatenatedString));
scanner.close();
}
// Method to calculate the length of the character array 
public static int stringLength(char[]string)
{
int length=0;
for (char c : string)
{
length++;
}
return length;
}
// Method to find the character at a particular position
public static char charAt(char[] string, int position)
{
return string[position];
}
// Method to concatenate two character arrays
public static char[] concatenate(char[] String1,char[]string2)
{
int length1=stringLength(String1);
int length2=stringLength(string2);
char[]result=new char[length1+length2];
for (int i=0; i<length1; i++)
{
result[i]=String1[i];
}
for (int i=0; i<length2; i++)
{
result[length1+i]=string2[i];
}
return result;
}
}
