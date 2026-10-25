package fixture.dto;

/**
 * Priced trade sent to Analytics.
 * flow data_category: PRICED_TRADE
 */
public record PricedTradeDto(String tradeId, String instrumentId, String book, String price) {}
