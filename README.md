# Dog Tricks - A GraphQL Server 🐶

Dog Tricks is a Java server built with Spring Boot that provides a list of dog tricks via **GraphQL**.

## Getting Started

To run this project, ensure you have the following installed:
- **JDK 17**
- **Gradle**
- **IntelliJ IDEA**

## Running the Server

Clone this repository, navigate to its folder, and execute the following command:

```bash
./gradlew bootRun
```

## Validating the Setup

Once the server is running, open your browser and go to `http://localhost:8080/graphiql`. This will open GraphiQL, an interactive playground to run your GraphQL queries. For example:

#### Fetch a Dog Trick by ID

```graphql
query {
  trickById(id: "1") {
    id
    name
    description
  }
}
```

#### Fetch All Dog Tricks

```graphql
query {
  dogTricks {
    id
    name
    description
  }
}
```

## Contributing

As Java is not my primary expertise, any feedback or suggestions are highly appreciated. If you have ideas or found a bug, feel free to fork the repository, make your changes, and submit a pull request 🐾
