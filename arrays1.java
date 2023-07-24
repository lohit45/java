import java.util.Scanner;
class java
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);

int arr[]={1,2,3,4,5};

System.out.println("enter elements are ");
/*for(int i =0;i<arr.length;i++)
{
arr[i] = s.nextInt();
}
*/
for(int i= 0;i<arr.length;i++)
{
System.out.println("element "+(i+1)+" is "+arr[i]);
}

}
}