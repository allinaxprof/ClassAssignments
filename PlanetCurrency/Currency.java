public abstract class Currency implements Exchangeable {
    
    String currencyName;
    String planetName;
    double totalFunds;

    //currency name getter
    public abstract String getCurrencyName ();

    //fund getter
    public abstract double getTotalFunds ();

    //fund setter
    public abstract void setTotalFunds (double amount);

    //name getter
    public abstract String getPlanetName ();

    //name: toEarthDollars
    //function: convert currency to ED
    public abstract double toEarthDollars(double amount);

    //name: fromEarthDollars
    //function: convert ED to currency
    public abstract double fromEarthDollars(double earthDollars);

}
