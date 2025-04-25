import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
    
    private ContactService contactService;
    
    @BeforeEach
    void setUp() {
        contactService = new ContactService();
    }
    
    @Test
    void testAddContact() {
        Contact contact = new Contact("1234", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        
        Contact retrieved = contactService.getContact("1234");
        assertEquals("1234", retrieved.getContactID());
        assertEquals("John", retrieved.getFirstName());
    }
    
    @Test
    void testAddDuplicateContact() {
        Contact contact1 = new Contact("1234", "John", "Doe", "1234567890", "123 Main St");
        Contact contact2 = new Contact("1234", "Jane", "Smith", "9876543210", "456 Oak Ave");
        
        contactService.addContact(contact1);
        
        assertThrows(IllegalArgumentException.class, () -> {
            contactService.addContact(contact2);
        });
    }
    
    @Test
    void testDeleteContact() {
        Contact contact = new Contact("1234", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        
        contactService.deleteContact("1234");
        
        assertNull(contactService.getContact("1234"));
    }
    
    @Test
    void testDeleteNonExistentContact() {
        assertThrows(IllegalArgumentException.class, () -> {
            contactService.deleteContact("nonexistent");
        });
    }
    
    @Test
    void testUpdateFirstName() {
        Contact contact = new Contact("1234", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        
        contactService.updateFirstName("1234", "Jane");
        
        Contact updated = contactService.getContact("1234");
        assertEquals("Jane", updated.getFirstName());
    }
    
    @Test
    void testUpdateLastName() {
        Contact contact = new Contact("1234", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        
        contactService.updateLastName("1234", "Smith");
        
        Contact updated = contactService.getContact("1234");
        assertEquals("Smith", updated.getLastName());
    }
    
    @Test
    void testUpdatePhone() {
        Contact contact = new Contact("1234", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        
        contactService.updatePhone("1234", "9876543210");
        
        Contact updated = contactService.getContact("1234");
        assertEquals("9876543210", updated.getPhone());
    }
    
    @Test
    void testUpdateAddress() {
        Contact contact = new Contact("1234", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        
        contactService.updateAddress("1234", "456 Oak Ave");
        
        Contact updated = contactService.getContact("1234");
        assertEquals("456 Oak Ave", updated.getAddress());
    }
}