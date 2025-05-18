package Day_1;

import java.io.*;

//Main Class
class Test2
{

 // Main driver method
 public static void main(String[] args)
 {
     // Conversion of float value to int
     Float floatWrap = Float.valueOf(45.158f);

     // Invoking the intValue() method over the stored
     // float value to store
     int floatToInt = floatWrap.intValue();

     // Print the non-primitive(Integer) value
     System.out.println(floatToInt);

     // Now for another number N
     // Say N = 5

     // Convert the binary number to the integer value
     Integer five = Integer.valueOf("101", 2);

     // Print the number
     System.out.println(five);
 }
}