# Microwhat?

### Requirements

[Docker Keycloak](https://www.keycloak.org/)

```sh
docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:22.0.1 start-dev
```

[Docker Zipkin](https://zipkin.io/)

```sh
docker run -d -p 9411:9411 openzipkin/zipkin
```
