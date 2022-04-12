package com.matchtrade.feed.api;

import com.matchtrade.feed.coinbase.TickerMessage;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class TickerPrinter implements Consumer<TickerMessage> {

    @Override
    public void accept(TickerMessage tickerMessage) {
        System.out.println(tickerMessage);
    }
}
