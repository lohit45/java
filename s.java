import java.util.Scanner;
class stud
{
String name;
int r;
int m[] = new int[3];
Scanner s = new Scanner(System.in);
stud()
{
name = "lohith";
r = 1;
System.out.println("Enter marks");
for(int i = 0;i<3;i++)
{
m[i] = s.nextInt();
}
 
}
void getdata()
{
System.out.println("Enter name");
name = s.next();

System.out.println("Enter rollno");
r = s.nextInt();
System.out.println("Enter marks");
for(int i = 0;i<3;i++)
{
m[i] = s.nextInt();
}
}
void putdata()
{
System.out.println("Name is" +name);
System.out.println("roll is "+r);
System.out.println("marks of 3 sub are");
for(int i = 0;i<3;i++)
{
System.out.print(m[i]);
}
}
}
class s
{
public static void main(String args[])
{
stud a[] = new stud[2];
for(int i = 0;i<2;i++)
{
a[i] = new stud();
a[i].putdata();
}
for(int i = 0;i<2;i++)
{
a[i].putdata();
}
}
}



