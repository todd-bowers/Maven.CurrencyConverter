package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import static io.zipcoder.currencyconverterapplication.CurrencyType.CHINESE_YR;

public class ChineseYR implements ConvertableCurrency {
    Double rate;
    CurrencyType type;
    public ChineseYR() {
        this.type = CHINESE_YR;
        this.rate = CHINESE_YR.getRate();
    }

    public CurrencyType getType() {
        return type;
    }
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/rate;
    }
}
