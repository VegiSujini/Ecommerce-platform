# eCommerce Platform

This is a simple eCommerce platform that manages products, customers, and orders. The platform provides a RESTful API for interacting with these entities.

## Entities

- **Products**: Items available for purchase.
- **Customers**: Users who can purchase products.
- **Orders**: Records of products purchased by customers.

## Endpoints

### Products

- **GET /products**: Retrieve a list of all products.
- **POST /products**: Create a new product.
- **GET /products/{id}**: Retrieve a specific product by its ID.
- **PUT /products/{id}**: Update a specific product by its ID.
- **DELETE /products/{id}**: Delete a specific product by its ID.

### Customers

- **GET /customers**: Retrieve a list of all customers.
- **POST /customers**: Create a new customer.
- **GET /customers/{id}**: Retrieve a specific customer by their ID.
- **PUT /customers/{id}**: Update a specific customer by their ID.
- **DELETE /customers/{id}**: Delete a specific customer by their ID.

### Orders

- **GET /orders**: Retrieve a list of all orders.
- **POST /orders**: Create a new order.
- **GET /orders/{id}**: Retrieve a specific order by its ID.
- **PUT /orders/{id}**: Update a specific order by its ID.
- **DELETE /orders/{id}**: Delete a specific order by its ID.

## Getting Started

### Prerequisites

- [Java 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [MySQL](https://www.mysql.com/)

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/VegiSujini/Ecommerce-platform.git
   cd ecommerce-platform
