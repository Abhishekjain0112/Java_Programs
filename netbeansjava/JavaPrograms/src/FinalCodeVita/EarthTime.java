/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalCodeVita;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */

/*
#include<bits/stdc++.h>
using namespace std;

int main()
{
    double p,l,diff,mint,x,y;
    cin>>p>>l;
    diff = (p/360.0)*l;
    mint = diff - (int)diff;
    diff = fmod(diff,12.0);
    //cout<<diff<<"\n";
    x = abs(diff*30 - mint*360);
  //  cout<<fixed<<setprecision(2)<<min(x, 360-x);
}

*/
public class EarthTime {
    
    public static void main(String[] args) {
         double p,l,diff,mint,x,y;
         Scanner sc=new Scanner(System.in);
         p=sc.nextDouble();
         l=sc.nextDouble();
         diff=(p/360.0)*l;
         mint = diff - (int)diff;
         diff = diff%12.0;
        x = Math.abs(diff*30 - mint*360);  
      //  System.out.println(value.setPrecision(2)+Math.min(x, 360-x));          
       //  cout<<fixed<<setprecision(2)<<min(x, 360-x);
         
    }
    
    
    
    
}
