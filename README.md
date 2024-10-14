# Validador de CNH com Drools

Este projeto é um validador de Carteira Nacional de Habilitação (CNH) desenvolvido em Java, utilizando o Drools como motor de regras. O objetivo é verificar a validade da CNH de forma automatizada, facilitando o processo de validação.

## Autor

Este código é de autoria de **paneladev**, do canal no YouTube **Renan Lessa | Panela Dev** e está sendo usado como caso de estudo na diciplina de "Sistemas de Apoio a Decisão" do mestre Nelson Miranda (Sistemas de informação | Univem | 2024).

## Pré-requisitos

Antes de executar o projeto, verifique se você possui os seguintes itens instalados:

- JDK 8 ou superior
- Maven 3 ou superior
- IDE de sua preferência (IntelliJ IDEA, Eclipse, etc.)

## Estrutura do Projeto

```plaintext
.
├── src
│   ├── main
│   │   ├── java
│   │   │   └── org
│   │   │       └── exemple
│   │   └── resources
│   │       └── org.example
│   │           └── rules.drl
├── pom.xml
└── README.md
```

## Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/paneladev/drools-basic.git
   cd drools-basic
   ```

2. Compile o projeto com Maven:

   ```bash
   mvn clean install
   ```

3. Execute a classe principal:

   ```bash
   mvn exec:java -Dexec.mainClass="com.exemplo.drools-basic.Main"
   ```

## Uso

O sistema irá solicitar que você insira os dados da CNH. Após a entrada dos dados, o motor Drools irá processar as regras definidas e retornar se a CNH é válida ou não.

### Exemplo de Entrada

```
        Cnh cnh1 = new Cnh();
        cnh1.setNumero("CNH-40");
        cnh1.setNome("João Rossi");
        cnh1.setPontos(0);
        cnh1.setDataExpiracao(LocalDate.of(2022, Month.MAY, 28));
```

### Exemplo de Saída

```
A CNH informada é válida.
```

## Regras

As regras de validação estão localizadas no arquivo `rules.drl` dentro do diretório `src/main/resources/org.example`. Sinta-se à vontade para modificar as regras conforme necessário.
