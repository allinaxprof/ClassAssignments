public interface Exchangeable {
    
    public static double EarthDollar = 1.00;
    public static double MarsMoney = 1.25;
    public static double SaturnSilver = 0.55;
    public static double JupiterJingles = 2.00;
    
    //name: exchange
    //parameters: Currency other, double amount
    //function: take service fee, exchange amount
    public void exchange (Currency other, double amount);

    //name: serviceFee
    //parameters: double amount
    //function: calculate service fee
    public double serviceFee(double amount);

}