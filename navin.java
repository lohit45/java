class navin implements Runnable
{
int c=0;
public synchronized  void run()
{

for(int i=0;i<3;i++)
{
System.out.println(c++);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
public static void main(String args[])
{
navin r = new navin();
Thread t = new Thread(r);
Thread d = new Thread(r);
navin f = new navin();
Thread g = new Thread(f);
Thread s = new Thread(f);
t.start();
d.start();
g.start();
s.start();
try
{

t.join();
d.join();
g.join();
s.join();
}
catch(Exception e)
{
System.out.println(e);
}

System.out.println("bye");
}
}