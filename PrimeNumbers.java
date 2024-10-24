import java.io.*;
class PrimeNumbers
{
    public static void main(String[]args) throws IOException
    {
        int n;
        int p;
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("Enter a number:");
        n=Integer.parseInt(br.readLine());
        for(int i=2;i<n;i++)
        {
            p=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                p=1;
            }
            if(p==0)
            System.out.println(i);
        }

    }
}