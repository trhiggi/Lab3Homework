
import java.util.Scanner;





public class IsPrimeMethod {
    
static void checkPrime(int numberEntered){  
  int counter;
  int numberHalved;
  int flag=0;      
  numberHalved=numberEntered/2;      
  if(numberEntered==0||numberEntered==1){  
   System.out.println(numberEntered+" is not a prime number");      
  }else{  
   for(counter=2;counter<=numberHalved;counter++){      
    if(numberEntered%counter==0){      
     System.out.println(numberEntered+" is not a prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(numberEntered+" is prime a number"); }  
  }
}  
 public static void main(String args[]){   
     Scanner keyboard = new Scanner(System.in);
     
     int numberEntered = keyboard.nextInt();
     
  checkPrime(numberEntered);  

}    
}   
         
         
        
    
   


      