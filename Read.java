import java.io.*;
class read
{
public static void main(String args[]) throws Exception
{
char c;
DataInputStream d = new DataInputStream(System.in);
System.out.println("ENter characters");
do
{
c = (char) d.read();
System.out.println(c);
}while(c!='q');
}
}
