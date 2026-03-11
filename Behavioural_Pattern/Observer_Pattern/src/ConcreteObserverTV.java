public class ConcreteObserverTV implements Observer{

     public String deviceName;

    public ConcreteObserverTV(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void update(double temperature) {
        System.out.println("Today Temperature displaying in "+deviceName +"is "+temperature +"Celsius");

    }
}
