# Customer-Service
Service to Serve Customer Data

Data base: Spring H2

Connect to H2 console using: http://localhost:8080/h2-console

**APIs**
1. GET customer by Id: http://localhost:8080/customers/get_customer?id=1
2. DELETE customer by Id: http://localhost:8080/customers/delete_customer?id=1
3. SAVE customer by Id: curl --request POST \
  --url http://localhost:8080/customers/save_customer \
  --header 'Content-Type: application/json' \
  --data '{
	"customer_name": "deepti",
	"order_id": 123,
	"address": "xyzzz"
}'
