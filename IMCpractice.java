
/**
 * IMC  code interview practice
 *
 *         This is a demo task.
 *
 *         Write a function:
 *         //class Solution { public int solution(int[] A); }
 *
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].
        Copyright 2009–2020 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
        **/




// you can also use imports, for example:
        import java.util.*;
        import java.util.Random;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        //Random randNum = new Random(); //instance of class to generate random numbers used for the length of array and the contents
        int nMax = 100000; //establishes the max of N; the length of array A
        int nMin = 1; // establishes the min of N; the length of array A
        //establish array A with N integers (1-100,000)
        //int[] A; //defines array A
        int N; //length of array
        int nRandNum = (int)(Math.random() * (nMax - nMin +1) + nMin); //finds random number from 1-100,000 for N
        N = nRandNum;
        int lowest; //lowest integer within the array
        boolean match = false; //checks to see if lowest positive int is in array or not

        System.out.println(N);

        //find lowest positive int
        //loop through array
        for (int i=0; i < A.length; i++){
            //loop from 1-100,000 comparing elements in array with 'lowest' greater than 0
            for(int j=1; j < 100000; j++){
                if(j != N[i]){
                    //if the element j (filing 1-100,000) does not match number, 'match' is set to false and continues
                    match = false;
                }
            }
        }

        //return lowest int

        return 0;
    }
}