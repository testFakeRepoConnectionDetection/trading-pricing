package fixture.flow;

/**
 * Business data categories on Trading/Pricing integrations.
 * Used by connection-discovery Data Model enrichment (grep: data_category).
 */
public final class TransitDataTypes {

  /** Node attribute business_function for Trading/Pricing. */
  public static final String BUSINESS_FUNCTION = "FRONT_OFFICE";

  /** Node attribute pillar for Trading/Pricing. */
  public static final String PILLAR = "Trading & Analytics";

  public static final String DATA_CATEGORY_PRICED_TRADE = "PRICED_TRADE";
  public static final String DATA_CATEGORY_RISK_RESULT = "RISK_RESULT";
  public static final String DATA_CATEGORY_TRADE_CAPTURE = "TRADE_CAPTURE";

  public static final String PAYLOAD_FORMAT = "JSON";

  private TransitDataTypes() {}
}
