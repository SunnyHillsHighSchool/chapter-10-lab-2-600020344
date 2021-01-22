//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
 //go() will return true if all numbers in numArray
 //are in decreasing order [31,12,6,2,1]
 public static boolean go(int[] numArray)
 {
   int first, second;
   for (int i = 1; i<numArray.length; i++)
   {
     first = numArray[i-1];
     second = numArray[i];
     if (first<=second)
     {
       return false;
     }
   }
  return true;
 } 
}
