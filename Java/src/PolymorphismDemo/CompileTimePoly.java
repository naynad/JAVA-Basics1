package PolymorphismDemo;

public class CompileTimePoly {
			  
	    // Overloaded sum().
	    // This sum takes two int parameters
	    public int sum(int x, int y)
	    {
	        return (x + y);
	    }
	  class B extends CompileTimePoly {
	    // Overloaded sum().
	    // This sum takes three int parameters
	    public int sum(int x, int y)
	    {
	        return (x + y );
	    }
	  }
	    // Overloaded sum().
	    // This sum takes two double parameters
	  
	  class C extends  CompileTimePoly{
	     public int sum(int x, int y)
	    {
	        return (x + y);
	    }
	  }
	    // Driver code
	    public static void main(String args[])
	    {
	    	CompileTimePoly s = new CompileTimePoly();
	    	B b=new B();
	        System.out.println(s.sum(10, 20));
	        System.out.println(b.sum(10, 20));
	        System.out.println(s.sum(10,28));
	    }
	}


