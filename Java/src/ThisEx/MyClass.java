package ThisEx;

public class MyClass
{
 
 int num;
 public void setNum(int num)
 {
 this.num = num;
 }
 
 public static void main(String[] args) 
{
 
 MyClass obj = new MyClass();
 obj.setNum(5);
 
 System.out.println("Num value : "+obj.num);
 } 
 }


