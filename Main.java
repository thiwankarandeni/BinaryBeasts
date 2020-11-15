
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Arrays;
import java.util.Scanner;

import main.Print;
import main.Add;
import main.Search;
import main.Change;
import main.Delete;

import java.io.*;
import java.net.*;
import java.util.*;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		int exit = 7;
		int answer;
		//we will loop until user wants to exit the application
		do {
                       System.out.println("--------Welcome to Phone Book---------");
                        System.out.println("Enter '1' to Display All Contact");
			System.out.println("Enter '2' to Add Contact");
			System.out.println("Enter '3' to Remove Contact");
			System.out.println("Enter '4' to Edit contact"); 
			System.out.println("Enter '5' to Load Contact From TextFile");
                        System.out.println("Enter '6' to Save Contact to TextFile");
			System.out.println("Enter '7' to Exit");
                        
                        
                        
                        
			System.out.println("Do you want to print contacts, add contact, search for contact, edit contact or delete contact?");
			System.out.println("Answer with '1', '2', '3', '4', '5', '6' or '7' to exit application.");	
			try {//we handle the input of the user
				answer = input.nextInt();
			} catch (NumberFormatException e) {
			    //e.printStackTrace();
				answer = -1;
			}
			if(answer == 1)//according to user's input we go to each class
				Print.show_contacts();
			else if(answer == 2)
				Add.add_contact();
			else if(answer == 3)
				Delete.choose_field();
			else if(answer == 4)
				Change.choose_field();
			else if(answer == 5)
				Print.show_contacts();
			 else if(answer == 6)
				Add.add_contact();
		
			
		}while(answer != exit);
		System.out.println("Exit from our system...");
	}
}
