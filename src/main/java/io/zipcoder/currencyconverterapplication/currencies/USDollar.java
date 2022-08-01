package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import static io.zipcoder.currencyconverterapplication.CurrencyType.US_DOLLAR;

public class USDollar implements ConvertableCurrency {
    Double rate;
    CurrencyType type;
    public USDollar() {
        this.type = US_DOLLAR;
        this.rate = US_DOLLAR.getRate();
    }

    public CurrencyType getType() {
        return type;
    }
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/rate;
    }
}
