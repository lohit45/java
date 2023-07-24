import java.io.*;
class p
{
public static void main(String args[]) throws IOException
{
int i;
FileInputStream f = new FileInputStream(args[0]);
FileOutputStream b = new FileOutputStream(args[1]);
do
{
i = f.read();
if(i!=-1)
{
b.write(i);
}
}while(i != -1);
}
}