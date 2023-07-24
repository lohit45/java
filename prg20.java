import java.util.Scanner;
class prg20
{
public static void main(String args[])
{
int year =0 ;
Scanner s = new Scanner(System.in);
System.out.println("enter ");
year = s.nextInt();
if(year%4 != 0)
{
System.out.println(" not leap");
}
else if(year%400 ==0)
{
System.out.println("leap");
}
else if(year%100 !=0)
{
System.out.println("leap");
}
else
{
System.out.println(" not leap");
}
}
}