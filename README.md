# 🎮 Game List Manager 🎮

Este projeto é uma API RESTful desenvolvida com **Spring Boot**, responsável por armazenar uma lista de games com diferentes categorias. 🎯 A aplicação também permite reordenar os games através de uma interface, onde o usuário pode arrastar e soltar os jogos para modificar sua posição. 🔄

## 🚀 Tecnologias Utilizadas 🚀

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Banco de Dados H2 / PostgreSQL / MySQL** (configurável)
- **Spring Security (opcional, caso tenha autenticação)**
- **Swagger (para documentação da API)**
- **Frontend com JavaScript/React (opcional para a interface de arrastar e soltar)**

## 🎯 Funcionalidades 🎯

- Cadastro de games com nome, categoria e ordem na lista.
- Listagem de games cadastrados.
- Reordenação de games através de requisições RESTful.
- Persistência dos dados em um banco de dados.
- Documentação automática com Swagger.
- Possibilidade de integração com frontend para interatividade.
- **Interface Drag and Drop**: Caso esteja utilizando um frontend para arrastar e soltar os jogos, a API suporta requisições para reordenar a lista. Pode ser integrado com **React DnD** ou outra biblioteca de arrastar e soltar. 🎮

## 📂 Estrutura do Projeto 📂

```
/game-list-manager
│── src/main/java/com/seuusuario/gamelist
│   ├── controller (Contém os controllers da API)
│   ├── service (Camada de serviço)
│   ├── repository (Interfaces para persistência de dados)
│   ├── model (Entidades do banco de dados)
│   └── dto (Classes de transferência de dados)
│── src/main/resources
│   ├── application.properties (Configurações do banco e API)
│   └── data.sql (População inicial do banco, opcional)
│── pom.xml (Dependências do projeto)
```

## ⚙️ Instalação e Execução ⚙️

### 🛠️ Pré-requisitos 🛠️

- Java 17+
- Maven
- Banco de Dados (H2, PostgreSQL ou MySQL)

### 📌 Passos 📌

1. Clone o repositório: 🖥️
   ```bash
   git clone https://github.com/seuusuario/gamelist-manager.git
   cd gamelist-manager
   ```
2. Configure o banco de dados no `application.properties`: 🗄️
   ```properties
   spring.datasource.url=jdbc:h2:mem:gamelist
   spring.datasource.driverClassName=org.h2.Driver
   spring.datasource.username=sa
   spring.datasource.password=
   spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
   ```
3. Compile e execute o projeto: 🚀
   ```bash
   mvn spring-boot:run
   ```
4. Acesse a API no navegador ou no Postman: 🌍
   ```
   http://localhost:8080/api/games
   ```

## 🔗 Endpoints 🔗

### 📌 Criar um novo jogo 📌

```http
POST /api/games
```

**Body JSON:**

```json
{
  "name": "The Legend of Zelda",
  "category": "Ação/Aventura",
  "order": 1
}
```

### 📌 Listar todos os jogos 📌

```http
GET /api/games
```

### 📌 Atualizar a posição de um jogo 📌

```http
PATCH /api/games/reorder
```

**Body JSON:**

```json
{
  "gameId": 1,
  "newPosition": 3
}
```

## 🤝 Contribuição 🤝

Sinta-se à vontade para contribuir enviando PRs e sugestões. ✨

## 📜 Licença 📜

Este projeto está sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes. 📄

