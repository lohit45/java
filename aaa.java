class st
{
int c,d;
st(int a ,int b)
{
 c=a;
d=b;
}
void display()
{
System.out.println(c + " " + d);
}
}
class m
{
public static void main(String args[])
{
st a[] = new st[2];
for(int i=0;i<2;i++)
{
a[i] = new st(2,3);
}
for(int i=0;i<2;i++)
{
a[i].display();
}
}
}