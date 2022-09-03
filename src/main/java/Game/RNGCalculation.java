package Game;

//this class will handle all rng from 1 to 10


import java.lang.Math;

public class RNGCalculation
{
    // define the range
    static int mathRngMax = 10;
    static int mathRngMin = 1;
    static int mathRngRange = mathRngMax - mathRngMin + 1;

    public static void main(String[] args)
    {
        for(int i = 0; i < 10; i++)
        {
            int rand = (int) (Math.random() * mathRngRange) + mathRngMin;

            // Output is different everytime this code is executed
            System.out.println(rand);
        }
    }
}



