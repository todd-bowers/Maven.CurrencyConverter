package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import static io.zipcoder.currencyconverterapplication.CurrencyType.EURO;


public class Euro implements ConvertableCurrency {
    Double rate;
    CurrencyType type;
    public Euro() {
        this.type = EURO;
        this.rate = EURO.getRate();
    }

    public CurrencyType getType() {
        return type;
    }
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/rate;
    }
}
