public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        HumidityBoard humidityBoard = new HumidityBoard();
        TemperatureBoard temperatureBoard = new TemperatureBoard();

        weatherData.registerObserver(humidityBoard);
        weatherData.registerObserver(temperatureBoard);
        weatherData.setMeasurements(35, 80);

        weatherData.removeObserver(humidityBoard);
        weatherData.setMeasurements(30, 70);

    }
}
