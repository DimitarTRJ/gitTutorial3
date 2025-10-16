
/*
 * tj.exe Prva.java . .
 * 
 * Version_1
 */

import java.util.*;

public class Primer1 {

    public static void main(String[] args) {
        // dopolnite ...
        Scanner sc = new Scanner(System.in);
        int spodnaMeja = sc.nextInt();
        int zgornaMeja = sc.nextInt();
        int counter1 = 0;
        int counterFinal = 0;
        for(int i = spodnaMeja + 2; i <= zgornaMeja + 2; i++)
        {
            if(prastevilo(i - 2))
            {
                for(int j = 1; j <= i; j++)
                {
                    if(i % j == 0)
                    {
                        counter1++;
                    }
                }
                if(counter1 <= 4)
                {
                    counterFinal++;
                    //System.out.println(i);
                }
                counter1 = 0; 
                
            }
                //System.out.print(counterFinal);
        }
        System.out.print(counterFinal);
            
    }

    public static boolean prastevilo(int i)
    {
        int counter = 0;
        for(int j = 1; j <= i; j++)
        {
            if(i % j == 0)
            {
                counter++;
            }
        }
        if(counter == 2)
        {
            return true;
        }
        return false;
    }
}

