import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepository {

    public List<Transaction> findAll() {
        // Sample data for a three-month period
        return Arrays.asList(
            new Transaction(1L, 101L, 120.00, LocalDate.now().minusDays(10)), // 90 points
            new Transaction(2L, 101L, 50.00, LocalDate.now().minusDays(20)), // 0 points
            new Transaction(3L, 101L, 75.00, LocalDate.now().minusDays(40)), // 25 points
            new Transaction(4L, 102L, 200.00, LocalDate.now().minusDays(15)), // 250 points
            new Transaction(5L, 102L, 45.00, LocalDate.now().minusDays(45)) // 0 points
        );
    }
}
