
/*
 * tj.exe
 * 
 * Version_1
 */

import java.util.*;

public class Druga {

    public static int potZoge(int strelec, boolean[][] igralci, int smer) {
        // popravite / dopolnite ...
        int[] t1 = new int[igralci[0].length]; //initilized with 0
        for(int i = 0; i < igralci.length; i++)
        {
            for(int j = 0; j < igralci[i].length; j++)
            {
                if(igralci[i][j] == true && i < (igralci.length / 2))
                {
                    t1[j] = (igralci.length / 2) - i;
                }
                else if(igralci[i][j] == true && i > (igralci.length / 2))
                {
                    t1[j] = i - (igralci.length / 2);
                }
                else if(igralci[i][j] == true && i == (igralci.length / 2))
                {
                    t1[j] = -1;
                }
            }
        }

        if(smer == 1)
        {
            int counter = 1;
            for(int i = strelec + 1; i < t1.length; i++)
            {
                if(counter >= t1[i] && t1[i] != 0)
                {
                    return counter;
                }
                counter++;
            }
            return counter - 1;
        }

        if(smer == -1)
        {
            int counter = 1;
            for(int i = strelec - 1; i >= 0; i--)
            {
                if(counter >= t1[i] && t1[i] != 0)
                {
                    return counter;
                }
                counter++;
            }
            return counter - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
