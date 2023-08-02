package Recursion;

public class qum2 {
    public static void printNum(int n){
        if(n==6 ){
            return;
        }
        System.out.println(n-1);
        printNum(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    } 
    
}
