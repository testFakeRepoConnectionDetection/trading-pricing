package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Outbound trades to Analytics and Booking. Inbound price from Analytics and DataHub.
 *
 * <p>Edge fields: data, frequency. trade/real-time toward Analytics and Booking.
 * price/real-time inbound from Analytics and DataHub.
 */
@RestController
@RequestMapping("/api/v1/prices")
public class IntegrationHints {

  // POST /api/v1/prices from Analytics — data price, frequency real-time
  // POST /api/v1/prices from DataHub — data price, frequency real-time
  // HTTP POST analytics /api/v1/trades — data trade, frequency real-time
  // HTTP POST booking /api/v1/trades — data trade, frequency real-time
}
