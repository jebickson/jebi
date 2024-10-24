import java.io.*;
public class ExceptionDemo{
public static void main(String[] args)
{
try
{
int result = 10/0; 
}
catch (ArithmeticException e)
{
System.out.println("ArithmeticException caught: attempt to didide by zero");
e.printStackTrace();
}
try
{
String str = "abc";
int num = Integer.parseInt(str);
}
catch (NumberFormatException e)
{
System.out.println("NumberFormatException caught: Intput is not a valid integer");
e.printStackTrace();
}
try{
int[] arr = new int[5];
arr[10] = 50;
}
catch (ArrayIndexOutOfBoundsException e)
{
System.out.println("Arrayindexoutofboundsexception caught: index is out of bounds");
e.printStackTrace();
}
try
{
int[] negativeArray = new int[-5]; // Creating an array with negative size
}
catch (NegativeArraySizeException e)
{
System.out.println("NegativeArraySizeException caught: Cannot create an array with negative size");
e.printStackTrace();
}
}
}
