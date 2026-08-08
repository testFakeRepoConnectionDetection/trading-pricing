package fixture;

/**
 * Minimal integration hints for IA connection discovery (not compiled).
 * Outbound HTTP to API Gateway, Service commandes, and Base clients.
 *
 * <p>Business data on flows — configure Data Model field {@code data_category}:
 * ORDER_SUBMISSION (gateway), DIRECT_ORDER_CREATE (service commandes),
 * CUSTOMER_PROFILE (base clients).
 */
public class IntegrationHints {

  // WebClient → API Gateway — data_category ORDER_SUBMISSION (fixture.dto.OrderSubmissionDto)
  // RestTemplate POST service-commandes /api/v1/orders — data_category DIRECT_ORDER_CREATE
  //   (fixture.dto.DirectOrderCreateDto)
  // RestTemplate GET base-clients — data_category CUSTOMER_PROFILE (fixture.dto.CustomerProfileDto)

  // @FeignClient(name = "api-gateway", url = "${app.integrations.api-gateway.base-url}")
  // interface GatewayClient { ... }

  // @FeignClient(name = "service-commandes", url = "${app.integrations.service-commandes.base-url}")
  // interface OrdersClient { ... }
}
