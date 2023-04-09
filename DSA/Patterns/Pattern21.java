import java.util.*;
import java.io.*;

class Solution{
    void printSquare(int n){
        char c;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0 || i == n-1 || j == n-1){
                    c = '*';
                }else c = ' ';
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

public class Pattern21{
    public static void main(String[] args) throws Exception{
        Solution obj = new Solution();
        obj.printSquare(5);
    }
}