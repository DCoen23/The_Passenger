package ie.atu.Passenger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PassengerTest {
    private Passenger myPass;
    @BeforeEach
    void setUp() {
        myPass = new Passenger("Mr", "John Doe", "1234334567891L", 1233456789, 42);
    }

    @Test
    void testTitle(){
        assertEquals("Mr", myPass.getTitle());
        myPass.setTitle("Ms");
        assertEquals("Ms", myPass.getTitle());
        myPass.setTitle("Mrs");
        assertEquals("Mrs", myPass.getTitle());
    }
    @Test
    void testTitleF(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mister", "John Doe", "1235473822", 1222222223, 19);});
        assertEquals("This is not a valid name. Use Mr, Ms or Mrs.", exMessage.getMessage());
        //assertNotEquals("Your title is not accepted please use Mr, Ms, Mrs" , title.Title("X"));
    }

    @Test
    void testName(){
        assertEquals("John Doe", myPass.getName());
    }
    @Test
    void testNameF(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "ls", "1235422173822L", 1222222223, 19);});
        assertEquals("This is not a valid name.", exMessage.getMessage());
        //assertEquals("XX" , name.Name("XX"));
    }

    @Test
    void testId(){
        assertEquals("1234334567891L", myPass.getId());
    }
    @Test
    void testIdF(){

        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "John Doe", "12", 1222222223, 19);});
        assertEquals("This is not a valid ID.", exMessage.getMessage());
        //assertEquals("12", id.ID("12"));
    }

    @Test
    void testPhone(){
        assertEquals(1233456789, myPass.getPhone());
    }
    @Test
    void testPhoneF(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "John Doe", "1235423221213L", 122222, 19);});
        assertEquals("This is not a valid phone number.", exMessage.getMessage());
        //assertEquals("083", num.Phone("083"));
    }

    @Test
    void testAge(){
        assertEquals(42, myPass.getAge());
    }
    @Test
    void testAgeF(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "John Doe", "1235423243243L", 1222222223, 13);});
        assertEquals("You must be over 16.", exMessage.getMessage());
        //assertEquals(16, age.Age(16));
    }

    @AfterEach
    void tearDown() {
    }
}


