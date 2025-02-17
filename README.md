# Sistema Bancário com AspectJ

Este projeto implementa um sistema bancário simples utilizando o Paradigma de Programação Orientado a Objetos (OOP) para gerenciar contas bancárias, e o Paradigma de Programação Orientado a Aspectos (AOP) para verificar saldo insuficiente antes de permitir saques.

## Descrição

- O sistema permite a criação de diferentes tipos de contas bancárias (Corrente, Poupança e Investimento).
- A verificação de saldo é realizada utilizando AspectJ, antes de cada saque, para garantir que o saldo seja suficiente.
- Caso o saldo seja insuficiente, uma mensagem de erro é gerada, e o saque não é realizado. Caso contrário, o saque é aprovado e uma mensagem de sucesso é exibida.

## Funcionalidades

- **Contas Bancárias**: Suporte para contas correntes, poupança e investimento, com diferentes tarifas de manutenção.
- **Verificação de Saldo**: A verificação de saldo é feita automaticamente antes de qualquer operação de saque, usando AspectJ para modularizar esse comportamento transversal.
- **Mensagens de Erro e Sucesso**: O sistema gera mensagens apropriadas sobre o status das operações de saque, como saldo insuficiente ou sucesso.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **AspectJ**: Utilizado para aplicar a verificação de saldo como um aspecto transversal no sistema.
- **Maven** (opcional): Gerenciador de dependências e build do projeto.

## Como Funciona

O aspecto **VerificacaoSaldoAspect** intercepta as chamadas ao método `sacar` das contas bancárias e verifica se o saldo é suficiente para o saque solicitado. Caso o saldo seja insuficiente, o aspecto emite uma mensagem de erro, senão o saque é realizado normalmente e uma mensagem de sucesso é exibida.
