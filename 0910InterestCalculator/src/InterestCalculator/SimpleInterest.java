package InterestCalculator;

import java.math.BigDecimal;

public class SimpleInterest {

    BigDecimal bdInitial;
    BigDecimal bdInterest;

    SimpleInterest(String sInitial, String sInterest) {
	bdInitial = new BigDecimal(sInitial);
	bdInterest = new BigDecimal(sInterest).divide(new BigDecimal(100));

    }

    public BigDecimal years(int iYears) {
	BigDecimal bdYears = new BigDecimal(iYears);
	BigDecimal bdResult = this.bdInitial.add(this.bdInitial.multiply(this.bdInterest).multiply(bdYears));

	return bdResult;
    }

}
