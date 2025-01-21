package credit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

public class ACreditHistory {
  CreditHistory creditHistory;

  @BeforeEach
  void setup() {
    creditHistory = new CreditHistory();
  }

  @Test
  void withNoCreditRatingsHas0Mean() {
    var result = creditHistory.arithmaticMean();

    assertEquals(0, result);
  }

  @Test
  void withTMultipleCreditRatingsHasTheMean() {
    creditHistory.add(new CreditRating(780));
    creditHistory.add(new CreditRating(800));
    creditHistory.add(new CreditRating(820));

    var result = creditHistory.arithmaticMean();

    assertEquals(800, result);
  }
}
