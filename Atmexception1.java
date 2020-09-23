/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmexception1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
class MinimumBalanceException extends Exception
{
    
        public MinimumBalanceException(String s)
        {
            super(s);
        }
    
}
public class Atmexception1 {

    /**
     * @param args the command line arguments
     */
     void check (double a )throws MinimumBalanceException
    {
      if(a>5000)
      {
          throw new MinimumBalanceException("Insufficient Balance");
      }
      else
      {
          System.out.println("Your amount will be generated");
      }
      
    }
    public static void main(String[] args) {
        // TODO code application logic here
    
     Atmexception1 obj=new  Atmexception1();
     double a;
     System.out.println("Enter amount to be withdrawn");
     Scanner o=new Scanner(System.in);
     a=o.nextDouble();
        try
        {
            obj.check(a);
        }
        catch(MinimumBalanceException ex)
         {
                 System.out.println("There is no minimum balance in your account");
                 System.out.println(ex.getMessage());
         }
        
    }
    
}
