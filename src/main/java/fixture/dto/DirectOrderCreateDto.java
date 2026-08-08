package fixture.dto;

/**
 * Payload sent directly to Service commandes over HTTP (bypass gateway).
 * flow data_category: DIRECT_ORDER_CREATE
 */
public record DirectOrderCreateDto(String orderId, String customerId, String sku, int quantity) {}
