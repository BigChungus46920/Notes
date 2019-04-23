//(c) A+ Computer Science
// www.apluscompsci.com

//setting matrix values example 2 

import static java.lang.System.*;

public class MatrixSetTwo
{
 public static void main(String args[])
 {
  String[][] mat = new String[10][10];

  for(int r=0; r<mat.length; r++)
  {
   for(int c=0; c<mat[0].length; c++)
   {
     if(r==c)
    mat[r][c] = ""+r*c;
     
   }
   
  }

  for(int r=0; r<mat.length; r++)
  {
   out.print("row "+ r + " ");
   for(int c=0; c<mat[0].length; c++)
   {
     if(mat[r][c]!= null)
    out.print(mat[r][c]);
     if(mat[r][c]==null)
       out.print("    ");
   }
   out.println();
  }
 }
}