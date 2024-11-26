-- Criacao da database 
CREATE DATABASE IF NOT EXISTS db_emprestimoferramentas;
USE db_emprestimoferramentas;

-- Excluir a tabela de amigos se já existir
DROP TABLE IF EXISTS tb_amigos;

-- Criar a tabela de amigos, com ID, nome e telefone
CREATE TABLE tb_amigos (
    id_amigo INT NOT NULL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    telefone VARCHAR(15) NOT NULL,
    contador INT,
    emprestimo_ativo BOOLEAN
);

-- Selecionar todos os dados da tabela de amigos para verificar as atualizações
SELECT * FROM tb_amigos;

-- Excluir a tabela de amigos se já existir
DROP TABLE IF EXISTS tb_ferramentas;

-- Criar a tabela de ferramentas, com detalhes das ferramentas disponíveis para empréstimo
CREATE TABLE tb_ferramentas (
    id_ferramenta INT NOT NULL PRIMARY KEY,   -- Identificador único da ferramenta
    nome VARCHAR(50) NOT NULL,                -- Nome da ferramenta
    marca VARCHAR(50) NOT NULL,               -- Marca da ferramenta
    preco DECIMAL(7,2) NOT NULL,               -- Preço da ferramenta, com duas casas decimais
	emprestada BOOLEAN                     -- Status da ferramenta (true: emprestada, false:disponível)
);

SELECT * FROM tb_ferramentas;

-- Excluir a tabela de amigos se já existir
DROP TABLE IF EXISTS tb_emprestimos;

-- Criar a tabela de empréstimos, associando amigos a ferramentas emprestadas
CREATE TABLE tb_emprestimos (
    id_emprestimo INT NOT NULL PRIMARY KEY,        -- Identificador único do empréstimo
    id_amigo INT NOT NULL,                         -- ID do amigo que pegou emprestado
    id_ferramenta INT,                             -- ID da ferramenta emprestada
    data_emprestimo DATE NOT NULL, 				   -- Data do empréstimo
    data_devolucao DATE NOT NULL,                  -- Data em que a ferramenta foi devolvida
    entregue BOOLEAN NOT NULL,                     -- Status do empréstimo (entregue ou não)
    data_finalizado DATE,                          -- Data de finalização do empréstimo (se houver)
    FOREIGN KEY (id_amigo) REFERENCES tb_amigos (id_amigo),      -- Relacionamento com a tabela de amigos
    FOREIGN KEY (id_ferramenta) REFERENCES tb_ferramentas (id_ferramenta) -- Relacionamento com a tabela de ferramentas
);

-- Selecionar todos os dados da tabela de empréstimos para ver os registros
SELECT * FROM tb_emprestimos;

-- Selecionar o amigo com o maior número de empréstimos
SELECT a.nome, a.telefone
FROM tb_amigos a
JOIN (
    SELECT e.id_amigo, COUNT(e.id_amigo) AS total_emprestimos
    FROM tb_emprestimos e
    GROUP BY e.id_amigo
) AS emprestimos_por_amigo ON a.id_amigo = emprestimos_por_amigo.id_amigo
ORDER BY emprestimos_por_amigo.total_emprestimos DESC
LIMIT 1;

-- Selecionar detalhes dos empréstimos, com o nome do amigo e da ferramenta
SELECT a.nome AS nome_amigo, a.telefone, f.nome AS nome_ferramenta, f.preco
FROM tb_emprestimos e
JOIN tb_amigos a ON e.id_amigo = a.id_amigo
JOIN tb_ferramentas f ON e.id_ferramenta = f.id_ferramenta;

-- Tabela com todas as informacoes de todas as tb
SELECT 
    a.id_amigo, 
    a.nome AS nome_amigo, 
    a.telefone, 
    f.id_ferramenta, 
    f.nome AS nome_ferramenta, 
    f.preco, 
    e.data_emprestimo, 
    e.data_devolucao, 
    e.entregue
FROM 
    tb_emprestimos e
JOIN 
    tb_amigos a ON e.id_amigo = a.id_amigo
JOIN 
    tb_ferramentas f ON e.id_ferramenta = f.id_ferramenta;

-- Desativar restrições de segurança temporariamente
SET SQL_SAFE_UPDATES = 0;
