/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

public class TwoDimensionalArrayIO {

    public static void main(String[] args)throws IOException {
        Scanner input=new Scanner (System.in);
        int i,j;
        int numbers[][]=new int[4][4];
        System.out.println("Input 9 numbers: ");
       
        for(i=0;i<4;i++)
        {
          for(j=0;j<4;j++)
             a[i][j]=input.nextInt();
        }
    }
    
}
