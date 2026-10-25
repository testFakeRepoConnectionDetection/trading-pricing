# Trading/Pricing (fixture)

Business function: `FRONT_OFFICE` (`app.business_function`).

Trader front and pricing model.

## Integrations (topology)

- Sends the priced trade to **Analytics** over HTTP (`/api/v1/priced-trades`).
- Receives the risk result back from **Analytics** on `/api/v1/risk-results` (bidirectional with Analytics).
- Sends the captured trade to **Booking** over HTTP (`/api/v1/trades`).

## Data transiting on flows (Data Model fixture)

| Peer | Kind | direction | data_category | Evidence |
|------|------|-----------|---------------|----------|
| Analytics | API | outbound | `PRICED_TRADE` | `application.yml`, `PricedTradeDto`, `TransitDataTypes.DATA_CATEGORY_PRICED_TRADE` |
| Analytics | API | inbound | `RISK_RESULT` | `application.yml`, `TransitDataTypes.DATA_CATEGORY_RISK_RESULT` |
| Booking | API | outbound | `TRADE_CAPTURE` | `application.yml`, `TradeCaptureDto`, `TransitDataTypes.DATA_CATEGORY_TRADE_CAPTURE` |

See `src/main/java/fixture/flow/TransitDataTypes.java` and `application.yml` (`app.integrations.*.data-category`).
