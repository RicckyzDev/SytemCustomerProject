# SytemCustomer - Sistema de Gestão de Clientes

Projeto desenvolvido para fins didáticos, utilizando as principais ferramentas do ecossistema Java moderno.

---

## Sobre

Sistema básico de gestão de clientes desenvolvido em **Spring Boot**, com foco em arquitetura organizada e recursos que facilitam o desenvolvimento e testes.

### Principais Características

- **CRUD completo para clientes**
  - Cadastro, edição, remoção e listagem de clientes.
- **Interface web de exemplo com Thymeleaf**
  - Uma tela HTML de exemplificação do CRUD, para visualizar, cadastrar e editar clientes diretamente pelo navegador, utilizando o motor de templates Thymeleaf.
- **Arquitetura organizada**
  - Separação em pacotes: `controller`, `dto`, `entity`, `repository`, `service`, `usecase`.
- **Banco de dados em memória H2**
  - Não é necessário instalar nenhum banco adicional para testar; o H2 é inicializado automaticamente, facilitando o desenvolvimento e testes locais.
- **Documentação interativa da API com Swagger UI**
  - Acesse `/swagger-ui.html` após subir o projeto para visualizar e testar os endpoints da API de forma simples.
- **Uso de Lombok**
  - Redução de código repetitivo com geração automática de getters, setters e outros recursos.
- **Validação de dados**
  - Utilização de Jakarta Validation para garantir integridade dos dados de entrada.

---

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Jakarta EE / Jakarta Validation
- Lombok
- H2 Database (em memória)
- Swagger/OpenAPI
- **Thymeleaf** (template engine para página web de exemplo)

---

## Como executar e testar o projeto

1. **Clone o repositório**

   ```sh
   git clone https://github.com/RicckyzDev/SytemCustomerProject.git
   cd SytemCustomerProject
   ```

2. **Execute o projeto**

   Você pode executar diretamente pela sua IDE (IntelliJ, Eclipse, etc) rodando a classe principal, ou pela linha de comando com Maven:
   
   ```sh
   ./mvnw spring-boot:run
   ```
   Ou, se preferir:
   ```sh
   mvn spring-boot:run
   ```

3. **Acessando a interface web de exemplo (Thymeleaf)**

   Após iniciar o projeto, acesse a interface web de exemplo da aplicação em:
   
   - [http://localhost:8080/customer-list.html](http://localhost:8080/customer-list.html)
   
   Nela, você poderá visualizar o funcionamento do CRUD de clientes de maneira simples e direta pelo navegador.

4. **Testando os endpoints via Swagger UI**

   Após a inicialização, acesse a documentação interativa da API através do navegador:

   - [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

   No Swagger UI você poderá:
   - Visualizar todos os endpoints disponíveis (cadastro, busca, edição e exclusão de clientes)
   - Enviar requisições de teste sem necessidade de outra ferramenta (como Postman)
   - Visualizar exemplos de requisição e resposta para cada endpoint

5. **Visualizando e testando os dados no banco H2**

   O projeto já vem configurado para usar o banco de dados H2 em memória, que não requer instalação de banco adicional e é reiniciado a cada execução do sistema.

   - Acesse o console H2 pelo navegador em:
     - [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
   - Use as seguintes credenciais:
     - **JDBC URL**: `jdbc:h2:mem:testdb`
     - **Usuário**: `sa`
     - **Senha**: *(deixe em branco)*

   No console H2, você pode:
   - Visualizar tabelas e registros criados pelas operações da API
   - Executar comandos SQL para examinar ou testar dados manualmente

---

**Resumo:**  
Basta rodar o projeto e acessar a tela web para testar o CRUD de clientes, além de poder usar o Swagger UI para testar os endpoints facilmente, ou utilizar o console H2 para inspecionar o banco de dados em tempo real. Não é necessário configurar nenhum software extra para testes locais.

Se precisar de mais algum detalhe ou um exemplo de uso dos endpoints, ou da tela web com Thymeleaf, é só me chamar!
