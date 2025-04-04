import java.util.Scanner;

public class SubString3 {
     public static String getSmallestAndLargest(String s, int k ){
         String smallest = s.substring(0, k);
         String largest=smallest;

         for(int i=1;i<=s.length()-k;i++){
                
            String subString=s.substring(i,i+k);
            if(subString.compareTo(smallest)<0){
                smallest=subString;
            }if(subString.compareTo(largest)>0){
                subString=largest;
            }

         }
          return smallest + "\n"+largest;

     }

       public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        int k=scan.nextInt();
        
        System.out.println(getSmallestAndLargest(s,k));
        

        scan.close();

       }



}
