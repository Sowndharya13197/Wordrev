import java.io.*;
import java.util.Scanner;
public class Wordrev {
    public static void main(String args[])
    {Scanner s=new Scanner(System.in);
    int i;
    
        String str[]=new String[100];
        int n=s.nextInt();
        for(i=0;i<n;i++)
        {str[i]=s.next();
    }
        for(i=n-1;i>=0;i--)
        {System.out.print(" "+str[i]);
    
}}}
