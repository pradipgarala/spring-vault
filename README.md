# Spring Boot + HashiCorp Vault Integration Demo

This project provides a demonstration of how to integrate a Spring Boot application with HashiCorp Vault for centralized secret management.

## Features

*   Securely store and access application secrets (e.g., API keys, database credentials) in Vault.
*   Dynamically refresh secrets without restarting the application.
*   Leverages the Spring Vault library for seamless integration.

## Prerequisites

*   [Docker CLI](https://docs.docker.com/engine/reference/commandline/cli/) installed on your machine.

## Getting Started

### 1. Launch HashiCorp Vault

You can easily start a local Vault server in development mode using Docker:

```bash
docker run --rm -d \
  -p 8200:8200 \
  --name vault \
  -e VAULT_DEV_ROOT_TOKEN_ID=myroot \
  -e VAULT_DEV_LISTEN_ADDRESS=0.0.0.0:8200 \
  hashicorp/vault:latest
```

This command will:
*   Start a Vault container in the background.
*   Map port `8200` on your host to the container.
*   Set the root token to `myroot` for easy access.

### 2. Access the Vault UI

Once the container is running, you can access the Vault web UI at [http://localhost:8200](http://localhost:8200).

Log in with the token: `myroot`

## Usage

### Refreshing Secrets

To dynamically refresh application properties from Vault, you can trigger the `/actuator/refresh` endpoint:

```bash
curl -X POST http://localhost:8080/actuator/refresh
```

This will cause the application to re-read its configuration from Vault without requiring a restart.

## Additional Resources

*   **YouTube Tutorial:** For a detailed video walkthrough of a similar setup, see: [Spring Boot & Vault Tutorial](https://www.youtube.com/watch?v=3bpO_iqRX_k)
