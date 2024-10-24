import java.io.*;
public class NumberPrinting
{ 
    public static void main(String[] args)
    {
        Thread thread1 = new Thread (new NumberPrinter(1, 10));
        Thread thread2 = new Thread (new NumberPrinter(90, 100));
        thread1.start();
        thread2.start();
    }
    static class NumberPrinter implements Runnable
    {
        private int start;
        private int end;
        public NumberPrinter ( int Start, int end)
        {
            this.start = start;
            this.end = end;
        }
        
        
            public void run()
            {
                printNumbers();
            }
            private void printNumbers()
            {
                for (int i = start; i <= end; i++)
                {
                    System.out.println(Thread.currentThread().getName() + ":"+i);
                    
                    try
                    {
                        Thread.sleep(500); // Adding delay forbetter visualization
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }
}
