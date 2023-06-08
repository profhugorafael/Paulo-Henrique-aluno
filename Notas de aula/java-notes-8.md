# File manipulation

## 1. Básico (`Scanner`)

Com scanner não puxaremos mais um arquivo do tipo `System.in` e criaremos um arquivo personalizado da classe `File`.

```java
File file = new File(path)
```

`path` é o caminho para o arquivo a partir do diretório(pasta) `C:`

Exemplo: `"C:\\Users\\hugor\\Desktop\\Aulas\\alunos\\Paulo Henrique\\Paulo-Henrique-aluno\\Projects 2\\File Manipulation Paulo\\resources\\db.csv"`

**Observação:** Usaremos duas contrabarras pois uma é para ignorar o comando contrabarra ja existente no java, por exemplo no `\n`.

### Pontos importantes

1. usar o `.hasNextLine()` ou derivados para checar se a entrada(buffer) ainda possui dados para serem lidos.

2. Lembrar de considerar o espaçamento e quebras de linha do arquivo, muitas vezes corrigido pelo `input.next()` ou `input.nextLine()`.

3. Extrair os dados de forma inteligente usando um vetor e o método `.split()` em cima do seu arquivo(banco de dados).

# 2. FileReader and BufferReader

# FileReader

 - Stream de leitura

# BufferedReader

 - Recebe um FileReader e faz uma leitura mais rápida que a Scanner.

Código mais simples:

```java
String path = "...\\myFile.txt";
FileReader fr = null;
BufferedReader bf = null;

  try
  {

    fr = new FileReader(path);
    br = new BufferedReader(fr);

  } catch(IOException e){
    e.printStackTrace();
  }finally{

    try{
      if(br != null) br.close();
      if(fr != null) fr.close(); 
    }catch(IOException e){
      e.printStackTrace();
    }

  }
```