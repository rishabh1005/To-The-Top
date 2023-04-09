import java.util.*;
import java.io.*;

class Solution{
    void printSquare(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern1{
    public static void main(String[] args) throws Exception{
        Solution obj = new Solution();
        obj.printSquare(5);
    }
}