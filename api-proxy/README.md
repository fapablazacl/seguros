# API Proxy / Gateway

## Kong Postgres
    docker run --publish 5432:5432 --name kong-postgres -e POSTGRES_PASSWORD=mysecretpassword -d postgres:9.6

## API Kong
    docker
