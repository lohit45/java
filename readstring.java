import java.io.*;
class reads
{
public static void main(String args[]) throws Exception
{
DataInputStream d = new DataInputStream(System.in);
String s;
s = d.readLine();
System.out.println(s);
}
}