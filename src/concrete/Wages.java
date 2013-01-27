
package concrete;

import javax.swing.JOptionPane;



/**
 *
 * @author tim78317
 */
public class Wages {
  
    
    public static void main(String[] args){
        
   String hours = "";
   String payrate = "";
   double grossincome= 0;
   String salarypayrate = "";
   double sethours =0;
   double salary = 0;
   
   
        String input = JOptionPane.showInputDialog("What would you like to do?"+"\n To check Employee's information press 1"
                + "\n To check hourly paid employee press 2" + " \n To check Salary paid employee press 3");
        switch (input) {
            case "1":
                Employee person = new Employee();
                person.getEmployeeInfo();
                break;
            case "2":
                HourlyEmployee method = new HourlyEmployee();
                method.getHourlyPay(hours, payrate, grossincome);
                break;
            case "3":
                SalariedEmployee e = new SalariedEmployee();
                e.getSalaryEmployee(salarypayrate, sethours, salary);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please enter a valid number");
                break;
        }
                
            }
            
            }      
       
    
    
    
