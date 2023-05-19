package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println(findNb(1071225));
       // System.out.println(Long.MAX_VALUE);
        System.out.println(findNb(2007160912225594225L));
        System.out.println(findSum(53230));
    }
    public static long findNb(long m) {
        long sumOfCubes=0;
        int numberOfIterations=0;
        long elementOfRow =1;
        while (sumOfCubes < m){
            sumOfCubes += elementOfRow*elementOfRow*elementOfRow;
            elementOfRow++;
            numberOfIterations++;
        }
       return sumOfCubes == m  ? numberOfIterations : -1;
    }

    public static long findSum(long n){
        long sum=0;
        for (int i = 0; n >= i; i++) {
            sum += (n-i)*(n-i)*(n-i);
        }
        return sum;
    }
}