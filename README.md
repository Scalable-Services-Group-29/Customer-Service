# Customer-Service
Service to Serve Customer Data

Data base: Spring H2

Connect to H2 console using: http://localhost:9003/h2-console

**APIs**
1. GET customer by Id: http://localhost:9003/customers/get_customer?id=1
2. DELETE customer by Id: http://localhost:9003/customers/delete_customer?id=1
3. SAVE customer by Id: curl --request POST \
  --url http://localhost:9003/customers/save_customer \
  --header 'Content-Type: application/json' \
  --data '{
	"customer_name": "deepti",
	"order_id": 123,
	"address": "xyzzz"
}'

**DOCKER SETUP**
(Steps required to run the service in docker)
1. Use gradle -> build to build the jar file for the CustomerService
2. Run "docker build --build-arg JAR_FILE=build/libs/Customer-Service-0.0.1-SNAPSHOT.jar -t scalable-services/customer-service-spring-boot-docker ." command in the terminal to create the docker image for customer service
3. Run "docker run -p 9002:9002 -t scalable-services/customer-service-spring-boot-docker" command to run the docker image which was created in previous step
