import java.util.Scanner;
class animal
{
 int a;
 void get()
{
Scanner s = new Scanner(System.in);
System.out.println("enter a ");
a = s.nextInt();
System.out.println(a);
}
}
class dog extends animal
{
int b;
void get()
{
Scanner s = new Scanner(System.in);
System.out.println("enter b in class 2");
b = s.nextInt();
System.out.println(b);
}
public static void main(String args[])
{
animal b = new animal();
animal a = new dog();
b.get();
}
}