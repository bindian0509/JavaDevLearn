/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.thirtydaysofcode;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Scanner;

/**
 *
 * @author bharat
 */
public class Day6Review {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
                        
        int _t_cases = scan.nextInt();
        String[] tArr = new String[_t_cases];
        
        for(int i=0;i<_t_cases;i++){
            tArr[i] = scan.next();
        }
        
        for(int i=0;i<_t_cases;i++){            
            char[] ch = tArr[i].toCharArray();            
            StringBuilder even =new StringBuilder();
            StringBuilder odd =new StringBuilder();
            for(int j=0;j<ch.length;j++) {                
                if(j%2==0)
                    even.append(ch[j]);
                else
                    odd.append(ch[j]);
            }

            System.out.println(even+" "+odd);
        }
            
        
        
        
    }
}
