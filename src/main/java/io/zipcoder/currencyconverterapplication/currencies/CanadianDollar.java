package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import static io.zipcoder.currencyconverterapplication.CurrencyType.CANADIAN_DOLLAR;

public class CanadianDollar implements ConvertableCurrency {
    Double rate;
    CurrencyType type;
    public CanadianDollar() {
        this.type = CANADIAN_DOLLAR;
        this.rate = CANADIAN_DOLLAR.getRate();
    }

    public CurrencyType getType() {
        return type;
    }
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/rate;
    }
}
