/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviews;

/**
 *
 * @author bharat
 */
public class InfoEdgeTest {
    
    
    void question13 () {
        
        int i;
        
        for (i=2;i<6;i++) {
            i = i - 1; 
            System.out.println(i);
        }
        System.out.println(i);
    }
    
    void question14 () {                
        
        for (int i=2;i<6;i++) {
            i = i - 1; 
            System.out.println(i);
        }
        //System.out.println(i);
    } 
    
    void question15 () {
        int i;
        
        for (i=2;i<10;i++) {
            i = i + 2 ; 
            System.out.println(i);
        }
        System.out.println(i);
    }
    
    
    void question16 () {
        int i;
        
        for (i=2;i<10;i++) {
            i=i+2;
            if(i<9)
                break;            
        }
        for(int j=2;j<4;j++) {
            i=i+2;
            
        }
        System.err.println(i);
    }
    
    
    
    void question20 () { 
        
        int [] myArray = {1,2,3};
        
        try {
            int b = myArray[3];
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(myArray[2]);
        }
    }
    
    
    
    int reverse (int n) {
        
        int res=0;
        
        while ( n%10 != 0 ){
            int temp=n%10;
            res = res*10+temp;
            n = n/10;
        }
        return res;
    }
    
    
    
    void swapNum (int a , int b) {
        System.out.println("Before Swap Value of a :"+a+" and b : "+b);
        int temp = a+b;
        a = temp - a;
        b = temp - b;
        
        System.out.println("After Swap Value of a :"+a+" and b : "+b);
    }
    
    
    public static void main(String[] args) {
        
        
        
        InfoEdgeTest _obj = new InfoEdgeTest();
        
        _obj.swapNum(23, 34);
        
        
        System.out.println(_obj.reverse(729));
    }
    
}
