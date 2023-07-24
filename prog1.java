import java.util.Scanner;
class prog1
{
public static void main(String args[])
{
int ele[] = new int[10];
Scanner s = new Scanner(System.in);
int i ;
for(i = 0; i<10;i++)
{
ele[i] = s.nextInt();
}
for(i = 0; i<10;i++)
{
System.out.println("elements are "+ele[i]); 
}
}
}