import java.util.Scanner;

public class ReverseString {
       public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B="";
        
        for(int i=A.length()-1;i>=0;i--)
        
        
        { // Loop to reverse the string
            // A.charAt(i) returns the character at index i of string A
            // B=B+A.charAt(i) appends the character to string B
            // So, B will be the reverse of A after the loop ends
            // For example, if A is "hello", B will be "olleh" after the loop
            // ends
            // This is a common way to reverse a string in Java using a loop


            B=B+A.charAt(i);
        }
        if(A.equals(B)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


       }
}
