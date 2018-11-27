public class TemperatureBoard implements Observer, DisplayElement{

    private float temperature;

    @Override
    public void display() {
        System.out.println("Temperature = "+ temperature);
    }

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        display();
    }
}
