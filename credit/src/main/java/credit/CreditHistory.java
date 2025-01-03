package credit;

import java.util.ArrayList;
import java.util.List;

public class CreditHistory {
  private final List<CreditRating> ratings = new ArrayList<>();

  public void add(CreditRating rating) {
    ratings.add(rating);
  }

  public int arithmaticMean() {
    if (ratings.isEmpty())
      return 0;

    var total = ratings.stream().mapToInt(CreditRating::rating).sum();
    return total / ratings.size();
  }
}
