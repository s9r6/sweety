
import java.util.*;
public class sss
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int num[]=new int[n];
for(int i=0;i<n;i++)
{
num[i]=s.nextInt();
}
int flag=0;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(num[i]==num[j])
{
flag=1;
System.out.println(num[i]);
}}}
if(flag==0)
{
System.out.println("no repeated number");
}
}
}

