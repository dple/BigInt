/** This code tests if a given big integer is probable prime or not, 
  * by using the function isProbablePrime of the class BigInteger
  */


import java.io.*;
import java.math.BigInteger;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        bufferedReader.close();
        BigInteger bigInt = new BigInteger(n);
        if (bigInt.isProbablePrime(4)) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
