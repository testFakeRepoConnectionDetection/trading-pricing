package fixture.dto;

/**
 * Trade sent to Booking once the trader accepts the price.
 * flow data_category: TRADE_CAPTURE
 */
public record TradeCaptureDto(String tradeId, String instrumentId, String book, String side, String quantity, String price) {}
