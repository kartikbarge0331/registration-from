//print the following pattern
//12345
//12345
//12345
//12345

import javax.swing.*;

class b
{
    public static void main(String[] args)
     {
        for(int n=1;n<=5;n++)
        {
            for(int i=1;i<=5;i++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}