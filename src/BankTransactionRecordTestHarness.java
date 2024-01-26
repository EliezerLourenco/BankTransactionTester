import java.util.Random;

public class BankTransactionRecordTestHarness {

    public static void main (String[] args) {
        Random random = new Random();
        BankTransaction[] bankTransactionArray = new BankTransaction[500];

        for (int i = 0; i < bankTransactionArray.length; i++) {
            boolean canadianFunds = random.nextBoolean();
            double exchangeRate = random.nextDouble() * 2; // Example: Get a rate between 0 and 2
            int transactionNumber = random.nextInt(10000); // Example: Get a transaction number between 0 and 10000
            long transactionReferenceNumber = random.nextLong();

            BankTransaction newBankTransaction = new BankTransaction(canadianFunds, exchangeRate, transactionNumber, transactionReferenceNumber);
            bankTransactionArray[i] = newBankTransaction;

            System.out.println("Record " + (i+1) + ":");
            System.out.println("Canadian Fund: " + newBankTransaction.isCanadianFunds());
            System.out.printf("Exchange Rate: %.2f%n", newBankTransaction.getExchangeRate());
            System.out.println("Transaction Number: " + newBankTransaction.getTransactionNumber());
            System.out.println("Transaction Reference Number: " + newBankTransaction.getTransactionReferenceNumber());
            System.out.println("-----------------------------------");
        }

        // Additional functionality can be added here, like user interactions to modify or view the transactions
    }
}
