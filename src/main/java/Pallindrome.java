import java.util.*;
class Pallindrome
{  
    public static void main(String args[]){  
      int r,sum=0,temp;    
      //Scanner in = new Scanner(System.in);
      //System.out.println("Enter the number");
      //int n = in.nextInt(); 
      //for the changes2
      //changes to be published
      //nex
      int n=12321;
      temp=n;    
      while(n>0){    
       r=n%10;  //getting remainder  
       sum=(sum*10)+r;    
       n=n/10;    
      }    
      if(temp==sum)    
       System.out.println("palindrome number ");    
      else    
       System.out.println("not palindrome");    
    }  
    }  
