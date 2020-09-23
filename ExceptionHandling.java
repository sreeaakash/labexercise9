/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.handling;

/**
 *
 * @author Admin
 */
class ex
{
    void arithmetic()
    {
        try
        {
            int a=5/0;
        }
        catch( ArithmeticException e)
        {
           System.out.println(e);
            
        }
            
        
    }
    void arrayhandling()
    {
        try
        {
            int b[]=new int [5];
            b[6]=7;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
    void numberhandling()
    {
        try
        {
            String str="hello";
            int num=Integer.parseInt(str);
        }
        catch(NumberFormatException e)
        {
                 System.out.println(e);   
        }
    }
    void stringhandling()
    {
        try
        {
            String str="apple";
            char ch=str.charAt(-1);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);   
        }
    }
}
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ex obj=new ex();
        obj.arithmetic();
        obj.numberhandling();
        obj.arrayhandling();
        obj.stringhandling();
        
    }
    
}
