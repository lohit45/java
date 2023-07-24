class Table{  
 synchronized void printTable(int n){   
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{        Thread.sleep(400);  
     }catch(InterruptedException e) { System.out.println(e); }    }  
  System.out.println(n+"  table terminated");   }  
}  
 class MyThread1 extends Thread 
{  
Table t;  
MyThread1(Table t)
{ 
this.t=t; 

start();
 }  
public void run(){   t.printTable(5);  }  
  }  
class MyThread2 extends Thread{  
Table t;  
MyThread2(Table t){  
this.t=t;
start();  }  
public void run(){  t.printTable(100);  }  
}  
public class ex
{  
public static void main(String args[]){  
Table obj = new Table();//only one object  
new MyThread1(obj);  
new MyThread2(obj);   
}
}
