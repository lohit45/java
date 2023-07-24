abstract class figure1
{
double a,b;
figure1(double c, double d) 
{
a=c;
b=d;
}
abstract double area();
abstract void onemoremethod();
void just()
{
System.out.println("We have used parametrised constructor in abstract class and normal function in abstract class");
}
}
 class figure2 extends figure1
{
figure2(double a, double b)
{
super(a,b);
}
double area()
{
System.out.println("This  is figure 2 area");
return (a * b);
}
void onemoremethod()
{
System.out.println("another method");
}
}
class ma
{
public static void main(String args[])
{
figure2 f = new figure2(1.5,2.5);
double g = f.area();
f.just();
f.onemoremethod();
System.out.println(g);
}
}
//abstract all methods should be overridden
//we can use constructors in abstract 
//we can declare general methods in abstract

