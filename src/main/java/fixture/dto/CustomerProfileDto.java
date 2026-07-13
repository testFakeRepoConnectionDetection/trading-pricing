package fixture.dto;

/**
 * Customer master record read from Base clients referential API.
 * flow data_category: CUSTOMER_PROFILE
 */
public record CustomerProfileDto(String customerId, String legalName, String segment) {}
