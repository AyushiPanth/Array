
package Array;
import java.util.Scanner;
public class ArrayInputOutput {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int number[]=new int[10];
        System.out.println("Input 5 numbers : ");
        
        for(int i=0;i<5;i++)
        {
            number[i]=input.nextInt();
        }
        System.out.println("output : ");
        for(int i=0;i<5;i++)
        {
            System.out.println(number[i]);
        }
    }
  }
