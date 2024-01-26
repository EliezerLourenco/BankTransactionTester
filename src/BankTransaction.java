public class BankTransaction {
    private boolean canadianFunds;
    private double exchangeRate;
    private int transactionNumber;
    private long transactionReferenceNumber;
    private static int objectCount = 0; // Renamed for clarity

    /**
     * Constructor to initialize a bank transaction.
     * @param canadianFunds Indicates if the funds are Canadian.
     * @param exchangeRate The exchange rate applicable to the transaction.
     * @param transactionNumber The unique number for the transaction.
     * @param transactionReferenceNumber A reference number for the transaction.
     */
    public BankTransaction(boolean canadianFunds, double exchangeRate, int transactionNumber, long transactionReferenceNumber) {
        this.canadianFunds = canadianFunds;
        this.exchangeRate = exchangeRate;
        this.transactionNumber = transactionNumber;
        this.transactionReferenceNumber = transactionReferenceNumber;
        objectCount++; // Increment the count of BankTransaction objects created
    }

    // Standard getters and setters

    public boolean isCanadianFunds() {
        return canadianFunds;
    }

    public void setCanadianFunds(boolean canadianFunds) {
        this.canadianFunds = canadianFunds;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public long getTransactionReferenceNumber() {
        return transactionReferenceNumber;
    }

    public void setTransactionReferenceNumber(long transactionReferenceNumber) {
        this.transactionReferenceNumber = transactionReferenceNumber;
    }

    public static int getObjectCount() {
        return objectCount;
    }
}
