class b
{
public static void main(String args[])
{
StringBuffer s = new StringBuffer("SASTRA");
System.out.println(s);
s.append("University");
System.out.println(s);
s.insert(6,"lohith");
System.out.println(s);
s.deleteCharAt(0);
System.out.println(s);
s.delete(0,5);
System.out.println(s);
s.reverse();
System.out.println(s);
int a = s.length();
System.out.println(a);
System.out.println(s.capacity());
s.setCharAt(1,'b');
System.out.println(s);
}
}