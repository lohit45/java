class MyThread implements Runnable
{
public void run()
{
System.out.println("IMPLEMENTS");
}
}
class Th
{
public static void main(String args[])
{
Thread t = new Thread(new MyThread());
t.start();
}
}