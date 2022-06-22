/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

//import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
    public enum operators{
        PLUS,MINUS,TIMES,DIVIDE
    }
    public double calcualte(double x, double y)
    {
        for (operators myVar : operators.values()) 
        {
            switch (myVar) 
            {
                case PLUS:
                    System.out.println("Plus is "+(x + y));
                    break;
                case MINUS:
                    System.out.println("Minus is "+(x - y));
                    break;
                case TIMES:
                    System.out.println("Times is "+(x * y));
                    break;
                case DIVIDE:
                    System.out.println("Divide is "+(x / y));
                    break;
                default:
                    throw new AssertionError("Unknown operations " + this);
            }
            
         }
        return 0;
    }
}
