create table tb_produtos(
	id bigint auto_increment,
    nome varchar(30) not null,
    quantidade bigint,
    marca varchar(30),
    categoria varchar(30),
    preco double,
    
    primary key(id)
);

insert into tb_produtos(nome, quantidade, marca, categoria, preco) values ("Bolacha Maizena", 70, "Zabet", "Alimentos", 2.10);
insert into tb_produtos(nome, quantidade, marca, categoria, preco) values ("Sabonete Líquido", 86, "Downey", "Higiene", 1.70);
insert into tb_produtos(nome, quantidade, marca, categoria, preco) values ("Refrigerante Guaraná", 92, "Dolly", "Bebidas", 4.50);
insert into tb_produtos(nome, quantidade, marca, categoria, preco) values ("Papel Toalha", 115, "Pulman", "Cozinha", 3.30);
insert into tb_produtos(nome, quantidade, marca, categoria, preco) values ("Ração para Gatos", 68, "Whiskas", "Petshop", 12.89);
insert into tb_produtos(nome, quantidade, marca, categoria, preco) values ("Pão Integral", 130, "Puma", "Alimentos", 6.19);
insert into tb_produtos(nome, quantidade, marca, categoria, preco) values ("Macarrão Instantâneo", 200, "Mabba", "Alimentos", 4.80);
insert into tb_produtos(nome, quantidade, marca, categoria, preco) values ("Presunto Defumado", 30, "JBS", "Congelados", 9.94);

select * from tb_produtos where preco > 5.0;

select * from tb_produtos where preco < 5.0;

SET SQL_SAFE_UPDATES = 0;

update tb_produtos set quantidade= 0 where categoria like "%alimentos%";

select * from tb_produtos

