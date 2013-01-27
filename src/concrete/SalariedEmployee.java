/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

import javax.swing.JOptionPane;

/**
 *
 * @author tim78317
 */
public class SalariedEmployee extends Employee {
    
    
    public void getSalaryEmployee(String salarypayrate, double sethours, double salary){
       salarypayrate = JOptionPane.showInputDialog("Enter the employees payrate");
       salary = Double.parseDouble(salarypayrate);
       sethours = 40;
       salarywages = sethours * salary;
       JOptionPane.showMessageDialog(null, "The Employee's salary is "+ salarywages + " a week");
    }
        
        
        
    
    
    
}
