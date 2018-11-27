public class HumidityBoard implements Observer, DisplayElement{
    private float humidity;

    @Override
    public void display() {
        System.out.println("Humidity = " + humidity);
    }

    @Override
    public void update(float temperature, float humidity) {
        this.humidity = humidity;
        display();
    }
}
