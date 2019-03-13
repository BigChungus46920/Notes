//(c) A+ Computer Science
// www.apluscompsci.com

//comparable example one

import static java.lang.System.*;
<<<<<<< HEAD
import java.util.*;
=======
import static java.util.ArrayList;
import static java.util.Collections;
>>>>>>> upstream/master

public class WordRunner
{
 public static void main ( String[] args )
 {
<<<<<<< HEAD
  Word 0 = new Word("cat");
  Word 1 = new Word("cat");
  Word 2 = new Word("cat");
  Word 3 = new Word("cat");
  Word 4 = new Word("cat");
  Word 5 = new Word("cat");
  Word 6 = new Word("cat");
  Word 7 = new Word("cat");
  Word 8 = new Word("cat");
  Word 9 = new Word("cat");
  ArrayList<Word> test = new ArrayList<Word>();
  for (int i = 0; i <10;i++){
    test.add(i);
  }
  Collections.sort(test);
  System.out.println(test);
  //make a list of Word
=======
  Word x = new Word("cat");
  Word y = new Word("catcat");
  System.out.println( x.compareTo(y) );
  
  //make a list of Word
  List<Word> list = new ArrayList<Word>();
  
>>>>>>> upstream/master
  //call Collections.sort() and sort the list
  //print the list
  }
}