import java.util.Scanner;
import java.util.regex.*;


public class regx{
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        int testcases=Integer.parseInt(in.nextLine());
        while(testcases>0){
          String pattern=in.nextLine();
       try {
        Pattern.compile(pattern);
        System.out.println("Valid");
           
       } catch (PatternSyntaxException e) {
        System.out.println("Invalid");
       }
     testcases--;

        }

        in.close();
        

    }


}