import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TransactionProcessorTest {
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

    @Test
    public void shouldGetCorrectTotal() {
        final List<Transaction> data = new ArrayList<>();
        data.add(new Transaction(LocalDate.parse("2021/03/01 12:17", DATE_FORMAT), 100.0, "food"));
        data.add(new Transaction(LocalDate.parse("2021/03/01 12:29", DATE_FORMAT), 79.0, "drinks"));

        final TransactionProcessor processor = new TransactionProcessor(data);
        final double deltaOfTotals = 0.0d;

        final double expected = 179;
        final double result = processor.getTotalAmount();

        assertEquals(expected, result, deltaOfTotals);
    }

    @Test
    public void shouldGetCorrectTotalOfMonth() {
        final List<Transaction> data = new ArrayList<>();
        data.add(new Transaction(LocalDate.parse("2021/03/01 12:17", DATE_FORMAT), 100.0, "food"));
        data.add(new Transaction(LocalDate.parse("2021/03/01 12:29", DATE_FORMAT), 79.0, "drinks"));

        final TransactionProcessor processor = new TransactionProcessor(data);
        final double deltaOfTotals = 0.0d;

        final double expected = 0;
        final double result = processor.getTransactionByMonth(Month.JUNE);

        assertEquals(expected, result, deltaOfTotals);
    }

    @Test
    public void shouldGetCorrectTotalOfDesc() {
        final List<Transaction> data = new ArrayList<>();
        data.add(new Transaction(LocalDate.parse("2021/03/01 12:17", DATE_FORMAT), 100.0, "food"));
        data.add(new Transaction(LocalDate.parse("2021/04/01 12:17", DATE_FORMAT), 99.7, "food"));
        data.add(new Transaction(LocalDate.parse("2021/05/01 12:29", DATE_FORMAT), 79.0, "drinks"));

        final TransactionProcessor processor = new TransactionProcessor(data);
        final double deltaOfTotals = 0.0d;

        final double expected = 199.7;
        final double result = processor.getTransactionByDesc("food");

        assertEquals(expected, result, deltaOfTotals);
    }
}
