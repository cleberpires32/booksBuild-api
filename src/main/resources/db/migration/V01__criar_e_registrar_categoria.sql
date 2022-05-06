CREATE TABLE `booksbuild`.categoria(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL,
descricao VARCHAR(255) NOT NULL
)engine = InnoDB charset=utf8;

INSERT INTO `booksbuild`.categoria (nome,descricao) values ('Informática','Livro de Informática');
INSERT INTO `booksbuild`.categoria (nome,descricao) values ('Engenharia','Livro de engenharia');
INSERT INTO `booksbuild`.categoria (nome,descricao) values ('Portugues','Como aprender Lingua Portuquesa de forma fácil');
INSERT INTO `booksbuild`.categoria (nome,descricao) values ('Matemática','Calculos de forma fácil');