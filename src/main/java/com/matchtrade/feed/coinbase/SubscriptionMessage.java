package com.matchtrade.feed.coinbase;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionMessage {
  private static final String TYPE = "subscribe";

  private final String type = TYPE;

  @JsonProperty("product_ids")
  private List<String> symbols;

  private List<Object> channels;

  public static SubscriptionMessage tickerSubscription(List<String> symbols) {
    SubscriptionMessage subscription = new SubscriptionMessage();
    subscription.setSymbols(symbols);
    subscription.setChannels(List.of(new Channel("ticker", symbols)));
    return subscription;
  }
}
