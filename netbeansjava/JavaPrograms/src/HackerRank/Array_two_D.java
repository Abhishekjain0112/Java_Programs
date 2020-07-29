/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Array_two_D {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int siz=arr.length;
        
        int i=0,j=0;
        int sum=Integer.MIN_VALUE; 
        int sum1=Integer.MIN_VALUE; 
        
           // sum=arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+2]+arr[i][j]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
          
        for(i=1;i<siz-1;i++){
            
            for(j=1;j<siz-1;j++){
                
                sum1=(arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i][j]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1]);
               if(sum<sum1) {
               // a=arr[i-1][j-1];
                //b=arr[i-1][j];
                //c=arr[i-1][j+1];
                //d=arr[i][j];
                //e=arr[i+1][j-1];
                //f=arr[i+1][j];
                //g=arr[i+1][j+1];
                   sum=sum1;
               
               }
                
                
            }
            
            
        }  
        
        
        return sum;
        
        
        
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
 }
            
    
    
    

