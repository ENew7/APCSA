
/**
 * Write a description of class CalcRunner here.
 * 
 * @author Edward Newell 
 * @version 822
 */
public class CalcRunner
{
   public static void main(){
      SimpleCalc thing = new SimpleCalc();
      System.out.println(thing.add(3, 4));
      System.out.println(thing.subtract(5, 3));
      System.out.println(thing.multiply(6, 2));
      System.out.println(thing.divide(665, 5));
      System.out.println(thing.moduloDivide(27, 4));
    }
}
