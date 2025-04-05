import java.util.Scanner;

public class Java_String_Token {
    
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        
        if(s.isEmpty()){
            System.out.println(0);
            return;
            
        }
        String[] tokens=s.split("[^a-zA-Z]+");
        
        System.out.println(tokens.length);
        
        for(String token:tokens){ 
            if(!s.isEmpty())
            System.out.println(token);
        

     }
        

        // Write your code here.
        
        
        scan.close();
    }
}
