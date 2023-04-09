import java.util.*;
import java.io.*;

class Solution{
    void printDiamond(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern9{
    public static void main(String[] args) throws Exception{
        Solution obj = new Solution();
        obj.printDiamond(5);
    }
}