# 🪙 Cofrinho de Moedas – Sistema de Controle (Java)
Este projetinho simula um **cofrinho virtual**, permitindo ao usuário adicionar, remover, listar moedas e calcular o total convertido em **Reais (BRL)**. É um sistema simples, baseado em menu no console, feito com Java.

## 💻 Tecnologias utilizadas
- Linguagem Java
- Terminal/Console

## ⚙️ Funcionalidades
- Adição de moedas de diferentes tipos (Real, Dólar e Euro)
- Remoção de moedas específicas (por tipo e valor)
- Listagem de todas as moedas no cofrinho
- Conversão automática de Dólar (5.5) e Euro (6.5) para Real
- Cálculo do total geral convertido em Real
- Interface baseada em menu de texto no terminal

## 📂 Estrutura do Projeto
O projeto é composto pelas seguintes classes:

- `Principal`: classe principal com o menu de interação com o usuário
- `Cofrinho`: gerencia a lista de moedas e suas operações (adicionar, remover, listar, converter)
- `Moeda`: classe abstrata base para as moedas
- `Real`, `Dolar`, `Euro`: classes concretas que estendem `Moeda`, cada uma com sua lógica de conversão

## ▶️ Como executar
1. Compile todas as classes `.java`:
```bash
javac br/uninter/rodrigo/cofrinho/*.java
```
2. Execute o programa principal:
```bash
java br.uninter.rodrigo.cofrinho.Principal
```
3. Interaja com o menu no terminal.
```bash
### Menu ###
1. Adicionar moeda
2. Remover moeda
3. Listar moedas
4. Calcular total convertido para Real
5. Sair
```
## Pronto! Agora é só brincar de economizar 💰