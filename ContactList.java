import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ContactList {
    private static ArrayList<Contact> contacts = new ArrayList<>();

    public ContactList() {
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Contact c) {
        this.contacts.add(c);
    }
    public void saveData() throws Exception{
        FileWriter fw = new FileWriter("contact-details.txt");
        PrintWriter pw = new PrintWriter(fw);
        for(int i=0;i<contacts.size();i++){
            pw.println(contacts.get(i).getName() +" " + contacts.get(i).getPhoneNumber());
        }
        pw.flush();
        pw.close();
        System.out.println("File saved.");
    }
}
