package izzy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AirConditionerTest {


    @Test
    public void turnOn(){

        //Given
        AirConditioner ac = new AirConditioner();

        //When
        boolean on = ac.turnOn();

        //Check
        assertTrue(on);
    }

}
