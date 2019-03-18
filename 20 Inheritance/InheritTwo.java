//(c) A+ Computer Science
// www.apluscompsci.com

//inheritance example

import static java.lang.System.*;

public class InheritTwo
{
  public static void main ( String[] args )
  {
     Monster m = new Monster();
     out.println(m);

     Witch witch = new Witch();
     out.println(witch);
     
     Sasquatch sasquatch = new Sasquatch("Billy");
     out.println(sasquatch);
     sasquatch.yell();
     
     //instantiate Sasquatch
     
     
  }
}

class Monster
{
 private String myName;

 public Monster()
 {
  myName = "Monster";
 }

 public Monster( String name )
 {
  myName = name;
 }

 public String toString()
 {
  return "Monster name :: " + myName + "\n";
 }
}

class Witch extends Monster
{ 
 //how does Witch work if it has no code?

 
 
}

class Sasquatch extends Monster{
  public Sasquatch(String name){
    super(name);
  }
  
  public void yell(){
    System.out.println("WOW LOUD YELL");
  }
}






