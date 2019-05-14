import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mmcalvarez on 5/13/2019.
 */
public class ContactsTest {
    Contacts contacts = new Contacts();

    @Test
    public void testAddContact() throws Exception {
        contacts.addContact("wina");
        assertTrue(contacts.searchContact("wina"));
        System.out.println(contacts.printContacts());
    }

    @Test
    public void testDeleteContact() throws Exception {
        contacts.addContact("wina");
        contacts.addContact("em");
        contacts.addContact("ruffa");
        contacts.deleteContact("ruffa");
        assertFalse(contacts.searchContact("ruffa"));
        assertEquals(contacts.printContacts(), "em wina ");
        System.out.println(contacts.printContacts());
    }

    @Test
    public void testUpdateContact() throws Exception {
        contacts.addContact("em");
        contacts.addContact("wina");
        contacts.addContact("ruffa");
        contacts.updateContact("em", "mary");
        assertFalse(contacts.searchContact("em"));
        assertTrue(contacts.searchContact("mary"));
        System.out.println(contacts.printContacts());
    }

}
