package fixture.dto;

/**
 * Market data request sent to DataHub before pricing a trade.
 * flow data_category: MARKET_DATA
 */
public record MarketDataRequestDto(String instrumentId, String curveId, String asOfDate) {}
