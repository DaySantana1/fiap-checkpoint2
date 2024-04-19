# Checkpoint 2 - Engenharia Web e Microserviços

Aplicação Java proposta como Checkpoint 2 do primeiro semestre da matéria de Engenharia Web e Microserviços

## Requisitos

- Java 17 ou superior
- Docker
- Conexão com a internet
- Acesso ao Docker Hub

## Como instalar

#### Clonando o repositório

```
git clone https://github.com/viniciosromano/fiap-checkpoint2.git
```

## Como executar

#### Usando Docker

* Criando a imagem Docker

```
docker build -t fiap-checkpoint2 .
```

* Executando o container

```
docker run -d -p 8080:8080 -e PROFILE=<prd|dev|stg> fiap-checkpoint2
```

* Executando o container a partir do Docker Hub

Profile dev
```
docker run -d -p 8080:8080 -e PROFILE=dev viniciosromano/fiap-checkpoint2
```

Profile stg
```
docker run -d -p 8081:8080 -e PROFILE=stg viniciosromano/fiap-checkpoint2
```

Profile prd
```
docker run -d -p 8082:8080 -e PROFILE=prd viniciosromano/fiap-checkpoint2
```
#### Navegando na aplicação

- Link para o H2 Console

http://localhost:8080/h2-console

- Login para acesso ao Banco de Dados

Usuário: sa
Senha: sa

## Funcionalidades

- Suporte a múltiplos perfis
- Banco de Dados integrado

## Contato

- Vinicios Romano Araujo - RM93018
- Dayane Silva Santana - RM96067
