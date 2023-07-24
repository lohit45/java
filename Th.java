class Myt extends Thread
{
public void run()
{
System.out.println("SYSYUYY");
}
}
class th
{
public static void main(String args[])
{
Myt a = new Myt();
a.start();
}
}