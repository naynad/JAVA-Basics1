package ThisEx;
public class MethodCall
{
 
 int num;
void MethodCall1(MethodCall obj)
{System.out.println("Method 1 is called");
}
  void MethodCall2()
 {
	  MethodCall1(this);
 }
 
 public static void main(String[] args) 
{
 
	 MethodCall obj = new MethodCall();
	 
   obj.MethodCall2();
 } 
 }

