public class Jupiter extends Currency {

    int feeCounter = 0;

    String currencyName = "JupiterJingles";
    String planetName = "Jupiter";
    double totalFunds;
    
    public Jupiter () {
        totalFunds = 100;
    }

    public Jupiter (double funds) {
        totalFunds = funds;
    }

    //fund setter
    public void setTotalFunds (double amount) {
        totalFunds = amount;
    }

    //name getter
    public String getCurrencyName ()  {
        return currencyName;
    }

    //fund getter
    public double getTotalFunds () {
        return totalFunds;
    }
    
    //name getter
    public String getPlanetName () {
        return planetName;
    }

    //name: toEarthDollars
    //function: convert currency to ED
    public double toEarthDollars(double amount) {
        return (amount / JupiterJingles); //ED
    }

    //name: fromEarthDollars
    //function: convert ED to currency
    public double fromEarthDollars(double earthDollars) {
        return (earthDollars * JupiterJingles); //currency
    }

    //name: serviceFee
    //function: calculate service fee
    @Override
    public double serviceFee (double amount) {

        if (feeCounter == 0) {
            return 0;
        }
        else {
            return amount * 0.1;
        }
    }

    //name: exchange
    //parameters: Currency other, double amount
    //function: calculate service fee, take service fee, exchange amount

    @Override
    public void exchange(Currency other, double amount) {
        
        double ed = toEarthDollars(amount);
        double convertedAmount = other.fromEarthDollars(ed);
        double fee = serviceFee(amount);
        feeCounter ++;
        //System.out.println(amount + fee);     //test
        
        if (totalFunds <= (amount + fee)) {

            System.out.println("Uh oh - " + planetName + " only has an available balance of " + String.format("%.2f",totalFunds)
                + " which is less than " + String.format("%.2f",(amount + fee)));
            System.out.println("");

        }
        else {
            //amount gets given away + service fee
            totalFunds -= (amount + fee);

            //otherCurrency adds convertedAmount
            other.setTotalFunds(other.getTotalFunds() + convertedAmount);

            System.out.println("Converting from " + currencyName + " to " + other.getCurrencyName() + " and initiating transfer...");

            System.out.println(String.format("%.2f",amount) + " " + currencyName + " = " + String.format("%.2f",ed) 
                + " EarthDollars = " + String.format("%.2f",convertedAmount) + " " + other.getCurrencyName());

            System.out.println(planetName + " exchange fee is " + String.format("%.2f",fee) + " " + currencyName);
            System.out.println(planetName + " has a total of " + String.format("%.2f",totalFunds) + " " + currencyName);
            System.out.println(other.getPlanetName() + " has a total of " + String.format("%.2f",other.getTotalFunds()) + " " + other.getCurrencyName());
            System.out.println("");
        }
    }
    
}
