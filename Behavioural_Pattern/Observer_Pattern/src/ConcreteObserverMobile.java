public class ConcreteObserverMobile implements Observer{
    public String deviceName;

    public ConcreteObserverMobile(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void update(double temperature) {
        System.out.println("Today Temperature displaying in "+deviceName +"is "+temperature +"Celsius");

    }
}
