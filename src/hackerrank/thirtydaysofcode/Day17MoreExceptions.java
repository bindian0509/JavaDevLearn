/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrank.thirtydaysofcode;

import java.util.*;

/**
 *
 * @author BHARAT VERMA <bharat.verma@shopclues.com>
 */

class Calculator {
    
    public int power (int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        } else if (p==0){ 
            return 1;
        } else if (p==1) {
            return n;
        } else {
            
            int t = n;
                while(p>1) {                
                n *= t;
                p--;
            }
        }
        
        return n;
    }
}


public class Day17MoreExceptions {

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }    
}
