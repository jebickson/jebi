import java.io.File;
import java.util.Scanner;
public class FileInfo {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = scanner.nextLine();
        scanner.close();
        File file=new File(fileName);
        System.out.println("File Information:");
        System.out.println("Exists:"+file.exists());
        System.out.println("Readable:"+file.canRead());
        System.out.println("Writable:"+file.canWrite());
        if(file.exists())
        {
            String fileType=getFileType(file);
            long fileLength=file.length();
            System.out.println("Type:"+fileType);
            System.out.println("Length(in bytes):"+fileLength);
        }
    }
    private static String getFileType(File file)
    {
        if(file.isDirectory())
        {
             return"Directory";
        }
        else
        {
            String fileName=file.getName();
            int dotIndex = fileName.lastIndexOf('.');
            if(dotIndex>0&&dotIndex<fileName.length()-1)
            {
                return fileName.substring(dotIndex+1).toUpperCase()+"File";
            }
            else
            {
                return"Unknown";
            }
        }
    }
}
