# Manual de bons hábitos em pacotes

## Pacote **Application**

 Pacote principal do nosso programa. Deve conter a função `main`, mais essencialmente o seu `entrypoint`.

## Pacotes mais recorrentes

  ### 1. Entities

  São entidades relacionadas e instanciadas. Exemplo: Carro.

  ### 2. Services

  São serviços que podem ser utilizados livremente ao longo código.

## outras

 Pacote: Views, Controllers, Repositories.

# Interfaces

São *classes abstratas* (exemplo do pneu) que apenas estabelecem **contratos** para implementar futuramente seus métodos.

usando apenas herança

```
 Classe Shape 
   - fill
   + area

   |> rectangle extends shape
      - height
      - width
      + area

    |> triangle extends shape
      - radious
      + area
```

usando interfaces:

