package fixture.flow;

/**
 * Business data categories transiting on outbound integrations from Trading/Pricing.
 * Used by connection-discovery Data Model enrichment (grep: data_category).
 */
public final class TransitDataTypes {

  public static final String DATA_CATEGORY_MARKET_DATA = "MARKET_DATA";
  public static final String DATA_CATEGORY_TRADE_CAPTURE = "TRADE_CAPTURE";

  public static final String PAYLOAD_FORMAT = "JSON";

  private TransitDataTypes() {}
}
