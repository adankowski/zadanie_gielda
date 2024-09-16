package com.matchtrade.feed.coinbase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class TickerMessage {
  @JsonProperty("product_id")
  private String symbol;

  @JsonProperty("best_bid")
  private BigDecimal bid;

  @JsonProperty("best_ask")
  private BigDecimal ask;

  private BigDecimal price;
  private ZonedDateTime time;
}
