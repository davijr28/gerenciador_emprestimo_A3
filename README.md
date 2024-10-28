# Sistema de Gerenciamento de Empréstimo de Ferramentas
## Curso Engenharia de Software, Unisul continente Florianópolis

Este projeto faz parte da avaliação A3 – Desempenho de Compreensão, onde desenvolvemos uma aplicação para atender a necessidade fictícia de gerenciamento de empréstimos de ferramentas. O software permite o controle de amigos e ferramentas, incluindo funcionalidades de CRUD, relatórios de empréstimos e ferramentas, além de um sistema de controle de devoluções e notificações.

### Contexto
O software foi solicitado para auxiliar um usuário em gerenciar seus empréstimos de ferramentas, oferecendo o cadastro de ferramentas e amigos, registro de empréstimos e devoluções, e geração de relatórios. Esses relatórios permitem verificar as ferramentas emprestadas, o histórico de empréstimos por amigo, além de estatísticas de uso.

### Objetivo
Desenvolver um sistema de gerenciamento de empréstimos, reforçando a capacidade de analisar problemas, interpretar requisitos e propor soluções de software aplicando CRUDs e relatórios.

### Funcionalidades
O sistema possui as seguintes funcionalidades:

1 - Cadastro e Gerenciamento de Amigos:
Cadastro e atualização de informações de contato.

2 - Cadastro e Gerenciamento de Ferramentas:
Cadastro e gerenciamento de informações como nome, marca e custo.

3 - Registro de Empréstimos e Devoluções:
Registro de empréstimos, notificações sobre pendências, e controle de devoluções.

4 - Relatórios:
Relatório de ferramentas e cálculo do valor total.

Relatório de empréstimos ativos e históricos, com detalhes dos usuários mais frequentes e status de devolução.

### Configuração do Ambiente
Para o desenvolvimento e execução deste projeto, utilizamos o ambiente e as tecnologias a seguir:

•Linguagem: Java

•Banco de Dados: MySQL

•Frameworks e Bibliotecas: JDBC para conexão com o banco de dados

•IDE: NetBeans (13° versão)

### Para configuração inicial:

### Clone o repositório:

bash

Copiar código

git clone [URL_DO_REPOSITÓRIO]

Configure o banco de dados usando o script fornecido em database.sql.

Estrutura do Banco de Dados

### Banco de Dados
O banco de dados é composto por tabelas para armazenar:

Amigos: Contém informações dos amigos, como nome e telefone.

Ferramentas: Armazena dados das ferramentas, incluindo nome, marca e custo.

Empréstimos: Registro de cada empréstimo com o amigo associado, ferramentas emprestadas, data de empréstimo e devolução.

### Estrutura do Projeto

Os arquivos principais do projeto estão organizados nas seguintes pastas:

•dao: Gerencia as operações de acesso ao banco de dados.

•model: Contém as classes de modelo, como Amigos.java e Ferramentas.java.

•principal: Contém a classe Principal.java, que executa a aplicação.

•view: Interface do usuário para interação com o sistema.

### Distribuição de Tarefas:

Nome do Aluno	Funcionalidade	Arquivos Modificados

Aluno 1	Cadastro de Amigos	Amigos.java, AmigosDAO.java

Aluno 2	Cadastro de Ferramentas	Ferramentas.java, FerramentasDAO.java

Aluno 3	Relatórios de Empréstimos e Devoluções	RelatorioDAO.java, RelatorioView.java

Organização e Padrões de Código

Padrões de Nomenclatura: Utilizamos camelCase para variáveis e métodos, e PascalCase para nomes de classes.

Estrutura de Pacotes: O projeto está organizado em pacotes para separação de responsabilidades: dao, model, principal e view.

Mensagens de Commits: Adotamos uma convenção de mensagens de commit para fácil entendimento e histórico do desenvolvimento.

### Execução do Projeto

Para executar o projeto, compile o código na IDE e certifique-se de que o banco de dados esteja corretamente configurado. Em seguida, execute o método principal na classe Principal.java para iniciar a aplicação.

### Conclusão
Este projeto aprimorou nossas habilidades de desenvolvimento colaborativo, uso de CRUDs e implementação de um sistema completo com interface gráfica e controle de dados persistente.

### Apresentação em Vídeo
A apresentação do projeto está disponível em (link do vídeo no YouTube).

### Alunos:
• Victor de Melo da Rosa | RA: 162211386

• Davi Jordani Ramos | RA: 162211818

• Isaque	Fabro | RA: 162321239
