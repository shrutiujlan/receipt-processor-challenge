# receipt-processor-challenge

#### Step to Run the Application

- Clone the repository and navigate to the project root directory.

- Ensure the shell script is executable:

chmod +x run_docker_app.sh

- Run the application:

./run_docker_app.sh

This script will build the Docker image and start the container. 
The application will be accessible at http://localhost:8080.

#### API Endpoints

Process Receipt: POST /receipts/process
Get Points: GET /receipts/{id}/points

#### Built With

- Java 17
- Spring 3.4.2
- Docker