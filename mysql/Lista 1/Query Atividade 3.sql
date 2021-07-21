create table tb_estudantes(
	id bigint auto_increment,
    nome varchar(15) not null,
    turma bigint(3) not null,
    matricula bigint(7),
    nota decimal(10,2),
    aprovado boolean,
    
    primary key(id)
);

insert into tb_estudantes(nome, turma, matricula, nota, aprovado) values ("Armim", 49, 70708, 6.9, false);
insert into tb_estudantes(nome, turma, matricula, nota, aprovado) values ("Bertoldo", 75, 93874, 8.3,true);
insert into tb_estudantes(nome, turma, matricula, nota, aprovado) values ("Chadis", 31, 27645, 7.1, true);
insert into tb_estudantes(nome, turma, matricula, nota, aprovado) values ("Dina", 23, 09578, 5.4, false);
insert into tb_estudantes(nome, turma, matricula, nota, aprovado) values ("Eren", 139, 80080, 8.0, true);
insert into tb_estudantes(nome, turma, matricula, nota, aprovado) values ("Farmer", 69, 47856, 9.7, true);
insert into tb_estudantes(nome, turma, matricula, nota, aprovado) values ("Gean", 42, 94053, 4.9, false);
insert into tb_estudantes(nome, turma, matricula, nota, aprovado) values ("Heiner", 666, 395231, 7.9, true);

select * from tb_estudantes where nota > 7.0;

select * from tb_estudantes where nota < 7.0;

update tb_estudantes set nota = 9.2, aprovado = true where nome like "%armi%";

select * from tb_estudantes
