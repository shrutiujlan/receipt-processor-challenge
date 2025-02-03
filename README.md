# receipt-processor-challenge

#### Step to Run the Application

# Receipt Processor Challenge

## Steps to Run the Application

1. Clone the repository and navigate to the project root directory.
2. Ensure the shell script is executable:
   ```sh
   chmod +x run_docker_app.sh

3. Run the application:
```sh
./run_docker_app.sh
```

This script will build the Docker image and start the container. 
The application will be accessible at http://localhost:8080.

#### API Endpoints

Process Receipt: POST /receipts/process
Get Points: GET /receipts/{id}/points

#### Built With

- Java 17
- Spring 3.4.2
- Docker
