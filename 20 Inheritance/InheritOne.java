

//inheritance example

import static java.lang.System.*;
public class InheritOne
{
  public static void main ( String[] args )
  {
  //test code in the main method
  A one = new A();
    B two = new B();

<<<<<<< HEAD
=======
public class InheritOne
{
  public static void main ( String[] args )
  {
  //test code in the main method
  A one = new A();
    B two = new B();

>>>>>>> upstream/master
  out.println(one);
  one.setX(11);
  out.println(one.getX());

  
  out.println(two);    
  two.setX(24);
<<<<<<< HEAD
  out.println(two.getX());  
  
  A three = new A();
  three = one;
  System.out.println(one.equals(three));
  
  
  }
}
=======
  out.println(two.getX()); 
  
  A three = new A();
  three = one;
  System.out.println( one.equals(three) );
  
  }
}

>>>>>>> upstream/master
class A
{
   private int x;
   
   public A() { 
      x =8;
   }
   
   public void setX(int val)
   {
    x=val;
   }
   
   public int getX()
   {
    return x;
   }
   
   public String toString() 
   { 
      return ""+getX();
   }
}

class B extends A
{
   //no visible code
}

