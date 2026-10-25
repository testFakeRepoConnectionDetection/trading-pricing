package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Minimal integration hints for IA connection discovery (not compiled).
 * Bidirectional HTTP with Analytics. Outbound HTTP to Booking.
 *
 * <p>Business data on flows — configure Data Model field {@code data_category}:
 * PRICED_TRADE (outbound analytics), RISK_RESULT (inbound analytics), TRADE_CAPTURE (booking).
 */
@RestController
@RequestMapping("/api/v1/risk-results")
public class IntegrationHints {

  // WebClient POST analytics /api/v1/priced-trades — data_category PRICED_TRADE (fixture.dto.PricedTradeDto)
  // POST /api/v1/risk-results from Analytics — data_category RISK_RESULT
  // RestTemplate POST booking /api/v1/trades — data_category TRADE_CAPTURE (fixture.dto.TradeCaptureDto)

  // @FeignClient(name = "analytics", url = "${app.integrations.analytics.base-url}")
  // interface AnalyticsClient { ... }

  // @FeignClient(name = "booking", url = "${app.integrations.booking.base-url}")
  // interface BookingClient { ... }
}
