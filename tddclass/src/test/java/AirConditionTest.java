import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionTest {



    @Test
    void turnOn(){
        //when
        AirCondition lg = new AirCondition();
        //given
        boolean isOn = lg.turnOn();
        //check
        assertTrue(isOn);

    }

    @Test
    void increase(){
        AirCondition lg = new AirCondition();

        lg.setTemperature(80);

       int amount = lg.increase();

       assertEquals(30, amount);
    }

}