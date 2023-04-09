import java.util.*;
import java.io.*;

class Solution{
    void printTriangle(int n){
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

public class Pattern5{
    public static void main(String[] args) throws Exception{
        Solution obj = new Solution();
        obj.printTriangle(5);
    }
}