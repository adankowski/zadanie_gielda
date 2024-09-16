package com.matchtrade.feed.config;

import com.matchtrade.feed.api.TickerPrinter;
import com.matchtrade.feed.coinbase.CoinbaseClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BeanConfig {

    @Bean
    public CoinbaseClient getCoinbaseClient(TickerPrinter tickerPrinter){

    final CoinbaseClient client =
        new CoinbaseClient(
            "wss://ws-feed.exchange.coinbase.com", Arrays.asList("BTC-USD", "ETH-USD"));
        client.addListener(tickerPrinter);
        client.connect();

        return client;
    }
}
