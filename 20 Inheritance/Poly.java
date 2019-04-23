//(c) A+ Computer Science
// www.apluscompsci.com

//polymorphism example

import static java.lang.System.*;

<<<<<<< HEAD

public class Poly
{
  public static void main ( String[] args )
  {
    Monster x = new Ghost("Casper");
    out.println(x);
    
    x=new Witch("Harriet");
    out.println(x);
    
    x=new Ghost("Johny Cash");
    out.println(x);
    
    Ghost y=new Ghost("Chucky");
    out.println(y);
    y.whoot();  //what is the problem?
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
=======
public class Poly
{
 public static void main ( String[] args )
 {
    Monster x = new Ghost("Casper");
    out.println(x);

    x=new Witch("Harriet");
    out.println(x);

    x=new Ghost("Johny Cash");
    out.println(x);

    x=new Ghost("Chucky");
    out.println(x);
   ((Ghost)x).whoot();  //what is the problem?
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
>>>>>>> upstream/master
}

class Witch extends Monster
{
<<<<<<< HEAD
  public Witch(  )
  {
    super();
  }
  
  public Witch(String name)
  {
    super(name);
  }
=======
 public Witch(  )
 {
  super();
 }

 public Witch(String name)
 {
  super(name);
 }
>>>>>>> upstream/master
}


class Ghost extends Monster
{
<<<<<<< HEAD
  public Ghost(  )
  {
    super();  //happens automatically
  }
  
  public Ghost(String name)
  {
    super(name);
  }
  
  public void whoot()
  {
    System.out.println("Ghost says whoot!");
  }
}

=======
 public Ghost(  )
 {
  super();  //happens automatically
 }

 public Ghost(String name)
 {
  super(name);
 }

 public void whoot()
 {
  System.out.println("Ghost says whoot!");
 }
}


>>>>>>> upstream/master
