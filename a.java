/* Java is Sequence of characters . String objects are String ,String Buffer,String Builder.Strings are immutable.
String s = new String();
char data[] = {'a','b','c'}
String str = new String(data);*/

import java.util.Scanner;
class a 
{
public static void main(String args[])
{
char a[] = {'a','b','c'};
//String s = new String();
//System.out.println(s);
//String str = new String("HI");
String d = "HELLO";
//String s = d + "HELLO";
//System.out.println(s);
char c ="abc".charAt(0);    //charAt(index)
System.out.println(c);

/*char f[] = new char[10];
d.getChars(0,3,f,1);       //begin,end,charr,dest starting point
System.out.println(f);
System.out.println(s.equalsIgnoreCase(d));//equals,equalsIgnoreCase
Boolean o = "HELLO".startsWith("HEL");//startsWith,endsWith 
System.out.println(o);
int w =s.indexOf('E');
System.out.println(w);
String i =s.substring(1);
System.out.println(i);//concat,replace("old","new"),trim,toLowerCase()*/

byte b[] = {65,66};
String s = new String(b);
System.out.println(s);



}
}
/*
charAt()
getChars()
equals()
equalsIgnoreCase()
startsWith()
endsWith()
toLowerCase()
toUpperCase()
trim()
replace()
concat()
*/