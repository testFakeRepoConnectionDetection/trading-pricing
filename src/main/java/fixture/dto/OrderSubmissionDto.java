package fixture.dto;

/**
 * Payload sent to API Gateway when a B2B user submits an order.
 * flow data_category: ORDER_SUBMISSION
 */
public record OrderSubmissionDto(String orderId, String customerId, String sku, int quantity) {}
