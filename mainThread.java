class mainThread
{
public static void main(String args[])
{
Thread t = Thread.currentThread();
System.out.println(t);
t.setName("Lohith");
System.out.println(t);
t.setPriority(2);
System.out.println(t.getName());
System.out.println(t);
}
}