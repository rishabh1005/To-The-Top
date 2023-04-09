import java.util.*;
import java.io.*;

class Solution{
    void printTriangle(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}

public class Pattern3{
    public static void main(String[] args) throws Exception{
        Solution obj = new Solution();
        obj.printTriangle(5);
    }
}