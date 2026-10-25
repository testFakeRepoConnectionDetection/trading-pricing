package fixture;

/**
 * Minimal integration hints for IA connection discovery (not compiled).
 * Outbound HTTP to DataHub and Booking.
 *
 * <p>Business data on flows — configure Data Model field {@code data_category}:
 * MARKET_DATA (datahub), TRADE_CAPTURE (booking).
 */
public class IntegrationHints {

  // WebClient POST datahub /api/v1/market-data — data_category MARKET_DATA (fixture.dto.MarketDataRequestDto)
  // RestTemplate POST booking /api/v1/trades — data_category TRADE_CAPTURE (fixture.dto.TradeCaptureDto)

  // @FeignClient(name = "datahub", url = "${app.integrations.datahub.base-url}")
  // interface DataHubClient { ... }

  // @FeignClient(name = "booking", url = "${app.integrations.booking.base-url}")
  // interface BookingClient { ... }
}
