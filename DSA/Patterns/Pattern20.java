import java.util.*;
import java.io.*;

class Solution{
    void printTriangle(int n){
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j < n-i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < 2*i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < 2*i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern20{
    public static void main(String[] args) throws Exception{
        Solution obj = new Solution();
        obj.printTriangle(5);
    }
}