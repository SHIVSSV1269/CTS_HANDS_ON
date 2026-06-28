public class Main {
    public static void main(String[] args) {
        System.out.println("=== Observer Pattern Demo ===\n");

        StockMarket appleStock = new StockMarket("AAPL", 180.00);

        Observer mobileUser1 = new MobileApp("StockTracker Pro");
        Observer mobileUser2 = new MobileApp("Robinhood");
        Observer webUser     = new WebApp("finance.yahoo.com");

        // Register observers
        appleStock.registerObserver(mobileUser1);
        appleStock.registerObserver(mobileUser2);
        appleStock.registerObserver(webUser);

        // Trigger notifications with price changes
        appleStock.setPrice(185.50);
        appleStock.setPrice(178.20);

        // Deregister one observer
        System.out.println();
        appleStock.deregisterObserver(mobileUser2);
        appleStock.setPrice(192.00);  // mobileUser2 will NOT be notified
    }
}
