import java.util.*;
public class hello {
    public static void add(int n){
        if(n>10){
            return;
        }
        System.out.println(n);
        add(n+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        add(n);
        
    }
    }

