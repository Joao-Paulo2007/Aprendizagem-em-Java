# Annotation about ArrayList and List

Um ArrayList é criado a partir desse comando:

*ArrayList< String > lista = new ArrayList<>();*

O `ArrayList` é uma estrutura de dados usada para armazenar vários valores em uma única variável.
Diferente de um array comum, seu tamanho pode aumentar ou diminuir durante a execução do programa.

---

## List

`List` é uma interface que representa uma lista de elementos.

Exemplo:

*List< String > lista = new ArrayList<>();*

Nesse caso:

- `List` → define o tipo da estrutura.
- `String` → define o tipo dos elementos.
- `ArrayList` → é a implementação usada para criar a lista.

Também podemos escrever:

*ArrayList< String > lista = new ArrayList<>();*

---

## Quais tipos de objetos podem ser usados dentro de um ArrayList?

O `ArrayList` trabalha com **objetos**, portanto não podemos usar diretamente tipos primitivos como:

- `int`
- `double`
- `char`
- `boolean`

Para isso, usamos as classes Wrapper:

| Tipo primitivo | Wrapper |
|---|---|
| `int` | `Integer` |
| `double` | `Double` |
| `float` | `Float` |
| `long` | `Long` |
| `short` | `Short` |
| `byte` | `Byte` |
| `char` | `Character` |
| `boolean` | `Boolean` |

Exemplo:

*ArrayList< Integer > numeros = new ArrayList<>();*

ArrayList < Double > precos = new ArrayList<>();

*ArrayList< Character > letras = new ArrayList<>();*

*ArrayList< Boolean > respostas = new ArrayList<>();*

Também podemos usar classes, como:

*ArrayList< String > nomes = new ArrayList<>();*

*ArrayList< Pessoa > pessoas = new ArrayList<>();*

---

## Integer

`Integer` é a classe Wrapper do tipo primitivo `int`.

Exemplo:

*ArrayList<Integer> numeros = new ArrayList<>();*

*numeros.add(10);*

*numeros.add(20);*

*numeros.add(30);*

O Java faz automaticamente a conversão entre `int` e `Integer` quando necessário. Isso é chamado de **autoboxing/unboxing**.

---

## String

`String` representa uma sequência de caracteres.

Exemplo:

*ArrayList< String > nomes = new ArrayList<>();*

*nomes.add("João");*

*nomes.add("Maria");*

*nomes.add("Pedro");*

---

## .add()

Adiciona um elemento ao `ArrayList`.

Exemplo:

*ArrayList< String > nomes = new ArrayList<>();*

*nomes.add("João");*

*nomes.add("Maria");*

Resultado:

*[João, Maria]*

Também podemos informar o índice onde queremos adicionar o elemento:

*nomes.add(1, "Pedro");*

Resultado:

*[João, Pedro, Maria]*

---

## Arrays.asList()

Transforma vários valores ou um array em uma `List`.

É necessário importar:

*import java.util.Arrays;*

Exemplo:

*List< String > nomes = Arrays.asList("João", "Maria", "Pedro");*

Resultado:

*[João, Maria, Pedro]*

Também pode ser usado para transformar um array em uma lista:

*String[] nomesArray = {"João", "Maria", "Pedro"};*

*List< String > nomes = Arrays.asList(nomesArray);*

> Observação: a lista criada por `Arrays.asList()` possui tamanho fixo.
> Não podemos usar `.add()` ou `.remove()` nela.

---

## .get()

Usado para acessar um elemento através do seu índice.

Exemplo:

*ArrayList< String > nomes = new ArrayList<>();*

*nomes.add("João");*

*nomes.add("Maria");*

*nomes.add("Pedro");*

*System.out.println(nomes.get(1));*

Resultado:

*Maria*

Os índices começam em `0`:

- índice `0` → João
- índice `1` → Maria
- índice `2` → Pedro

---

## .size()

Retorna a quantidade de elementos existentes na lista.

Exemplo:

*ArrayList< String > nomes = new ArrayList<>();*

*nomes.add("João");*

*nomes.add("Maria");*

*nomes.add("Pedro");*

*System.out.println(nomes.size());*

Resultado:

*3*

> `.size()` retorna a quantidade de elementos, e não o último índice.

---

## .remove()

Remove um elemento da lista.

Podemos remover pelo índice:

*nomes.remove(1);*

Ou podemos remover pelo objeto:

*nomes.remove("Maria");*

Exemplo:

*ArrayList< String > nomes = new ArrayList<>();*

*nomes.add("João");*

*nomes.add("Maria");*

*nomes.add("Pedro");*

*nomes.remove(1);*

Resultado:

*[João, Pedro]*

### Cuidado com Integer

Quando usamos `ArrayList<Integer>`, existe uma diferença importante:

*ArrayList< Integer > numeros = new ArrayList<>();*

*numeros.add(10);*

*numeros.add(20);*

*numeros.add(30);*

*numeros.remove(1);*

Remove o elemento do índice `1`.

Resultado:

*[10, 30]*

Para remover o valor `20`, podemos usar:

*numeros.remove(Integer.valueOf(20));*

Resultado:

*[10, 30]*

---

## .addAll()

Adiciona todos os elementos de uma lista dentro de outra lista.

Exemplo:

*ArrayList< String > nomes = new ArrayList<>();*

*nomes.add("João");*

*nomes.add("Maria");*

*ArrayList< String > outrosNomes = new ArrayList<>();*

*outrosNomes.add("Pedro");*

*outrosNomes.add("Ana");*

*nomes.addAll(outrosNomes);*

Resultado:

*[João, Maria, Pedro, Ana]*

---

## .contains()

Verifica se determinado elemento existe dentro da lista.

Retorna:

- `true` → se o elemento existir.
- `false` → se o elemento não existir.

Exemplo:

*ArrayList< String > nomes = new ArrayList<>();*

*nomes.add("João");*

*nomes.add("Maria");*

*System.out.println(nomes.contains("João"));*

Resultado:

*true*

Exemplo procurando algo que não existe:

*System.out.println(nomes.contains("Pedro"));*

Resultado:

*false*

---

## Collections.sort()

Organiza os elementos da lista em ordem crescente/natural.

É necessário importar:

*import java.util.Collections;*

Exemplo com números:

*ArrayList< Integer > numeros = new ArrayList<>();*

*numeros.add(50);*

*numeros.add(10);*

*numeros.add(30);*

*Collections.sort(numeros);*

Resultado:

*[10, 30, 50]*

Com `String`, normalmente organiza em ordem alfabética:

*ArrayList< String > nomes = new ArrayList<>();*

*nomes.add("Carlos");*

*nomes.add("Ana");*

*nomes.add("Bruno");*

*Collections.sort(nomes);*

Resultado:

*[Ana, Bruno, Carlos]*

---

## Collections.sort(n, Collections.reverseOrder())

Organiza a lista em ordem decrescente.

Exemplo:

*ArrayList< Integer > numeros = new ArrayList<>();*

*numeros.add(10);*

*numeros.add(50);*

*numeros.add(30);*

*Collections.sort(numeros, Collections.reverseOrder());*

Resultado:

*[50, 30, 10]*

Também funciona com `String`:

*Collections.sort(nomes, Collections.reverseOrder());*

Resultado:

*[Carlos, Bruno, Ana]*

---

## Collections.reverse()

Inverte a ordem atual dos elementos da lista.

Exemplo:

*ArrayList< Integer > numeros = new ArrayList<>();*

*numeros.add(10);*

*numeros.add(20);*

*numeros.add(30);*

*Collections.reverse(numeros);*

Resultado:

*[30, 20, 10]*

> Importante: `reverse()` **não ordena** os elementos. Ele apenas inverte a ordem atual.

Por exemplo:

*[10, 50, 20, 30]*

Depois de:

*Collections.reverse(numeros);*

Resultado:

*[30, 20, 50, 10]*

---

## .indexOf()

Procura um elemento dentro da lista e retorna o índice onde ele foi encontrado.

Exemplo:

*ArrayList< Integer > numeros = new ArrayList<>();*

*numeros.add(32);*

*numeros.add(75);*

*numeros.add(67);*

*numeros.add(34);*

*numeros.add(10);*

*int indice67 = numeros.indexOf(67);*

Resultado:

*2*

Isso acontece porque:

- índice `0` → 32
- índice `1` → 75
- índice `2` → 67
- índice `3` → 34
- índice `4` → 10

Se o elemento não existir, `.indexOf()` retorna `-1`.

Exemplo:

*int indice100 = numeros.indexOf(100);*

Resultado:

*-1*

Podemos verificar:

*if(indice100 != -1){*

*    System.out.println("Elemento encontrado no índice: " + indice100);*

*}else{*

*    System.out.println("Elemento não encontrado");*

*}*

---

# Resumo

| Método | Função |
|---|---|
| `.add()` | Adiciona um elemento |
| `Arrays.asList()` | Cria uma lista a partir de valores/array |
| `.get()` | Obtém um elemento pelo índice |
| `.size()` | Retorna a quantidade de elementos |
| `.remove()` | Remove um elemento |
| `.addAll()` | Adiciona todos os elementos de outra lista |
| `.contains()` | Verifica se um elemento existe |
| `Collections.sort()` | Ordena em ordem crescente/natural |
| `Collections.sort(n, Collections.reverseOrder())` | Ordena em ordem decrescente |
| `Collections.reverse()` | Inverte a ordem dos elementos |
| `.indexOf()` | Retorna o índice de um elemento |