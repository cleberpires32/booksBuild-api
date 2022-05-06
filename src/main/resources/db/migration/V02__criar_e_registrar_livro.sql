CREATE TABLE `booksbuild`.livro(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
nome_autor VARCHAR(50) NOT NULL,
titulo VARCHAR(255) NOT NULL,
texto VARCHAR(1000) NOT NULL,
categoria int(10) NOT NULL
)engine = InnoDB charset=utf8;

INSERT INTO `booksbuild`.livro (nome_autor,titulo,texto,categoria) values ('Robert Martin','Clean Code','Lorem ipsum',1);
INSERT INTO `booksbuild`.livro (nome_autor,titulo,texto,categoria) values ('Perteson Lucca','Historia da engenharia','test estse',2);
INSERT INTO `booksbuild`.livro (nome_autor,titulo,texto,categoria) values ('Robert Martin','Soletrando','Lorem ipsum',3)
