package com.example.arowo.cryptocurrencyconversion;

/**
 * Created by arowo on 10/25/2017.
 */

public interface Consts {

        String CURRENCY = "extra currency";
        String BTC_RATE = "extra btc";
        String ETH_RATE = "extra eth";

        int ORDER_ALPHABETICAL = 1;
        int ORDER_BY_RATE = 2;

        String INVALID_CONVERSION = "Invalid conversion value provided";
        String REFRESH_ERROR = "Could not refresh";
        String url ="https://min-api.cryptocompare.com/data/pricemulti?fsyms=BTC,ETH&tsyms=" +
                 "NGN,USD,EUR,JPY,GBP,AUD,CAD,CHF,CNY,KES,GHS,UGX,ZAR,XAF,NZD,MYR,BND,GEL,RUB,INR";

}
