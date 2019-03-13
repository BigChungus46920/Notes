// Hero is called the super class
// Mercy is a subclass of Hero


public class Mercy extends Hero {
  
  public String weapon;
  
  
  public Mercy(){
    super();      //super() keyword refers to the superclass
    System.out.println(super.weapon);    //super() needs to be the first line of the constructor
    this.weapon = "staff";
    
   
  }
  
  public void jump(){
    System.out.println("Your Mercy has jumped and is now falling like a feather");
  }
  
  public void rez(){
    System.out.println("Heros never die!");
  }
  
  
}