import java.util.ArrayList;
import java.util.List;

public class WeatherStationConcretePublisher implements Publisher{

    private double temperature;
    List<Observer> list;

    public WeatherStationConcretePublisher(){
        this.list = new ArrayList<>();
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }


    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        list.remove(observer);

    }

    @Override
    public void notifyObserver() {

        for(Observer observer : list){
            observer.update(temperature);
        }

    }
}
