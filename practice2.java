class main
{
int i=0,j=0;
void findele(int arr[] , int num, int n)
{
for( i = 0;i<arr.length;i++)
{
if(arr[i] == num)
 {
 j++;
i=i;
 }
}
if(j ==1)
{
System.out.println("element found at "+i);
}
else
{
System.out.println("element not found ");
}
}
}
class main2
{
public static void main(String args[])
{
main  m = new main();
int arr[] = {12,23,34,35,40};
int nk = 5;
int nu = 3;
m.findele(arr,nu,nk);
}
}

