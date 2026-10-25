# Trading/Pricing (fixture)

Trader front and pricing model. Asks DataHub for market data, then captures the trade in Booking.

## Integrations (topology)

- Calls **DataHub** over HTTP for market data (`/api/v1/market-data`).
- Sends the captured trade to **Booking** over HTTP (`/api/v1/trades`).

## Data transiting on flows (Data Model fixture)

| Peer | Kind | data_category | Evidence |
|------|------|---------------|----------|
| DataHub | API | `MARKET_DATA` | `application.yml`, `MarketDataRequestDto`, `TransitDataTypes.DATA_CATEGORY_MARKET_DATA` |
| Booking | API | `TRADE_CAPTURE` | `application.yml`, `TradeCaptureDto`, `TransitDataTypes.DATA_CATEGORY_TRADE_CAPTURE` |

See `src/main/java/fixture/flow/TransitDataTypes.java` and `application.yml` (`app.integrations.*.data-category`).
