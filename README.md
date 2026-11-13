## Sobre o projeto

O **Estoque-Console** é a primeira etapa de uma evolução em três sistemas de gerenciamento de estoque desenvolvidos em **Java**. Este é um sistema executado diretamente pelo terminal, sem persistência em banco de dados e sem interface gráfica.

O projeto foi desenvolvido com foco na aplicação de conceitos de **Programação Orientada a Objetos (POO)** e na organização de responsabilidades por meio de classes e serviços, permitindo cadastrar produtos, funcionários e pontos, além de controlar entradas, saídas, reposições e conferências de estoque.

### Objetivo do projeto

Este repositório não tem como objetivo ser um sistema pronto para uso real. Ele é a etapa de **entendimento do fluxo do domínio** (produto, ponto, estoque, movimentação, reposição e conferência) e da modelagem em POO, antes de evoluir para versões mais robustas:

1. **Estoque-Console** *(este repositório)* — modelagem do domínio e do fluxo, sem persistência, executado via terminal.
2. **[Estoque-Conferencia](https://github.com/nahhay/Sistema-de-Estoque-Conferencia)** — evolução com API REST, PostgreSQL e painéis web (Gerente/Funcionário).
3. **Sistema completo** — versão final, ainda em desenvolvimento.

---

## Funcionalidades

- Cadastro de produtos
- Cadastro de funcionários
- Cadastro de pontos
- Entrada de estoque
- Saída de estoque
- Consulta de estoque
- Reposição de produtos
- Conferência de estoque
- Histórico de movimentações

---

## Tecnologias

- **Java 17**
- **Programação Orientada a Objetos (POO)**
- **ArrayList**
- **Scanner**

> Não há persistência em banco de dados nesta etapa — os dados existem apenas durante a execução do programa e são perdidos ao encerrá-lo. Esse ponto é resolvido na segunda etapa da evolução ([Estoque-Conferencia](https://github.com/nahhay/Sistema-de-Estoque-Conferencia)), que já utiliza PostgreSQL.

---

## Estrutura do projeto

```text
Sistema-de-Estoque-Console/
├── src/
│   └── main/
│       └── java/
│           └── estoque/
│               ├── Main.java
│               ├── Menu.java
│               ├── Produto.java
│               ├── ProdutoService.java
│               ├── Funcionario.java
│               ├── FuncionarioService.java
│               ├── Ponto.java
│               ├── PontoService.java
│               ├── Estoque.java
│               ├── EstoqueService.java
│               ├── Movimentacao.java
│               ├── MovimentacaoService.java
│               ├── Reposicao.java
│               ├── ReposicaoService.java
│               ├── Conferencia.java
│               └── ConferenciaService.java
│
├── img/
│   ├── banner.png
│   └── estoque-demo.gif
│
├── .gitignore
├── LICENSE
└── README.md
```

---

## Demonstração

<p align="center">
  <img src="img/estoque-demo.gif" alt="Demonstração do sistema" width="700">
</p>

---

## Como executar

### Requisitos

- **Java JDK 17 ou superior**
- **Git**

> O projeto não possui `pom.xml` ou `build.gradle` — é compilado diretamente com `javac`, sem gerenciador de dependências, já que não há dependências externas nesta etapa.

### 1. Clone o repositório

```bash
git clone https://github.com/nahhay/Sistema-de-Estoque-Console.git
cd Sistema-de-Estoque-Console
```

### 2. Compile os arquivos

No Linux/macOS ou Git Bash:

```bash
javac -d . $(find src -name "*.java")
```

No Windows PowerShell:

```powershell
javac -d . (Get-ChildItem -Recurse -Filter *.java src).FullName
```

### 3. Execute o programa

```bash
java estoque.Main
```

---

## Limitações atuais

Por ser a primeira etapa da evolução, este projeto possui limitações conhecidas e assumidas:

- **Sem persistência**: todos os dados são armazenados em memória (`ArrayList`) e perdidos ao encerrar o programa.
- **Sem interface gráfica ou web**: a interação é feita inteiramente via terminal (`Scanner`).
- **Sem gerenciador de dependências** (Maven/Gradle).
- **Sem testes automatizados.**
- **Execução single-user**: não há conceito de sessão, login ou concorrência.

Essas limitações são resolvidas progressivamente nas próximas etapas do projeto.

---

## Próximos passos da evolução

- [x] Modelar o domínio e o fluxo de estoque em POO *(este repositório)*
- [x] Evoluir para API REST + PostgreSQL + painéis web ([Estoque-Conferencia](https://github.com/nahhay/Sistema-de-Estoque-Conferencia))
- [ ] Consolidar em um sistema completo, com autenticação e permissões reais por usuário

---

## Licença

Este projeto está licenciado sob a licença **MIT**.

Consulte o arquivo [LICENSE](LICENSE) para mais informações.

---

## Autora

Desenvolvido por **Nathaly Alencar**.

[GitHub](https://github.com/nahhay)
