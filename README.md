<h1 align="center"> 
    Voll-Med
</h1>

<p align="center">
 <a href="#-sobre-o-projeto">Sobre</a> •
 <a href="#-funcionalidades">Funcionalidades</a> •
 <a href="#-Configuração-do-ambiente">Configuração do ambiente</a> • 
 <a href="#-como-executar">Como executar</a> • 
 <a href="#-tecnologias">Tecnologias</a> 
</p>

---

### 🪐 Sobre o projeto

Este é um projeto de back-end para uma clínica médica fictícia. O objetivo é aprender a criar um CRUD através do curso 
‘Spring Boot 3: Desenvolva uma API Rest na plataforma Java’ oferecido pela Alura.

---
### 💻 Funcionalidades

- [x] **Funcionário:**
    - [x] Realizar o cadastro de médicos;
    - [X] Atualizar os dados dos médicos;
    - [X] Deletar os dados dos médicos;
    - [X] Listar os médicos.

--- 

### 🎨 Configuração do ambiente

```bash

# Instalação do Java

## Para instalar o Java, visite o site oficial e baixe a versão que seja compatível com o seu ambiente de desenvolvimento. Siga as instruções fornecidas para instalar o Java em seu sistema.

https://www.java.com/pt-BR/download/

# Instalação da JDK 17

## Vamos usar o SDKMAN para instalar a JDK 17. Primeiro, instale o SDKMAN com o seguinte comando:

curl -s "<https://get.sdkman.io>" | bash

## Depois de instalar o SDKMAN, você pode instalar a JDK 17 com este comando:

sdk install java 17-open

## Para verificar se a JDK foi instalada corretamente, use o comando:

java --version

# Instalação do Maven 

## Para instalar o Maven, use o seguinte comando:

sdk install maven 3.1.5

## Você pode verificar a instalação do Maven com este comando:

mvn --version
 
# Instalação do Intellij Community

## Para instalar o IntelliJ IDEA Community, visite o site oficial e baixe a versão que seja compatível com o seu ambiente de desenvolvimento. Siga as instruções fornecidas para instalar o IntelliJ IDEA Community em seu sistema.

https://www.jetbrains.com/idea/download/?section=linux

# Instalação do MySQL

## Siga as instruções fornecidas no artigo da Linkedin para instalar o MySQL em seu sistema.

https://www.linkedin.com/pulse/instala%C3%A7%C3%A3o-e-configura%C3%A7%C3%A3o-do-mysql-linux-mint-20-ubuntu-yenny-delgado/?originalSubdomain=pt

## Criação do banco de dados a partir do terminal do Linux

### Para fazer login no banco de dados, use o seguinte comando:

mysql -u <user_name> -p 

### Para criar um novo banco de dados chamado authuser, use o seguinte comando:

CREATE DATABASE vollmed_api;

### Para sair

EXIT

```
---

### 🚀 Como executar

#### Pré-requisitos

Certifique-se de que todas as configurações do ambiente foram realizadas corretamente.

#### Execução

- Faça o download do projeto para o seu computador.

- Abra o IntelliJ IDEA Community.

- No menu principal, selecione a opção “Open”. Navegue até a pasta onde o projeto foi baixado e clique em “OK”.

- No projeto aberto, localize e clique no arquivo AuthApplication.java.

- Em seguida, selecione a opção “Run ‘AuthApplication’” para executar o projeto.

- Após a execução, o projeto estará acessível através do seguinte endereço: http://localhost:8080/

### 🛠 Tecnologias

#### **Back-End**

- **[Java](https://docs.oracle.com/en/java/)**
- **[Spring Boot](https://spring.io/projects/spring-boot)**
- **[Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.32)**
- **[Flywaydb](https://mvnrepository.com/artifact/org.flywaydb/flyway-mysql)**
- **[Devtools](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)**
- **[MySql](https://spring.io/guides/gs/accessing-data-mysql)**