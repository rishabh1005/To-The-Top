import java.util.*;
import java.io.*;

class Solution{
    void printTriangle(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= 2*i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern7{
    public static void main(String[] args) throws Exception{
        Solution obj = new Solution();
        obj.printTriangle(5);
    }
}