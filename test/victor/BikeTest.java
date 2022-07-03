package victor;

import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class BikeTest {

    // @BeforeEach



    @Test
    public void switchOn() {
        //given
        Bike okada = new Bike();
        //when
        boolean switchOn = okada.switchOn();
        //check
        assertTrue(switchOn);

    }

    @Test
    public void switchOff() {
        //given
        Bike okada = new Bike();
        //when
        boolean switchOff = okada.switchOff();
        //check
        assertFalse(switchOff);

    }

    @Test
    public void accelerateBikeAtGear1() {
        //given
        Bike okada = new Bike();
        //when
        okada.setOn(true);
        okada.setGear(1);
        okada.setSpeed(9);

        okada.accelerate();

        System.out.println("Current Speed is" + okada.getSpeed());
        //check
        assertEquals(10, okada.getSpeed());


    }

    @Test
    public void accelerateBikeWithGear2() {
        //given
        Bike okada = new Bike();
        //when
        okada.setOn(true);
        okada.setGear(2);
        okada.setSpeed(24);
        okada.accelerate();

        System.out.println("Current Speed" +" is " + " = " + okada.getSpeed());
        //check
        assertEquals(26, okada.getSpeed());


    }
    @Test
    public void accelerateBikeWithGear3(){
        //given
        Bike okada = new Bike();
        //when
        okada.setOn(true);
        okada.setGear(3);
        okada.setSpeed(31);
        okada.accelerate();

        System.out.println("Current Speed"+"is"+ okada.getSpeed());
        //check
        assertEquals(34, okada.getSpeed());



    }
    @Test
    public void accelerateBikeWithGear4(){
        //given
        Bike okada = new Bike();
        //when
        okada.setOn(true);
        okada.setGear(4);
        okada.setSpeed(41);
        okada.accelerate();

        System.out.println("Current Speed"+"is"+ okada.getSpeed());
        //Check
        assertEquals(45,okada.getSpeed());
    }
}