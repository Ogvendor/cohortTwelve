public class AirCondition {

    private String name;
    private boolean isOn;
    private int temperature = 16;

    public AirCondition() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {

        if (temperature >= 30){
            this.temperature = 30;
        }

        if (temperature <= 16){
            this.temperature = 16;
        }

        this.temperature = temperature;
    }


    public boolean turnOn() {
        return true;
    }

    public int increase() {
        if (temperature >= 30){
            return 30;
        }
        return temperature + 1;
    }
    public int decrease() {

        if (temperature <= 16){
            return 16;
        }
        return temperature - 1;
    }
}

