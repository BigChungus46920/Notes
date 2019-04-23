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
     Sasquatch billy = new Sasquatch();
     System.out.println(billy.getHasFluffy());
     System.out.println(billy);
     
     
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

<<<<<<< HEAD
class Sasquatch extends Monster{
  public Sasquatch(String name){
    super(name);
  }
  
  public void yell(){
    System.out.println("WOW LOUD YELL");
  }
=======
//make a new type of Monster - Sasquatch 

class Sasquatch extends Monster{
     private boolean hasFluffy;
     
     public Sasquatch(){
          hasFluffy = true;
     }
     
     public boolean getHasFluffy(){
          return hasFluffy;
     }
>>>>>>> upstream/master
}




<<<<<<< HEAD


=======
>>>>>>> upstream/master
