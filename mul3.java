class one extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("FRom one");
}
System.out.println("exit");
}
}
class two extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("CHI po");
}
System.out.println("exit2");
}
}
class dem
{
public static void main(String args[])
{
one t = new one();
two a = new two();
t.start();
a.start();
System.out.println("main thread exiting");
}
}