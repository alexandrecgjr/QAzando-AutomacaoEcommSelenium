# Automação E2E E-commerce com Selenium e Cucumber

Projeto de estudo em Java para automação de testes de um fluxo simples de **cadastro de usuário** em um e-commerce, utilizando **Selenium WebDriver**, **Cucumber (BDD)** e **JUnit**.

---

## Tecnologias utilizadas

- **Linguagem**: Java 8
- **Gerenciador de dependências**: Maven
- **Framework de testes**: JUnit 4
- **BDD**: Cucumber (cucumber-junit, cucumber-java)
- **Automação Web**: Selenium WebDriver (3.141.59)
- **Relatórios**: Cluecumber Report Plugin
- **Drivers de navegador**: `chromedriver.exe`, `geckodriver.exe`

---

## Estrutura do projeto

Principais pastas/arquivos:

- `pom.xml` – configuração do Maven e dependências.
- `src/test/resources/features` – arquivos `.feature` do Cucumber.
  - `cadastro_usuario.feature` – cenários de cadastro de usuário (tags `@chrome`, `@firefox`, `@cadastro`).
- `src/test/java/pages` – classes de Page Object (ex.: `CadastroPage`, `LoginPage`).
- `src/test/java/steps` – definições dos steps do Cucumber.
  - `CadastroSteps.java` – implementação dos passos de cadastro, geração de dados aleatórios etc.
- `src/test/java/runner`
  - `RunBase.java` – configuração base do WebDriver.
  - `RunCucumberTest.java` – runner principal do Cucumber.
- `src/test/java/support` – classes de suporte (ex.: `Hooks.java`, `Utils.java`).
- `chromedriver.exe` / `geckodriver.exe` – drivers para Chrome e Firefox.

---

## Pré-requisitos

- **Java JDK 8+** instalado e configurado no `PATH`.
- **Maven 3+** instalado.
- Navegadores:
  - **Google Chrome** (para cenários com tag `@chrome`).
  - **Mozilla Firefox** (para cenários com tag `@firefox`).
- Sistema operacional: projeto desenvolvido/testado em **Windows**.

---

## Como executar os testes

### 1. Via Maven (linha de comando)

Na raiz do projeto (`AutomacaoEcommSelenium`), execute:

```bash
mvn test
```

Por padrão, o runner `RunCucumberTest` está configurado com:

- `features = "src/test/resources/features"`
- `tags = {"@cadastro"}`
- `glue = {"steps", "support"}`

Ou seja, serão executados os cenários marcados com a tag `@cadastro`.

### 2. Via IDE (IntelliJ / Eclipse)

1. Importe o projeto como **Maven Project**.
2. Localize a classe `RunCucumberTest` em `src/test/java/runner`.
3. Clique com o botão direito na classe e escolha **Run 'RunCucumberTest'** (ou equivalente na sua IDE).

---

## Filtrando cenários por navegador

Os cenários no arquivo `cadastro_usuario.feature` possuem tags específicas:

- `@chrome` – executa o cenário usando Chrome.
- `@firefox` – executa o cenário usando Firefox.

Para rodar apenas um tipo de navegador, você pode ajustar a anotação `@CucumberOptions` em `RunCucumberTest`:

```java
@CucumberOptions(
    plugin = {},
    features = "src/test/resources/features",
    tags = {"@cadastro", "@chrome"}, // exemplo: rodar só cenários de cadastro no Chrome
    glue = {"steps", "support"}
)
```

---

## Relatórios de execução

O `pom.xml` está configurado com o **Cluecumber Report Plugin**, que gera relatórios HTML a partir dos relatórios JSON do Cucumber.

Por padrão:

- Diretório de entrada (JSON): `target/reports`
- Diretório de saída (HTML): `target/formated-report`

Após executar os testes e gerar os JSONs, o Cluecumber é acionado na fase `post-integration-test`, produzindo um relatório navegável em HTML.

---

## Objetivo do projeto

Este projeto tem como objetivo **praticar automação de testes de interface web** com:

- Modelagem de páginas com Page Objects.
- Escrita de cenários BDD em português (Gherkin).
- Uso de Cucumber + Selenium + JUnit integrados via Maven.
- Organização de testes por tags (@chrome, @firefox, @cadastro).

Sinta-se à vontade para modificar os cenários, criar novos fluxos e evoluir o projeto conforme seu estudo.
