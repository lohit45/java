class NewThread implements Runnable
{
Thread t;
NewThread()
{ 
t = new Thread(this,"dem");
System.out.println("Child thread");
t.start();
}
public void run()
{

try
{
System.out.println(t.getName());
for(int i=0;i<10;i++)
{
System.out.println(i);
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("exiting child");
}
}
class De
{
public static void main(String args[])
{
new NewThread();
try
{
for(int i=10;i>0;i--)
{
System.out.println(i);
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("exiting main");
}
}
