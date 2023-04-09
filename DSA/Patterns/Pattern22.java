import java.util.*;
import java.io.*;

class Solution{
    void printSquare(int n){
        for(int i = n; i > 1; i--){
            int val = n;
            for(int j = n; j > 0; j--){
                System.out.print(val + " ");
                if(val > i) val--;
            }
            for(int j = 2; j <= n; j++){
                if(j > val){
                    System.out.print(j + " ");
                }else{
                    System.out.print(val + " ");
                }
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            int val = n;
            for(int j = n; j > 0; j--){
                System.out.print(val + " ");
                if(val > i) val--;
            }
            for(int j = 2; j <= n; j++){
                if(j > val){
                    System.out.print(j + " ");
                }else{
                    System.out.print(val + " ");
                }
            }
            System.out.println();
        }
    }
}

public class Pattern22{
    public static void main(String[] args) throws Exception{
        Solution obj = new Solution();
        obj.printSquare(3);
    }
}