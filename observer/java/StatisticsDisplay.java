import java.util.*;

public class StatisticsDisplay implements Observer, DisplayElement {
    private static ArrayList<Float> temperatures;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        temperatures = new ArrayList<Float>();
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        temperatures.add(temperature);
        display();
    }

    public void display() {
        int sum = 0;
        for(int i = 0; i < temperatures.size(); i++) {
            sum += temperatures.get(i);
        }

        String max = Collections.max(temperatures).toString();
        String min = Collections.min(temperatures).toString();
        String avg = ((Integer)(sum / temperatures.size())).toString();

        System.out.println("Avg/Max/Min temperature = " + avg + "/" + max + "/" + min);
    }
}