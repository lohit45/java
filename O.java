import java.util.*;
public class O
{
public static void main(String args[])
{
//List<String> a = new ArrayList<String>();
//a.add("lohith");
//a.add("bhu");
//String b[] = {"loh","buu"};
HashSet<String> h = new HashSet<String>();
h.add("loh");
h.add("buu");
h.add("idi");
System.out.println(h);public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable  

System.out.println(h.contains("loh"));
}
}