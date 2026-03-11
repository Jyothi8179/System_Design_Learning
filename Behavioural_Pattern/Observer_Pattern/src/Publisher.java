public interface Publisher {

     void addObserver(Observer observer);
     void detachObserver(Observer observer);
     void notifyObserver();
}
