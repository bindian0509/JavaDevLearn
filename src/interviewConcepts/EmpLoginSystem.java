/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewConcepts;

/**
 *
 * @author bharat
 */
public class EmpLoginSystem {
    
    
    static {
        System.err.println("Day on !");
    }   
    int empLoginCounter = 0;
    
    int empId;
    String empFirstName;
    String empLastName;
    
    final String loginGate = "Eden Garden End";

    public EmpLoginSystem(int empId, String empFirstName, String empLastName) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
    }    
    
    void increment() {
        empLoginCounter++;
        System.err.println("Employee Login Counter : "+empLoginCounter);
    }
    
    public static void main (String args[]) {
        
        EmpLoginSystem emp1 = new EmpLoginSystem(1001,"Alex", "Brandman");
        emp1.increment();
        EmpLoginSystem emp2 = new EmpLoginSystem(1002,"Alexo", "Brandman0");
        emp2.increment();
        EmpLoginSystem emp3 = new EmpLoginSystem(1003,"Alex00", "Brandman00");
        emp3.increment();
    }
}
