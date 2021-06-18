import java.time.Month;
import java.util.List;

public class TransactionProcessor {
    private final List<Transaction> transactionList;

    public TransactionProcessor(List<Transaction> transactions) {
        this.transactionList = transactions;
    }

    public double getTotalAmount() {
        double total = 0d;
        for(Transaction transaction: transactionList) {
            total += transaction.getAmount();
        }
        return total;
    }

    public double getTransactionByMonth(final Month month) {
        double total = 0d;
        for(Transaction transaction: transactionList) {
            if (transaction.getDate().getMonth() == month) {
                total += transaction.getAmount();
            }
        }
        return total;
    }

    public double getTransactionByDesc(final String desc) {
        double total = 0d;
        for(Transaction transaction: transactionList) {
            if (transaction.getDescription().equals(desc)) {
                total += transaction.getAmount();
            }
        }
        return total;
    }
}
