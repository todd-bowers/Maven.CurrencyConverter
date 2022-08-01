package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import static io.zipcoder.currencyconverterapplication.CurrencyType.AUSTRALIAN_DOLLAR;

public class AustralianDollar implements ConvertableCurrency {
    Double rate;
    CurrencyType type;
    public AustralianDollar() {
        this.type = AUSTRALIAN_DOLLAR;
        this.rate = AUSTRALIAN_DOLLAR.getRate();
    }

    public CurrencyType getType() {
        return type;
    }
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/rate;
    }
}
