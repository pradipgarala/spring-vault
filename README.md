# Spring Vault Demo

This project demonstrates the integration of Spring Boot with HashiCorp Vault for secret management.

## Prerequisites

*   [Docker CLI](https://docs.docker.com/engine/reference/commandline/cli/) installed on your machine.

## Getting Started

1.  **Start Vault Server:**

    Run the following command to start a local Vault server in development mode using Docker:

    ```bash
    docker run --rm -d \
    -p 8200:8200 \
    --name vault \
    -e VAULT_DEV_ROOT_TOKEN_ID=myroot \
    -e VAULT_DEV_LISTEN_ADDRESS=0.0.0.0:8200 \
    hashicorp/vault:latest \
    vault server -dev -dev-listen-address=0.0.0.0:8200
    ```

2.  **Access Vault UI:**

    Once the container is running, you can access the Vault UI in your browser at:

    [http://localhost:8200/](http://localhost:8200/)

    Use `myroot` as the token to log in.

## Resources

*   **YouTube Tutorial:** For a detailed walkthrough, check out this video: [https://www.youtube.com/watch?v=3bpO_iqRX_k](https://www.youtube.com/watch?v=3bpO_iqRX_k)
