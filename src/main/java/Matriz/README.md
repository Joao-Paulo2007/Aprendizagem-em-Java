# Annotation about Matriz

Uma matriz é uma estrutura que organiza dados em **linhas e colunas**.

Exemplo:

```java
int[][] matriz = new int[3][3];
```

Cria uma matriz com **3 linhas e 3 colunas**.

Também podemos inicializar diretamente:

```java
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

Resultado:

```text
1 2 3
4 5 6
7 8 9
```

---

## Índices

Os índices começam em `0`.

```text
        Coluna
          0  1  2
       ┌─────────
Linha 0│ 1  2  3
Linha 1│ 4  5  6
Linha 2│ 7  8  9
```

Para acessar um elemento:

```java
matriz[1][2]
```

Resultado:

```text
6
```

`matriz[linha][coluna]`

---

## Alterando um elemento

```java
matriz[1][2] = 100;
```

Altera o valor da linha `1`, coluna `2`.

---

## .length

Quantidade de linhas:

```java
matriz.length
```

Quantidade de colunas:

```java
matriz[0].length
```

Exemplo:

```java
int[][] matriz = new int[3][4];

matriz.length        // 3 linhas
matriz[0].length     // 4 colunas
```

---

## Percorrendo uma matriz

Normalmente utilizamos dois `for`:

```java
for(int i = 0; i < matriz.length; i++){
    for(int j = 0; j < matriz[i].length; j++){
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

* `i` → linha
* `j` → coluna
* `matriz[i][j]` → elemento atual

---

## Scanner

Podemos preencher a matriz com valores digitados pelo usuário:

```java
Scanner sc = new Scanner(System.in);

for(int i = 0; i < matriz.length; i++){
    for(int j = 0; j < matriz[i].length; j++){
        matriz[i][j] = sc.nextInt();
    }
}
```

Importação:

```java
import java.util.Scanner;
```

---

## Somando os elementos

```java
int soma = 0;

for(int i = 0; i < matriz.length; i++){
    for(int j = 0; j < matriz[i].length; j++){
        soma += matriz[i][j];
    }
}
```

---

## Contando elementos

```java
int quantidade = 0;

for(int i = 0; i < matriz.length; i++){
    for(int j = 0; j < matriz[i].length; j++){
        quantidade++;
    }
}
```

---

## Maior valor

```java
int maior = matriz[0][0];

for(int i = 0; i < matriz.length; i++){
    for(int j = 0; j < matriz[i].length; j++){
        if(matriz[i][j] > maior){
            maior = matriz[i][j];
        }
    }
}
```

---

## Menor valor

```java
int menor = matriz[0][0];

for(int i = 0; i < matriz.length; i++){
    for(int j = 0; j < matriz[i].length; j++){
        if(matriz[i][j] < menor){
            menor = matriz[i][j];
        }
    }
}
```

---

## Procurando um valor

```java
int procurado = 5;
boolean encontrado = false;

for(int i = 0; i < matriz.length; i++){
    for(int j = 0; j < matriz[i].length; j++){
        if(matriz[i][j] == procurado){
            encontrado = true;
        }
    }
}
```

`true` → encontrou.

`false` → não encontrou.

---

## Encontrando a posição

```java
if(matriz[i][j] == procurado){
    System.out.println("Linha: " + i);
    System.out.println("Coluna: " + j);
}
```

---

# Diagonal Principal

A diagonal principal acontece quando:

```java
i == j
```

Exemplo:

```text
1 2 3
4 5 6
7 8 9
```

Diagonal:

```text
1
  5
    9
```

Código:

```java
for(int i = 0; i < matriz.length; i++){
    System.out.println(matriz[i][i]);
}
```

### Soma da diagonal

```java
int soma = 0;

for(int i = 0; i < matriz.length; i++){
    soma += matriz[i][i];
}
```

---

# Diagonal Secundária

A diagonal secundária vai do canto superior direito ao inferior esquerdo.

```text
1 2 3
4 5 6
7 8 9
```

Diagonal:

```text
    3
  5
7
```

Código:

```java
for(int i = 0; i < matriz.length; i++){
    System.out.println(matriz[i][matriz.length - 1 - i]);
}
```

Regra:

```java
matriz[i][matriz.length - 1 - i]
```

---

# Matriz Quadrada

Possui a mesma quantidade de linhas e colunas.

Exemplos:

```text
2x2
3x3
4x4
```

Exemplo:

```text
1 2 3
4 5 6
7 8 9
```

---

# Matriz Retangular

Possui quantidades diferentes de linhas e colunas.

Exemplo:

```java
int[][] matriz = new int[2][3];
```

Resultado:

```text
1 2 3
4 5 6
```

---

# Matriz Transposta

Troca linhas por colunas.

Original:

```text
1 2 3
4 5 6
```

Transposta:

```text
1 4
2 5
3 6
```

Regra:

```java
transposta[j][i] = matriz[i][j];
```

---

# Copiando uma matriz

```java
int[][] copia = new int[3][3];

for(int i = 0; i < matriz.length; i++){
    for(int j = 0; j < matriz[i].length; j++){
        copia[i][j] = matriz[i][j];
    }
}
```

---

# Comparando matrizes

```java
boolean iguais = true;

for(int i = 0; i < matriz1.length; i++){
    for(int j = 0; j < matriz1[i].length; j++){
        if(matriz1[i][j] != matriz2[i][j]){
            iguais = false;
        }
    }
}
```

---

# Somando duas matrizes

Os elementos da mesma posição são somados.

```java
int[][] resultado = new int[3][3];

for(int i = 0; i < matriz1.length; i++){
    for(int j = 0; j < matriz1[i].length; j++){
        resultado[i][j] = matriz1[i][j] + matriz2[i][j];
    }
}
```

---

# Multiplicando por um número

```java
int numero = 2;

for(int i = 0; i < matriz.length; i++){
    for(int j = 0; j < matriz[i].length; j++){
        matriz[i][j] *= numero;
    }
}
```

---

# Matriz Triangular Superior

Os elementos **abaixo da diagonal principal** são `0`.

```text
1 2 3
0 5 6
0 0 9
```

Região abaixo:

```java
i > j
```

---

# Matriz Triangular Inferior

Os elementos **acima da diagonal principal** são `0`.

```text
1 0 0
4 5 0
7 8 9
```

Região acima:

```java
i < j
```

---

# Matriz Identidade

Possui `1` na diagonal principal e `0` nas outras posições.

```text
1 0 0
0 1 0
0 0 1
```

Regra da diagonal:

```java
i == j
```

---

# for-each

Também podemos percorrer uma matriz usando `for-each`:

```java
for(int[] linha : matriz){
    for(int valor : linha){
        System.out.print(valor + " ");
    }
    System.out.println();
}
```

É útil quando precisamos apenas dos **valores**, sem precisar dos índices.

---

# Arrays.deepToString()

Para imprimir uma matriz rapidamente:

```java
System.out.println(Arrays.deepToString(matriz));
```

Importação:

```java
import java.util.Arrays;
```

Resultado:

```text
[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
```

---

# Resumo

| Comando/Conceito                   | Função                |
| ---------------------------------- | --------------------- |
| `int[][] matriz`                   | Declara uma matriz    |
| `new int[3][3]`                    | Cria matriz 3x3       |
| `matriz[i][j]`                     | Acessa um elemento    |
| `matriz[i][j] = valor`             | Altera um elemento    |
| `matriz.length`                    | Quantidade de linhas  |
| `matriz[0].length`                 | Quantidade de colunas |
| `for` + `for`                      | Percorre a matriz     |
| `Scanner`                          | Recebe valores        |
| `i == j`                           | Diagonal principal    |
| `matriz[i][matriz.length - 1 - i]` | Diagonal secundária   |
| `i > j`                            | Abaixo da diagonal    |
| `i < j`                            | Acima da diagonal     |
| `Arrays.deepToString()`            | Imprime a matriz      |
| `for-each`                         | Percorre os valores   |
| `transposta[j][i]`                 | Transpõe a matriz     |

---

# Estrutura principal para memorizar

A estrutura mais importante para exercícios de matriz é:

```java
for(int i = 0; i < matriz.length; i++){
    for(int j = 0; j < matriz[i].length; j++){

        // operação

    }
}
```

**Memorize:**

```text
i = linha
j = coluna
matriz[i][j] = elemento
```
