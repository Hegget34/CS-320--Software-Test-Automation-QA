import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactTest {
    
    @Test
    void testContactCreation() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("1234567890", contact.getContactID());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }
    
    @Test
    void testContactIDTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St");
        });
    }
    
    @Test
    void testContactIDNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "John", "Doe", "1234567890", "123 Main St");
        });
    }
    
    @Test
    void testFirstNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "JohnJacobJi", "Doe", "1234567890", "123 Main St");
        });
    }
    
    @Test
    void testFirstNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", null, "Doe", "1234567890", "123 Main St");
        });
    }
    
    @Test
    void testLastNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", "DoeDoeDoeD", "1234567890", "123 Main St");
        });
    }
    
    @Test
    void testLastNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", null, "1234567890", "123 Main St");
        });
    }
    
    @Test
    void testPhoneNotTenDigits() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", "Doe", "123456789", "123 Main St");
        });
    }
    
    @Test
    void testPhoneNotAllDigits() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", "Doe", "123456789a", "123 Main St");
        });
    }
    
    @Test
    void testPhoneNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", "Doe", null, "123 Main St");
        });
    }
    
    @Test
    void testAddressTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St Apt 1 Building 2 Floor 3");
        });
    }
    
    @Test
    void testAddressNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", "Doe", "1234567890", null);
        });
    }
}