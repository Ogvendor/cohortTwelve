public class Drillers {
    private int calculatePricePerCopy;

    public int calculatePricePerCopy(int copies) {
        if (copies >= 1 && copies <= 4) {
            calculatePricePerCopy = 4 * 2000;
        }
        else if (copies >= 5 && copies <=9){
            calculatePricePerCopy = 7 * 1800;
        }
        else if (copies >= 10 && copies <= 29){
            calculatePricePerCopy = 28 * 1600;
        }
        else if (copies >= 30 && copies <= 49){
            calculatePricePerCopy = 37 * 1500;
        }
        else if (copies >= 50 && copies <=99){
            calculatePricePerCopy = 60 * 1300;
        }
        else if (copies >= 100 && copies <= 199){
            calculatePricePerCopy = 120 * 1200;
        }
        else if (copies >= 200 && copies <= 499){
            calculatePricePerCopy = 210 * 1100;
        }
        else if (copies >= 500){
            calculatePricePerCopy = 1000 * 1000;

        }

        return calculatePricePerCopy;
    }

}
