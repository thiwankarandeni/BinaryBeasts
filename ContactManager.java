import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {


    public static void main(String [] args){
        boolean exit = false;
        while(!exit) {
            Scanner sc = new Scanner(System.in);
            //display the menu
            System.out.println("\tSelect an Option");
            System.out.println("Enter 1 to display all contacts");
            System.out.println("Enter 2 to add contact");
            System.out.println("Enter 3 to remove contact");
            System.out.println("Enter 4 to edit a contact");
            System.out.println("Enter 5 to load contacts from a text file");
            System.out.println("Enter 6 to save contacts to the text file.");
            System.out.println("Enter 7 to exit from the program");
            System.out.print(">>>");
            //take the input
            int option = 0;
            try {
                option = sc.nextInt();
            }catch(Exception e){
                System.out.println("Enter a number between 1 and 7");
            }
            switch (option){
                case 1:
                    displayContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    System.out.print("Please enter name of the contact that you want to delete\n>>>");
                    String name = sc.next();
                    deleteContact(name);
                    break;
                case 4:
                    System.out.print("Please enter name of the contact that you want to change\n>>>");
                    String name2 = sc.next();
                    System.out.print("Please enter the new phone number\n>>>");
                    String phoneNumber = sc.next();
                    editContact(name2,phoneNumber);
                    break;
                case 5:
                    System.out.println("");
                    break;
                case 6:
                    saveContact();
                    break;
                case 7:
                    exit = true;
                    System.out.println("You exit from the application.");
                    break;
                default:
                    System.out.println("Invalid input.Try again");
            }
        }
    }

    public static void addContact(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your name\n>>>");
        String name = sc.next();
        System.out.print("Please Enter your phone number\n>>>");
        String phoneNumber = sc.next();
        //Create an object of Contact class
        Contact c = new Contact(name,phoneNumber);
        ContactList cl = new ContactList();
        cl.setContacts(c);
        System.out.println("Successfully added.");
    }
    public static void editContact(String name,String phoneNumber){
        ContactList cl = new ContactList();
        ArrayList<Contact> contactList = cl.getContacts();
        for(int i=0; i<contactList.size(); i++){
            if(contactList.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                contactList.get(i).setPhoneNumber(phoneNumber);
                System.out.println("Successfully updated the number of "+contactList.get(i).getName()+" to "+contactList.get(i).getPhoneNumber());
                break;
            }
        }
    }
    public static void deleteContact(String name){
        ContactList cl = new ContactList();
        ArrayList<Contact> contactList = cl.getContacts();
        for(int i=0; i<contactList.size(); i++){
            if(contactList.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                contactList.remove(i);
                System.out.println("Successfully removed "+name+" from the list.");
                break;
            }
        }
    }
    public static void displayContact(){
        ContactList cl = new ContactList();
        ArrayList<Contact> contactList = cl.getContacts();
        System.out.println("\t Contact List");
        for(int i=0; i<contactList.size(); i++){
            System.out.println(cl.getContacts().get(i).getName() +" "+cl.getContacts().get(i).getPhoneNumber());
        }
    }
    public static void saveContact(){
        ContactList cl = new ContactList();
        try {
            cl.saveData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
