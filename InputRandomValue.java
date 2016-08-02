/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;
import java.util.Random;
public class InputRandomValue {

    public static void main(String[] args) {
       int values[]=new int[5];
       
       Random r=new Random();
       
       for(int i=0;i<values.length;i++)
       {
         values[i]=r.nextInt(100);  
       }       
        for(int i=0;i<values.length;i++)
       {
         System.out.println(values[i]);  
    }
    }
}
    

