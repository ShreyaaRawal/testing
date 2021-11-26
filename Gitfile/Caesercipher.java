import java.util.Scanner;
public class Caesercipher {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
   System.out.println("Enter plaintext:"); 
   String plaintext = sc.nextLine();
   System.out.println("Enter Shift:"); 
   int Shift = sc.nextInt();
   char ch;
   int a;
   String Ciphertext =" "; 
   for(int i=0;i<=plaintext.length()-1;i++){
       ch= plaintext.charAt(i);
       if(Character.isLetter(ch)){
           a= ch + Shift;
           if(Character.isUpperCase(ch)&&a>90||Character.isLowerCase(ch)&&a>122){
               a=a-26;
           }
           ch = (char) a;
       }
       Ciphertext = Ciphertext + ch;
       System.out.println("plaintext is:"+plaintext);
       System.out.println("ciphertext is:"+Ciphertext);
   } 
    
        
    }
}
