import java.io.*;
class console
{
public static void main(String args[]) throws IOException
{
InputStreamReader i = new InputStreamReader(System.in);
BufferedReader b = new BufferedReader(i);
BufferedReader f = new BufferedReader(i);
PrintWriter p = new PrintWriter(System.out,false);
System.out.println();
System.out.println();
char c;
String d;
c= (char)b.read();
System.out.println(c);
d= f.readLine();
System.out.println(d);
int a = Integer.parseInt(d);
System.out.println(a);
System.out.write(a);

p.println("hello");
p.flush();
}
}