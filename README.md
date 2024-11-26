# Sistema de Gerenciamento de Empréstimo de Ferramentas
## Curso Engenharia da Computação, Unisul continente Florianópolis

Este projeto faz parte da avaliação A3 – Desempenho de Compreensão, onde desenvolvemos uma aplicação para atender a necessidade fictícia de gerenciamento de empréstimos de ferramentas. O software permite o controle  de cadastro de novos amigos e ferramentas, incluindo também as funcionalidades de CRUD, permite uma geração de relatórios de amigos e ferramentas cadastrados no sistema, além de um sistema de controle de devoluções e notificações.


### Contexto
O software foi solicitado para auxiliar um usuário em gerenciar seus empréstimos de ferramentas, oferecendo o cadastro de ferramentas e amigos, registro de empréstimos e devoluções, e geração de relatórios. Esses relatórios permitem verificar as ferramentas emprestadas e a qual amigo foi emprestada, o histórico de empréstimos por amigo ao decorrer do software, além de mostrar qual amigo ainda não devolveu alguma ferramenta, e quem possui mais empréstimos realizados.


### Objetivo
Desenvolver um sistema de gerenciamento de empréstimos, reforçando a capacidade de analisar problemas, interpretar requisitos e propor soluções de software aplicando CRUDs e relatórios.


### Funcionalidades
O sistema possui as seguintes funcionalidades:

1 - Cadastro e Gerenciamento de Amigos:
Cadastro e atualização de informações de contato.

2 - Cadastro e Gerenciamento de Ferramentas:
Cadastro e gerenciamento de informações como nome, marca e custo.

3 - Registro de Empréstimos:
Realizar novo Empréstimos, Empréstimos Realizados, Empréstimos Ativos.

4 - Relatórios:
Relatório de Empréstimos, Relatório de amigos cadastrados no sistema, Relatório de ferramentas e cálculo do valor total do mesmo.


### Requisitos Funcionais

<li> RF001 - Cadastro e alteração de Amigos </li>
<li> RF002 - Cadastro e alteração de Ferramenta </li>
<li> RF003 - Realização de Novos Empréstimos de ferramentas </li>
<li> RF004 - Verificação de Empréstimos realizados desde da primeira inicialização do programa </li>
<li> RF005 - Verificação de Empréstimos ativos no software </li>
<li> RF006 - Geração de Relatórios de amigos cadastrados no sistema </li>
<li> RF007 - Geração de Relatórios de ferramentas cadastradas no sistema </li>
<li> RF008 - Relatório de custo total de ferramentas </li>
<li> RF009 - Relatório de quem nunca devolveu ferramenta </li>
<li> RF010 - Relatório de quem fez mais empréstimos </li>
<li> RF011 - Relatório de quantidade de empréstimos realizados desde a primeira inicialização </li>
<li> RF012 - Receber ferramenta </li>

### Requisitos não funcionais

<li> RNF001 - O sistema deve realizar cadastros e consultas em até 2 segundos, mesmo com muitos cadastros</li>
<li> RNF002 - A interface deve ser simples e fácil de usar, sem exigir conhecimento técnico </li>
<li> RNF003 - O software deve funcionar corretamente em Windows e Linux </li>
<li> RNF004 - O código deve ser claro e bem documentado para facilitar futuras alterações </li>
<li> RNF005 - O sistema deve garantir que todas as operações sejam registradas corretamente e sem falhas</li>
<li> RNF006 - Quando o sistema for registrar o empréstimo, ele deve dizer a data</li>
<li> RNF007 - O software deve ser eficiente no consumo de recursos do computador, utilizando pouca memória e CPU.</li>


### Configuração do Ambiente
Para o desenvolvimento e execução deste projeto, utilizamos o ambiente e as tecnologias a seguir:

•Linguagem: Java

•Banco de Dados: MySQL

•Frameworks e Bibliotecas: JDBC para conexão com o banco de dados

•IDE: NetBeans

### Versões Utilizadas

•Apache NetBeans IDE 13

•Jdk 8

•Windows 10

•MySQL Workbench 8.0

## Para configuração inicial:

### Git Clone:

Copie o código [https://github.com/davijr28/gerenciador_emprestimo_A3]

Configure o banco de dados usando o script fornecido em banco.sql

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


### Execução do Projeto

Para executar o projeto, compile o código na IDE e certifique-se de que o banco de dados esteja corretamente configurado. Em seguida, execute o método principal na classe Principal.java para iniciar a aplicação.

### Conclusão
O Sistema de Gerenciamento de Empréstimos de Ferramentas é uma solução funcional que atende aos requisitos de gerenciamento simples e eficaz de empréstimos. O projeto proporcionou aprendizado prático e nos desafiou em todas as etapas, desde a concepção até a implementação. Além de cumprir os objetivos propostos, nos motivou a pensar em expansões futuras, consolidando nossos conhecimentos e nos preparando para desafios ainda maiores na área de desenvolvimento de software.

### Apresentação em Vídeo
A apresentação do projeto (https://youtu.be/waL3DVzU5rQ)

### Alunos:

• Davi Jordani Ramos | RA: 162211818

• Isaque Fabro | RA: 162321239

• Victor de Melo da Rosa | RA: 162211386

