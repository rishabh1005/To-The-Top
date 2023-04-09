import java.util.*;
import java.io.*;

class Solution{
    void printTriangle(int n){
        for(int i = n-1; i >= 0; i--){
            for(int j = n-1; j >= i; j--){
                char c = (char)(j + 65);
                System.out.print(c + " ");    
            }
            System.out.println();
        }
    }
}

public class Pattern18{
    public static void main(String[] args) throws Exception{
        Solution obj = new Solution();
        obj.printTriangle(5);
    }
}