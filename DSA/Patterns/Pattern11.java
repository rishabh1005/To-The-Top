import java.util.*;
import java.io.*;

class Solution{
    void printTriangle(int n){
        for(int i = 0; i < n; i++){
            int val = ( i%2==0 ? 1 : 0);
            for(int j = 0; j <= i; j++){
                System.out.print(val + " ");
                val ^= 1;
            }
            System.out.println();
        }
    }
}

public class Pattern11{
    public static void main(String[] args) throws Exception{
        Solution obj = new Solution();
        obj.printTriangle(5);
    }
}