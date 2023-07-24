import java.util.Scanner;
class student1
{
int roll;
String name;
student1(int a ,String b)
{
roll = a;
name = b;
}
void displayinfo()
{
System.out.println("name is "+name);
}
}
class arra
{
public static void main(String args[])
{
student1 std[] = new student1[3];
Scanner s = new Scanner(System.in);
for(int i=0;i<3;i++)
{
std[i] =new student1(s.nextInt(),s.nextLine());
}
for(int i=0;i<3;i++)
{
std[i].displayinfo();
}
}
}

