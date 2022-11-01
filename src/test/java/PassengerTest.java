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
    void testTitleF(){assertEquals("X" , title.Title("X"));}

    @Test
    void testName(){
        assertEquals("John" , name.Name("John"));
    }
    @Test
    void testNameF(){
        assertEquals("XX" , name.Name("XX"));
    }

    @Test
    void testId(){
        assertEquals("1234567890", id.ID("1234567890"));
    }
    @Test
    void testIdF(){
        assertEquals("12", id.ID("12"));
    }

    @Test
    void testPhone(){
        assertEquals("0833808599", num.Phone("0833808599"));
    }
    @Test
    void testPhoneF(){
        assertEquals("083", num.Phone("083"));
    }

    @Test
    void testAge(){
        assertEquals(17, age.Age(17));
    }
    @Test
    void testAgeF(){
        assertEquals(16, age.Age(16));
    }

    @AfterEach
    void tearDown() {
    }
}
