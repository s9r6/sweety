import java.util.*;
public class reverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1=s.next();
String s2[]=s1.split("");
for(int i=s2.length-1;i>=0;i--)
{
System.out.print(s2[i]);
}
}
}