package fixture.flow;

/**
 * Edge attributes on Trading/Pricing flows.
 * grep: data frequency trade price real-time DataHub
 */
public final class TransitDataTypes {

  /** Node attribute business_function for Trading/Pricing. */
  public static final String BUSINESS_FUNCTION = "FRONT_OFFICE";

  /** Node attribute pillar for Trading/Pricing. */
  public static final String PILLAR = "Trading & Analytics";

  public static final String DATA_TRADE = "trade";
  public static final String DATA_PRICE = "price";
  public static final String FREQUENCY_REAL_TIME = "real-time";

  private TransitDataTypes() {}
}
