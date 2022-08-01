package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import static io.zipcoder.currencyconverterapplication.CurrencyType.UNIVERSAL_CURRENCY;

public class UniversalCurrency implements ConvertableCurrency {
    Double rate;
    CurrencyType type;
    public UniversalCurrency() {
        this.type = UNIVERSAL_CURRENCY;
        this.rate = UNIVERSAL_CURRENCY.getRate();
    }

    public CurrencyType getType() {
        return type;
    }
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/rate;
    }
}
