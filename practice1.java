import java.util.Scanner;
class employe
{
public int eno;
 String ename;
static int x =10;
 void setemp(int no, String name)
{
eno = no;
ename = name;
System.out.println("empno is "+eno+"  employee name is "+ename);
}
void puttemp()
{
setemp(99,"lohith");
System.out.println("empno is "+eno+"  employee name is "+ename);
}
}
class main
{
public static void main(String args[])
{
employe e = new employe();
e.puttemp();
e.setemp(100,"hari");

}
}

