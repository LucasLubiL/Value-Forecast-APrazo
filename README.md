# 📊 Sistema de Previsão de Gastos a Prazo

Projeto desenvolvido para a disciplina de **Inteligência de Negócios**, com o objetivo de realizar **previsões de valores a prazo** a partir de **dados reais do município de Patrocínio – MG**.

Os dados foram **tratados e organizados no Power BI** e utilizados no **KNIME** para aplicação do algoritmo de forecast.

---

## 🎯 Objetivo

- Utilizar dados históricos reais
- Tratar e organizar os dados no **Power BI**
- Aplicar forecast no **KNIME**
- Prever valores a prazo de acordo com o ano informado

---

## 🛠 Tecnologias Utilizadas

**Front-end**
- HTML  
- CSS  
- Bootstrap  
- JavaScript
- Thymelife

**Back-end**
- Java  
- Spring Boot  

**BI / Dados**
- Power BI (tratamento dos dados)  
- KNIME (forecast)

---

## ⚙️ Como o Sistema Funciona

1. O usuário escolhe o grau do polinômio (1 a 5)
2. Informa o ano para previsão
3. O backend realiza o cálculo
4. O valor previsto é exibido na tela

---

## 🔮 Como Funciona a Previsão

Para realizar uma previsão, o usuário deve:

1. **Escolher o grau do polinômio**
   - Grau 1 → Previsão linear  
   - Grau 2 a 5 → Previsão não linear  

2. **Selecionar o tipo de polinômio**
   - Simples → Usa apenas os dados históricos  
   - Múltiplo → Permite informar um percentual adicional  

3. **Informar o ano da previsão**
   - Ano futuro para o qual deseja prever o valor a prazo  

4. **Informar o percentual (opcional)**
   - Utilizado apenas quando o polinômio múltiplo é selecionado  

Após isso, o sistema calcula e exibe o **valor previsto**, junto com as informações utilizadas no cálculo.

---

## 📊 Dados Utilizados

- Dados reais de valores a prazo por ano
- Município de **Patrocínio – MG**

---

## 👤 Autor

**Lucas Amaral Luciano**  
Projeto acadêmico – Inteligência de Negócios
