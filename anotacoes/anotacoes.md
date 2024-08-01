<h1>Java - anotações</h1>


# Criação do ambiente no Windows


## Variáveis de Ambiente no Windows
Para que o Java seja reconhecido por outros programas é preciso adicioná-lo as variáveis de ambiente do sistema operacional.

### Copiando o path
Passo 1: Copie o caminho da pasta onde você fez a instalação do Java. Exemplo:
```txt
C:\Program Files\Java\jdk-22
```

Passo 2: Abra as Variáveis de ambiente do Windows.
1. Uma das formas de fazer isso é digitando `Variáveis de Ambiente` na caixa de busca do sistema operacional.
2. Você pode pedir para a Cortana abrir para você caso utilize a assistente virtual.
3. Painel de Controle >> Sistema >> Configurações Avançadas do Sistema >> Em Propriedades do Sistema - guia Avançado >> Variáveis de Ambiente.

Em variáveis de Ambiente você vai encontrar as Variáveis de Usuário e as Variáveis de Sistema(globais). Vamos adicionar o Java as `Variáveis do Sistema` para que todos os usuários da máquina tenham acesso.

Passo 3: Em Variáveis do Sistema clique em `Novo`. Você vai digitar:
```txt
Nome da Variável: JAVA_HOME
Valor da Variável: C:\Program Files\Java\jdk-22
```

Passo 4: Ainda nas Variáveis de Sistema selecione Path >> Editar. Adicione o path a seguir:
```txt
%JAVA_HOME%\bin
```
Depois é só salvar e fechar. Esse `%JAVA_HOME%` vai referenciar ao path criado no passo anterior. Vai ser como se você tivesse digitado o endereço do java + pasta bin. JAVA_HOME é uma convenção e outros programas que você instalar vão procurar por esse nome para saber onde o Java está instalado. Se você não utilizar o JAVA_HOME pode ser que algum programa procure o Java e não encontre.
```
C:\Program Files\Java\jdk-22\bin
```

## No terminal

### Saber a versão do Java
```txt
java -version
```
Você também pode saber a versão ativa do Java clicando em Painel de Controle >> Programas >> Java >> Guia: Java >> Exibir
