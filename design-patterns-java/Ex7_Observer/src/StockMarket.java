import java.util.ArrayList;
import java.util.List;

// StockMarket.java - Concrete Subject
public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double price;

    public StockMarket(String stockName, double initialPrice) {
        this.stockName = stockName;
        this.price = initialPrice;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer registered for " + stockName);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer deregistered from " + stockName);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }

    // Called when stock price changes - triggers notifications
    public void setPrice(double newPrice) {
        System.out.println("\n" + stockName + " price changed: $" + price + " -> $" + newPrice);
        this.price = newPrice;
        notifyObservers();
    }
}
