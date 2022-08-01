package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import static io.zipcoder.currencyconverterapplication.CurrencyType.SINGAPORE_DOLLAR;

public class SingaporeDollar implements ConvertableCurrency {
    Double rate;
    CurrencyType type;
    public SingaporeDollar() {
        this.type = SINGAPORE_DOLLAR;
        this.rate = SINGAPORE_DOLLAR.getRate();
    }

    public CurrencyType getType() {
        return type;
    }
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/rate;
    }
}
