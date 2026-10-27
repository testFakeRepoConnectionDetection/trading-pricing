# Trading/Pricing (fixture)

Business function: `FRONT_OFFICE` (`app.business_function`).
Pillar: `Trading & Analytics` (`app.pillar`).

Trader front and pricing model.

## Integrations (topology)

- Sends the trade to **Analytics** over HTTP (`/api/v1/trades`).
- Receives the price back from **Analytics** on `/api/v1/prices`.
- Receives the real-time price from **DataHub** on `/api/v1/prices`.
- Sends the trade to **Booking** over HTTP (`/api/v1/trades`).

## Data transiting on flows (Data Model fixture)

| Peer | direction | Kind | Channel | data | frequency |
|------|-----------|------|---------|------|-----------|
| Analytics | outbound | API | /api/v1/trades | `trade` | `real-time` |
| Analytics | inbound | API | /api/v1/prices | `price` | `real-time` |
| DataHub | inbound | API | /api/v1/prices | `price` | `real-time` |
| Booking | outbound | API | /api/v1/trades | `trade` | `real-time` |

See `TransitDataTypes.java` and `application.yml` (`data`, `frequency`).
