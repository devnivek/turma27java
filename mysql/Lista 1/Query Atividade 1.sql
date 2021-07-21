create table tb_funcionaries(
	id bigint auto_increment,
    nome varchar(30) not null,
    cargo varchar(30),
    idade bigint,
    empresa varchar(30),
    salario double,
    
    primary key(id)
);

insert into tb_funcionaries(nome, cargo, idade, empresa, salario) values ("Antônio", "Armador", 43, "Industrias Krats", 3000.0);
insert into tb_funcionaries(nome, cargo, idade, empresa, salario) values ("Cleiton", "Arqueiro", 39, "Gaviões da Fiel", 700.0);
insert into tb_funcionaries(nome, cargo, idade, empresa, salario) values ("Estevão", "Historiador", 70, "Faculdade Usamérica", 1945.0);
insert into tb_funcionaries(nome, cargo, idade, empresa, salario) values ("Romanova", "Consultora", 32, "Red Room Services", 5300.0);
insert into tb_funcionaries(nome, cargo, idade, empresa, salario) values ("Bruno", "Cientista", 58, "Laboratórios Jacaré", 4100.0);

select * from tb_funcionaries where salario > 2000;

select * from tb_funcionaries where salario < 2000;

update tb_funcionaries set empresa= "Jóias da Alma" where id = 4
