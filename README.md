# Portail client (fixture)

B2B portal. Integration hints for connection-discovery tests.

## Integrations (topology)

- Calls **API Gateway** for HTTP routing (`WebClient` / gateway base URL).
- Reads customer profiles from **Base clients** referential API.

## Data transiting on flows (Data Model fixture)

| Peer | Kind | data_category | Evidence |
|------|------|---------------|----------|
| API Gateway | API | `ORDER_SUBMISSION` | `application.yml`, `OrderSubmissionDto`, `TransitDataTypes.DATA_CATEGORY_GATEWAY` |
| Base clients | API | `CUSTOMER_PROFILE` | `application.yml`, `CustomerProfileDto`, `TransitDataTypes.DATA_CATEGORY_CUSTOMERS` |

See `src/main/java/fixture/flow/TransitDataTypes.java` and `application.yml` (`app.integrations.*.data-category`).
