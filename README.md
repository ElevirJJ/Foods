# 🍽️ Food Application API

API REST desenvolvida em **Java com Spring Boot** para gerenciamento de **restaurantes, pratos (dishes) e pedidos (orders)**, seguindo boas práticas de arquitetura em camadas.

---

## 📌 Funcionalidades

- Cadastro, listagem, atualização e remoção de **Restaurantes**
- Cadastro, listagem, atualização e remoção de **Pratos**
- Criação e gerenciamento de **Pedidos**
- Separação clara de responsabilidades (Controller, Service, Repository)
- Uso de DTOs para transferência de dados
- Persistência com **Spring Data JPA**

---

## 🏗️ Estrutura do Projeto

```text
src/main/java
└── com/seu/pacote
    ├── controller
    │   ├── DishController.java
    │   ├── OrderController.java
    │   └── RestaurantController.java
    │
    ├── domain
    │   ├── dto
    │   └── entity
    │       ├── Dish.java
    │       ├── Order.java
    │       └── Restaurant.java
    │
    ├── repository
    │   ├── DishRepository.java
    │   ├── OrderRepository.java
    │   └── RestaurantRepository.java
    │
    ├── service
    │   ├── DishService.java
    │   ├── OrderService.java
    │   └── RestaurantService.java
    │
    └── FoodApplication.java

JSON:

Pedido:

<img width="181" height="145" alt="image" src="https://github.com/user-attachments/assets/e4445927-2d47-4eb0-9e86-15a05d4f3416" />

Prato:

<img width="235" height="146" alt="image" src="https://github.com/user-attachments/assets/2dfddc3b-df50-40e6-bf1e-101901a58963" />

Restaurante:

<img width="256" height="73" alt="image" src="https://github.com/user-attachments/assets/4074dd69-44a5-46db-a508-6db8ad494c60" />
