import org.springframework.stereotype.Service;

@Service
public class RewardService {
    public int calculatePoints(double amount) {
        int points = 0;
        if (amount > 100) {
            points += (int) ((amount - 100) * 2);
            points += (int) (50 * 1); // 1 point for dollars between $50 and $100
        } else if (amount > 50) {
            points += (int) ((amount - 50) * 1);
        }
        return points;
    }

    public RewardService(RewardRepository rewardRepository) {
        this.rewardRepository = rewardRepository;
    }
    public long getCustomerReward(String customerId) {
    RewardSummary summary = rewardRepository.findByCustomerId(customerId);
    return summary.getPointsPerMonth()
                  .values()
                  .stream()
                  .mapToLong(Long::longValue)
                  .sum();
}
}
