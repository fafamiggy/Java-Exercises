/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salary;
import javax.swing.*;


/**
 *
 * @author Miguel Desiderio
 */
public class Salary {
    public static void main(String[] args) {
        // Request user input with JOptionPane
        int experienceYears = Integer.parseInt(JOptionPane.showInputDialog("Enter years of experience:"));
        int hoursPerWeek = Integer.parseInt(JOptionPane.showInputDialog("Enter hours worked per week:"));
        double hourlyWage = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly wage:"));

        // Calculate gross salary and apply bonus if needed
        double salary = hoursPerWeek * hourlyWage * 4; // Assuming 4 weeks per month
        if (experienceYears > 12) salary *= 1.055; // 5.5% bonus for more than 12 years

        // Apply deductions if necessary
        if (salary > 3500) salary *= 0.962; // 3.8% deduction
        else if (salary > 2500) salary *= 0.973; // 2.7% deduction

        // Display the final salary
        JOptionPane.showMessageDialog(null, "Final salary: $" + String.format("%.2f", salary));
    }
}
