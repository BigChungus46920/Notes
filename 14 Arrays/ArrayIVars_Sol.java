

//Array instance variable example

import java.util.Scanner;
import static java.lang.System.*;

public class ArrayIVars_Sol
{
 private int[] nums;

   public ArrayIVars_Sol()
   {
    //instantiate the array so that it can store 10 integers
    nums = new int[10];
   }

 public void work()
 {
    for(int i=0; i<nums.length;i++)
    {
       nums[i] = i*3+4*2;
    }
 }

 public String toString()
 {
  String output = "";
  for( int val : nums)
  {
   output = output + val + " ";
  }
  return output;
 }


 public static void main(String args[])
 {
  ArrayIVars_Sol test = new ArrayIVars_Sol();
  test.work();
  out.println(test);
 }
}
