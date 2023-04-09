import java.util.*;
import java.io.*;

class Solution{
    void printTriangle(int n){
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                char c = (char)(j + 65);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

public class Pattern15{
    public static void main(String[] args) throws Exception{
        Solution obj = new Solution();
        obj.printTriangle(5);
    }
}