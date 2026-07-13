package fixture;

/**
 * Minimal integration hints for IA connection discovery (not compiled).
 * Outbound HTTP to API Gateway and Base clients.
 *
 * <p>Business data on flows — configure Data Model field {@code data_category}:
 * ORDER_SUBMISSION (gateway), CUSTOMER_PROFILE (base clients).
 */
public class IntegrationHints {

  // WebClient → API Gateway — data_category ORDER_SUBMISSION (fixture.dto.OrderSubmissionDto)
  // RestTemplate GET base-clients — data_category CUSTOMER_PROFILE (fixture.dto.CustomerProfileDto)

  // @FeignClient(name = "api-gateway", url = "${app.integrations.api-gateway.base-url}")
  // interface GatewayClient { ... }
}
