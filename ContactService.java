import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts;
    
    public ContactService() {
        contacts = new HashMap<>();
    }
    
    public void addContact(Contact contact) {
        if(contact == null)
            throw new IllegalArgumentException("Contact cannot be null");
        if(contacts.containsKey(contact.getContactID()))
            throw new IllegalArgumentException("Contact ID must be unique");
        contacts.put(contact.getContactID(), contact);
    }
    
    public void deleteContact(String contactID) {
        if(contactID == null)
            throw new IllegalArgumentException("Contact ID cannot be null");
        if(!contacts.containsKey(contactID))
            throw new IllegalArgumentException("Contact not found");
        contacts.remove(contactID);
    }
    
    public void updateFirstName(String contactID, String firstName) {
        if(contactID == null)
            throw new IllegalArgumentException("Contact ID cannot be null");
        if(!contacts.containsKey(contactID))
            throw new IllegalArgumentException("Contact not found");
        contacts.get(contactID).setFirstName(firstName);
    }
    
    public void updateLastName(String contactID, String lastName) {
        if(contactID == null)
            throw new IllegalArgumentException("Contact ID cannot be null");
        if(!contacts.containsKey(contactID))
            throw new IllegalArgumentException("Contact not found");
        contacts.get(contactID).setLastName(lastName);
    }
    
    public void updatePhone(String contactID, String phone) {
        if(contactID == null)
            throw new IllegalArgumentException("Contact ID cannot be null");
        if(!contacts.containsKey(contactID))
            throw new IllegalArgumentException("Contact not found");
        contacts.get(contactID).setPhone(phone);
    }
    
    public void updateAddress(String contactID, String address) {
        if(contactID == null)
            throw new IllegalArgumentException("Contact ID cannot be null");
        if(!contacts.containsKey(contactID))
            throw new IllegalArgumentException("Contact not found");
        contacts.get(contactID).setAddress(address);
    }
    
    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }
}