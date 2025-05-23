/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package healthrecords;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Barbara Angelin
 */
public class HealthRecords {

    // Input object
    Scanner input = new Scanner(System.in);
    
        public static void startMessage (){
        String userName = JOptionPane.showInputDialog("Input your name");
        JOptionPane.showMessageDialog(null, "Welcome to computerization of health records, "+ userName);
    }
        
        
    public static void main(String[] args) {
        startMessage();
        
        HealthProfile newProfile = new HealthProfile("Michael","Jackson", false, 29, 8, 1958, 1.75, 59.87);
        System.out.println(newProfile.toString());
        newProfile.heartRates();
        newProfile.BMICalculator();
    }
    
}
