package fixture;

/**
 * Minimal integration hints for IA connection discovery (not compiled).
 * Outbound HTTP to API Gateway and Base clients.
 */
public class IntegrationHints {

  // WebClient configured in application.yml → API Gateway
  // RestTemplate GET https://base-clients.internal/api/v1/customers → Base clients

  // @FeignClient(name = "api-gateway", url = "${app.integrations.api-gateway.base-url}")
  // interface GatewayClient { ... }
}
