
package concrete;

import javax.swing.JOptionPane;

/**
 *
 * @author tim78317
 */
public class HourlyEmployee extends Employee {
    

    
    public void getHourlyPay(String hours, String payrate,  double grossincome){
       hours  = JOptionPane.showInputDialog("How many hours did the employee work?");
       hoursworked = Double.parseDouble(hours);
       
       
       payrate = JOptionPane.showInputDialog("What is the employee's pay rate?");
       hourlypay= Double.parseDouble(payrate);
        
        grossincome = hourlypay*hoursworked;
        JOptionPane.showMessageDialog(null, grossincome);
        
   
       
    }
    
    
}
