import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillers {

    @Test
    public void fromOneToFour(){
       Drillers utme = new Drillers();
       assertEquals(8000,utme.calculatePricePerCopy(3));

    }
    @Test
    public void fromFiveToNine(){
        Drillers utme = new Drillers();
        assertEquals(12600,utme.calculatePricePerCopy(7));
    }
    @Test
    public void fromTenToTwentyNine(){
        Drillers utme = new Drillers();
        assertEquals(44800,utme.calculatePricePerCopy(28));
    }
    @Test
    public void fromThirtyToFortyNine(){
        Drillers utme = new Drillers();
        assertEquals(55500,utme.calculatePricePerCopy(37));
    }
    @Test
    public void fromFiftyToNinetyNine(){
        Drillers utme = new Drillers();
        assertEquals(78000,utme.calculatePricePerCopy(60));
    }
    @Test
    public void fromHundredToHundredAndNinetyNine(){
        Drillers utme = new Drillers();
        assertEquals(144000,utme.calculatePricePerCopy(120));
    }
    @Test
    public void from2HundredTo4HundredAndNinetyNine(){
        Drillers utme = new Drillers();
        assertEquals(231000,utme.calculatePricePerCopy(210));
    }
    @Test
    public void from5HundredToInfinity(){
        Drillers utme = new Drillers();
        assertEquals(1000000,utme.calculatePricePerCopy(1000));
    }
}
