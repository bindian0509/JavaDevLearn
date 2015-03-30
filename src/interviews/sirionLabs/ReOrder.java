/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviews.sirionLabs;
/**
 *
 * @author bharat
 */
public class ReOrder {
    void reorder (int array[], int size) {
        
        int i,j;
        i = 0;        
        j = size-1;
        
        while (i<j) {
            while(i < size && array[i] == 1)
                i++;
            
            while(j >= 0 && array[j] == 0)
                j++;
            
            //if(i<j)
             //   swap(array, i, j);
        }
    }
    
    
    public static int foo (int n) {
        int sum = 0 ;
        int i,j;
        
        for(i=0; i<n; i++) 
            for (j=n ; j>n-i; j--)
                sum += i+j;
            
        return sum;
        
    }
    
    public static void main(String[] args) {
        int n =10;
        int res = ReOrder.foo(n);
        System.out.println("Value of Foo with value "+n+" is equals to "+res);
    }
}
