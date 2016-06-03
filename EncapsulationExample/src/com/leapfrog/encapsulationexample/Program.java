/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.encapsulationexample;

import com.leapfrog.encapsulationexample.util.Student;
import java.util.Scanner;

/**
 *
 * @author onesoft
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        
        System.out.println("Enter id : ");
        student.setId(input.nextInt());
        System.out.println("Enter First Name: ");
        student.setFirstName(input.next());
        System.out.println("Enter Last Name : ");
        student.setLastName(input.next());
        System.out.println("Enter Email : ");
        student.setEmail(input.next());
        System.out.println("Enter Contact Number : ");
        student.setContactNo(input.next());
        System.out.println("Enter Status: ");
        student.setStatus(input.nextBoolean());
        
        
        System.out.println("ID is : " + student.getId());
        System.out.println("Full Name is : " + student.getFirstName() + " " + student.getLastName());
        System.out.println("Email Adress is : " + student.getEmail());
        System.out.println("Contact Number is : " + student.getContactNo());
        System.out.println("Status is : " + student.isStatus());
    }
    
}
