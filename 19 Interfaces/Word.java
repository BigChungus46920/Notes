//(c) A+ Computer Science
// www.apluscompsci.com

//generic comparable example

public class Word implements Comparable<Word>
{
  private String orig;

  public Word(String s) { orig = s; };

  public int compareTo(Word other) 
  {

<<<<<<< HEAD
     return orig.compareTo(other.toString());

     
=======
       return orig.compareTo(other.toString());
>>>>>>> upstream/master
  }

  public String toString() { return orig; }
}
