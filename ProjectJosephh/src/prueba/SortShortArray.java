 package prueba;
/*  How to Sort short Array in Java Example
    Save with file name SortShortArray.java    */
import java.util.*;
public class SortShortArray
{
  public static void main(String args[])
  {
    short[] short_array = new short[] { 99, 33, 11, 44, 66, 77, 88, 22, 55 };
    System.out.println("Before sorting Java short array");
    for (short short_no : short_array)
    {
      System.out.println(short_no);
    }
    System.out.println("After Java short array sort");
    Arrays.sort(short_array);
    for (short short_no : short_array)
    {
      System.out.println(short_no);
    }
  }
}
