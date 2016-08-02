
package Array;
import java.util.Scanner;
public class CountOddEvenNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int number[]=new int[20];
        int even=0,odd=0;
        System.out.println("Input 10 numbers :");
        for(int i=0;i<10;i++)
        {
            number[i]=input.nextInt();
            if(number[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }       
        }
        
        System.out.println("Even numbers : "+even+ " Odd Numbers: "+odd);
    }    
}
