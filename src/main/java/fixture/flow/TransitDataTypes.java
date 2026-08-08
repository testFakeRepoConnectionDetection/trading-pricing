package fixture.flow;

/**
 * Business data categories transiting on outbound integrations from Portail client.
 * Used by connection-discovery Data Model enrichment (grep: data_category).
 */
public final class TransitDataTypes {

  public static final String DATA_CATEGORY_GATEWAY = "ORDER_SUBMISSION";
  public static final String DATA_CATEGORY_COMMANDES = "DIRECT_ORDER_CREATE";
  public static final String DATA_CATEGORY_CUSTOMERS = "CUSTOMER_PROFILE";

  public static final String PAYLOAD_FORMAT = "JSON";

  private TransitDataTypes() {}
}
