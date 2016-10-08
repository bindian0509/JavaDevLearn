/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.thirtydaysofcode;
import java.util.*;
/**
 *
 * @author bharat
 */
public class Day8DictionariesAndMap {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            hm.put(name, phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            
            if(hm.containsKey(s)) {
                System.out.println(s+"="+hm.get(s));
            } else {
                System.out.println("Not found");
            }
            
        }
        in.close();
    }
}
