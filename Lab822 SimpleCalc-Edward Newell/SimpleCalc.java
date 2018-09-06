
/**
 * Write a description of class SimpleCalc here.
 * @author Edward Newell 
 * @version 822
 */
public class SimpleCalc extends CalcRunner
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class SimpleCalc
     */
    public SimpleCalc()
    {
        
    }
    public double add(int x, int y){
        return x + y;
    }
    public double subtract(int x, int y){
        return x - y;
    }
        public double multiply(int x, int y){
        return x * y;
    }
        public double divide(int x, int y){
        return x / y;
    }
    public double moduloDivide(int x, int y){
        return x % y;
    }
}
