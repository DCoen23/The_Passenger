import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PassengerTest {
    Passenger title;
    Passenger id;
    Passenger name;
    Passenger num;
    Passenger age;
    @BeforeEach
    void setUp() {
        title = new Passenger();
        id = new Passenger();
        name = new Passenger();
        num = new Passenger();
        age = new Passenger();
    }

    @Test
    void testTitle(){
        assertEquals("Mr" , title.Title("Mr"));
    }
    @Test
    void testTitleF(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { title.Title("x");});
        assertEquals("Your title is not accepted please use Mr, Ms, Mrs", exMessage.getMessage());
        //assertNotEquals("Your title is not accepted please use Mr, Ms, Mrs" , title.Title("X"));
    }

    @Test
    void testName(){
        assertEquals("John" , name.Name("John"));
    }
    @Test
    void testNameF(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { name.Name("xx");});
        assertEquals("Your Name is invalid must have more then 3 characters", exMessage.getMessage());
        //assertEquals("XX" , name.Name("XX"));
    }

    @Test
    void testId(){
        assertEquals("1234567890", id.ID("1234567890"));
    }
    @Test
    void testIdF(){

        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { id.ID("xx");});
        assertEquals("Your ID is invalid must be more then 10 numbers", exMessage.getMessage());
        //assertEquals("12", id.ID("12"));
    }

    @Test
    void testPhone(){
        assertEquals("0833808599", num.Phone("0833808599"));
    }
    @Test
    void testPhoneF(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { num.Phone("xx");});
        assertEquals("Your number is invalid minimum number are 7", exMessage.getMessage());
        //assertEquals("083", num.Phone("083"));
    }

    @Test
    void testAge(){
        assertEquals(17, age.Age(17));
    }
    @Test
    void testAgeF(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { age.Age(15);});
        assertEquals("You must be over 16 to fly", exMessage.getMessage());
        //assertEquals(16, age.Age(16));
    }

    @AfterEach
    void tearDown() {
    }
}


