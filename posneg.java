import java.util.*;
public class posneg
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        int i,count=0,count1=0;
        for(i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
            if(a[i]>0)
            {
                count++;
            }
        else
        {
            count1++;
        
        }
        }
        System.out.println(count);
        System.out.println(count1);
}
}

