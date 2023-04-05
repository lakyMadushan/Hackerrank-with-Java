/*
given a number n, for each integer i in the range from 1 to n inclusive, print one value per line as follows:

        if i is a multiple of both 3 and 5, print FizzBuzz.
        if i is a multiple of 3(but not 5), print Fizz.
        if i is a multiple of 5(but not 3), print Buzz.
        if i is not a multiple of 3 or 5, print the value ofi.

        Function Description
        complete the function fizzBuzz in the editor below.

        fizzBuzz has the following parameter(s):
        int n: upper limit of values to test (inclusive)
        Returns: NONE
        print:
        the function must print the appropriate response for each value i in the set {1,2,...n} in ascending order, each on a separate line.

        Constraints
        0<n<2*10^5
        Input format for custom testing
        input from stdin will be processed as follows and passed to the function.
        the single integer n, the limit of the range to test: {1,2,...n}

 */


import java.util.Scanner;
class Result {
    public static void fizzBuzz(int n) {
        for(int i=1;i<=n;i++){
            if(i%15==0){
                System.out.println("FizzBuzz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else
                System.out.println(i);
        }
    }
}
public class Solution {
    public static void main(String[] args)
    {
        //Scanner test = new Scanner(System.in);
        //int n = test.nextInt();
        int n=15;
        Result r = new Result();
        r.fizzBuzz(n);
    }
}
//Answers
/*1
  2
  Fizz
  4
  Buzz
  Fizz
  7
  8
  Fizz
  Buzz
  11
  Fizz
  13
  14
  FizzBuzz
        */
