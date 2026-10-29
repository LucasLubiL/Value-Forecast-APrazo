# Value Forecast: Previsão de Valores a Prazo

![Java](https://img.shields.io/badge/Java-17+-red?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot)
![Power BI](https://img.shields.io/badge/Power%20BI-Tratamento%20de%20dados-yellow?style=for-the-badge&logo=powerbi)
![KNIME](https://img.shields.io/badge/KNIME-Forecast-blue?style=for-the-badge&logo=knime)

Sistema que prevê valores "a prazo" para anos futuros, a partir de dados históricos reais do município de Patrocínio, MG.

Projeto da disciplina de Inteligência de Negócios, no curso de Análise e Desenvolvimento de Sistemas.

## Objetivo

- Usar dados históricos reais de valores a prazo por ano
- Tratar e organizar os dados no Power BI
- Aplicar o forecast no KNIME
- Prever o valor a prazo para o ano informado pelo usuário

## Como a previsão funciona

O usuário configura a previsão na tela do sistema:

1. **Grau do polinômio:** de 1 a 5. O grau 1 gera uma previsão linear, e os graus de 2 a 5 geram previsões não lineares.
2. **Tipo de polinômio:**
   - Simples: usa apenas os dados históricos
   - Múltiplo: permite informar um percentual adicional
3. **Ano da previsão:** o ano futuro para o qual se quer prever o valor.
4. **Percentual (opcional):** usado somente quando o polinômio múltiplo é escolhido.

O back-end faz o cálculo e a tela exibe o valor previsto junto com as informações usadas.

## Dados

Dados reais de valores a prazo por ano, do município de Patrocínio, MG.

## Tecnologias

| Camada | Tecnologias |
|---|---|
| Back-end | Java, Spring Boot |
| Front-end | HTML5, CSS3, JavaScript, Bootstrap, Thymeleaf |
| Dados e BI | Power BI (tratamento), KNIME (forecast) |
| Build | Maven |

## Como executar

**Pré-requisitos:** Java 17 ou superior.

```bash
git clone https://github.com/LucasLubiL/Value-Forecast-APrazo.git
cd Value-Forecast-APrazo
./mvnw spring-boot:run
```

Depois, acesse o endereço exibido no terminal (por padrão, `http://localhost:8080`).

---

## Autor

**Lucas Amaral Luciano**
Desenvolvedor Full Stack Java e Angular, formado em Análise e Desenvolvimento de Sistemas pelo IFTM.

Projeto acadêmico da disciplina de Inteligência de Negócios, no IFTM Campus Patrocínio.

[![Portfólio](https://img.shields.io/badge/Portf%C3%B3lio-lucasamaral.dev-1f2937?style=for-the-badge&logo=googlechrome&logoColor=white)](https://lucasamaral.dev/)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-lucas--amaral--luciano-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/lucas-amaral-luciano)
[![GitHub](https://img.shields.io/badge/GitHub-LucasLubiL-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/LucasLubiL)
[![E-mail](https://img.shields.io/badge/E--mail-tech.lucas.amaral%40gmail.com-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:tech.lucas.amaral@gmail.com)
