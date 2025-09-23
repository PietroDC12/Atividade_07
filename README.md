# 📘 Exercícios em Java — POO (Encapsulamento, Herança, Polimorfismo, Generics, Strategy)

Este repositório contém 8 exercícios de **Java orientado a objetos**, cobrindo desde conceitos básicos de encapsulamento até padrões de projeto como **Strategy**.  
Todos os exercícios estão integrados em um único projeto, com um `Main.java` que demonstra seus usos.

---

## 🚀 Exercícios Implementados

### 1️⃣ Encapsulamento (Classe Produto)
- Classe `Produto` com atributos privados `nome`, `preco` e `quantidadeEmEstoque`.
- Getters e setters com **validações**:
    - `nome` não pode ser nulo ou vazio.
    - `preco` e `quantidadeEmEstoque` não podem ser negativos.
- Lança `IllegalArgumentException` em caso inválido.

---

### 2️⃣ Encapsulamento com Validação de Regra (Desconto)
- Método `aplicarDesconto(double porcentagem)` em `Produto`.
- Apenas valores entre **0 e 50%** são permitidos.
- Exceções lançadas para entradas inválidas.
- Demonstra preço antes/depois do desconto.

---

### 3️⃣ Herança (Hierarquia de Funcionários)
- Classe base `Funcionario` com atributos `nome` e `salario`.
- Subclasses:
    - `Gerente` → bônus de **20%** do salário.
    - `Desenvolvedor` → bônus de **10%** do salário.
- Salários não podem ser negativos.
- Uso em `List<Funcionario>` demonstrando polimorfismo.

---

### 4️⃣ Polimorfismo com Interface (IMeioTransporte)
- Interface `IMeioTransporte` com métodos `acelerar()` e `frear()`.
- Implementações:
    - `Carro`
    - `Bicicleta`
    - `Trem`
- Cada transporte possui sua **própria lógica de velocidade e limites**.

---

### 5️⃣ Abstração (Sistema de Pagamentos)
- Classe abstrata `FormaPagamento` com:
    - `validarPagamento()`
    - `processarPagamento(BigDecimal valor)`
- Implementações:
    - `CartaoCredito`
    - `Boleto`
    - `Pix`
- Cada forma de pagamento possui validações específicas.
- Tratamento de erros com exceções.

---

### 6️⃣ Imutabilidade e Objetos de Valor (Carrinho de Compras)
- Objeto de valor imutável `Dinheiro` (com `BigDecimal` e enum `Moeda`).
- Classes:
    - `Produto`
    - `ItemCarrinho`
    - `Carrinho`
- Operações (`adicionar`, `remover`, `aplicarCupom`) retornam **um novo carrinho**.
- Cupons limitados a **30% de desconto**.

---

### 7️⃣ Generics (Repositório Genérico em Memória)
- Interface `IRepository<T extends Identificavel, ID>`.
- Métodos:
    - `salvar`
    - `buscarPorId`
    - `listarTodos`
    - `remover`
- Implementação em memória com `Map<ID, T>`.
- Exceção lançada ao tentar remover ID inexistente.
- Exemplo com `Produto` e `Funcionario`.

---

### 8️⃣ Padrão Strategy (Cálculo de Frete com Lambdas)
- Interface `CalculadoraFrete` com `calcular(Pedido)`.
- Estratégias:
    - `Sedex`
    - `Pac`
    - `RetiradaNaLoja`
- Estratégia promocional via **lambda**: frete grátis acima de X valor.
- Validação de CEP e tratamento de exceções.

---

## 🖥️ Como executar

1. Abra o terminal na pasta `src`.
2. Compile todos os arquivos:
   ```bash
   javac *.java