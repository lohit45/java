class newThread implements Runnable
{
Thread t;
newThread(String name)
{
t = new Thread(this,name);
System.out.println(t);
t.start();
}
public void run()
{
try
{
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
}
}class newThread2 implements Runnable
{
Thread t;
newThread2()
{
t = new Thread(this,"Dem00");
System.out.println(t);
t.start();
}
public void run()
{
try
{
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
}
}
class implem
{
public static void main(String args[])
{
//new newThread();
//new newThread2();
newThread a = new newThread("lo");
newThread b = new newThread("hi");
try
{
for(int i=0;i<10;i++)
{
System.out.println("main ");
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}