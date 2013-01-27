
package concrete;

import javax.swing.JOptionPane;

/**
 *
 * @author tim78317
 */
public class Employee {
    
  public int ID; 
   public double hourlypay;
   public double hoursworked;
  public double salarywages;
   String name1 = "John";
   String name2 = "Beth";
   String name3 = "Gary";
   String gender1 = "Male";
   String gender2 = "Female";
   String wagetype1 = "Hourly";
   String wagetype2="Salary";
   String id;
   

    public void getEmployeeInfo(){
        id = JOptionPane.showInputDialog("Please enter the Employee's ID number "+"\n 1234"+"\n2345"+"\n3456");
        switch (id) {
            case "1234":
                JOptionPane.showMessageDialog(null, "Here is the employee's information "+"\n"+name1+"\n"+gender1+"\n"+wagetype1+"=$23 an hour");
                break;
            case "2345":
                JOptionPane.showMessageDialog(null, "Here is the employee's information "+"\n"+name2+"\n"+gender2+"\n"+wagetype2+"=$34 an hour");
                break;
            case "3456":
                JOptionPane.showMessageDialog(null, "Here is the employee's information "+"\n"+name3+"\n"+gender1+"\n"+wagetype2+"=$26 an hour");
                break;
            default:
                JOptionPane.showMessageDialog(null, "please enter a valid number");
                break;
        }
    }
    }
    
    
   

