/**
 * Created by mmcalvarez on 5/13/2019.
 */
public class Contacts {
    private BST contacts;

    public Contacts() {
        this.contacts = new BST();
    }

    public void addContact(String contact) throws Exception {
        this.contacts.add(contact);
    }

    public void deleteContact(String contact) throws Exception {
        this.contacts.remove(contact);
    }

    public boolean searchContact(String contact) {
        return this.contacts.contains(contact);
    }

    public void updateContact(String oldCon, String newCon) throws Exception {
        this.contacts.remove(oldCon);
        this.contacts.add(newCon);
    }

    public String printContacts() {
        return this.contacts.toString();
    }
}
