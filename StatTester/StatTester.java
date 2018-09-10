package StatTester;


/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// imports go here
import java.util.Arrays;
public class StatTester{
    //  Instance variables
    private int[] nums;
    // Constructor
    public StatTester(){
        
    }
    //  Methods
    public void loadArray(){
        for(int i = 0; i < 100; i++){
            nums[i] = (int)(Math.random()*10 + 1);
        }
    }
    public void printArray(){
        for(int i = 0; i < 100; i+=10){
            System.out.println(nums[i] + ", " + nums[i+1] + ", " + nums[i+2] + ", " + nums[i+3] + ", " + nums[i+4] + ", " + nums[i+5] + ", " + nums[i+6] + ", " + nums[i+7] + ", " + nums[i+8] + ", " + nums[i+9]);
        }
    }
    public int getSum(){
        int sum = 0;
        for(int i = 0; i < 100; i++){
            sum = sum + nums[i];
        }
        return sum;
    }
    public int getMean(){
        int mean = 0;
        for(int i = 0; i < 100; i++){
            mean = mean + nums[i];
        }
        mean = mean/100;
        return mean;
    }
    public int getMedian(){
        int median = 0;
        int lenNum = nums.length;
        if(lenNum % 2 == 0){
            median = (nums[lenNum] + nums[lenNum + 1])/2;
        }
        else{
            int t = lenNum /2; 
            median = nums[t];
        }
        return median;
    }
    public int getMode() {
        int maxKey = 0;
        int maxCounts = 0;

        int[] counts = new int[nums.length];
        for (int i=0; i < nums.length; i++) {
            counts[nums[i]]++;
            if (maxCounts < counts[nums[i]]) {
                maxCounts = counts[nums[i]];
                maxKey = nums[i];
            }
        }
        return maxKey;
    }
}
