package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import static io.zipcoder.currencyconverterapplication.CurrencyType.RINGGIT;

public class Ringgit implements ConvertableCurrency {
    Double rate;
    CurrencyType type;
    public Ringgit() {
        this.type = RINGGIT;
        this.rate = RINGGIT.getRate();
    }

    public CurrencyType getType() {
        return type;
    }
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/rate;
    }
}
