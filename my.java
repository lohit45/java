class NewThread implements Runnable
{
Thread t;
NewThread()
{
t = new Thread(this,"loh");
System.out.println("child thread");
t.start();

}
public void run()
{
try
{

for(int i=0;i<10;i++)
{
System.out.println("madhu");

Thread.sleep(2000);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}




class my
{
public static void main(String args[])
{
new NewThread();
new mThread();
NewThread t1 = new NewThread();

try
{
for(int i=0;i<5;i++)
{
System.out.println("lohith");
Thread.sleep(200);
}
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Exiting main");
}
}
class mThread implements Runnable
{
Thread t;
 mThread()
{
t = new Thread(this,"lo");
System.out.println("2nd");
t.start();
}
public void run()
{
try
{
System.out.println("looooo");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
