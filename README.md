# 🍽️ Food Application API

API REST desenvolvida em **Java com Spring Boot** para gerenciamento de **restaurantes, pratos (dishes) e pedidos (orders)**, seguindo boas práticas de arquitetura em camadas.

---

## 📌 Funcionalidades:

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

{
	"cliente": "Elevir",
	"quantidade": 1,
	"prato":{
		 "id": 5,
		"nome": "Camarão",
  	"preco": 55.00
}
}

Prato:

{
  "nome": "Moqueca de Camarão",
  "preco": 11.00,
  "restaurante": {
    "id": 4,
    "nome": "Restaurante do Zé",
    "endereco": "Av. Central, 456"
  }
}

Restaurante:

{
	 "nome": "Moqueca de Galinha",
  "endereco": "Costinha"
}
