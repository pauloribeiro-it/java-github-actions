# Java GitHub Actions – Standalone Application

Aplicação Java standalone empacotada em Docker, com pipeline de CI/CD utilizando GitHub Actions e deploy automatizado em ambiente Linux (EC2).

---

## 📌 Visão Geral

Este projeto consiste em uma aplicação Java **standalone** (não web), executada via linha de comando e distribuída como uma **imagem Docker**.  
O deploy é realizado automaticamente através de **GitHub Actions**, utilizando conexão **SSH** para atualização do container no servidor.

---

## 🛠️ Tecnologias Utilizadas

- Java 17+ / 21
- Maven
- Docker
- GitHub Actions (CI/CD)
- Linux (Amazon EC2)
- SSH

---

## 📂 Estrutura do Projeto

```text
.
├── .github/
│   └── workflows/
│       ├── ci.yml
│       └── cd.yml
├── Dockerfile
├── pom.xml
├── src/
│   └── main/java
└── README.md
````

---
## 🖥️ Preparação do Ambiente EC2

Antes de realizar o deploy da aplicação, é necessário preparar a instância EC2 com o Docker instalado e configurado corretamente.

Os comandos abaixo consideram uma instância **Amazon Linux**.

---

### 🔹 Preparação e instalação do docker

```bash
sudo yum update -y
sudo yum install docker -y
sudo service docker start
sudo usermod -aG docker ec2-user
````
Após a execução destes comandos reinicie a sessão ao EC2.

---

### 🔄CI/CD
O CI fará o build da imagem docker no Docker Hub.

O CD fará o pull dessa imagem e instalar no EC2.