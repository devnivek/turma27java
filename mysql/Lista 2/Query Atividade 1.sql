create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
	id bigint auto_increment,
    nome varchar(15),
    ativo boolean,
	primary key(id)
);

create table tb_personagem(
	id bigint auto_increment,
    nome varchar(15),
    elemento varchar(15),
    ataque bigint,
    defesa bigint,
    classe_id bigint,
    
    primary key(id),
    foreign key(classe_id) references tb_classe(id)
);

insert into tb_classe(nome, ativo) values("Mago", true);
insert into tb_classe(nome, ativo) values("Cavaleiro", true);
insert into tb_classe(nome, ativo) values("Arqueiro", true);
insert into tb_classe(nome, ativo) values("Lutador", true);
insert into tb_classe(nome, ativo) values("Construtor", true);

select * from tb_classe;

insert into tb_personagem(nome, elemento, ataque, defesa, classe_id) values("Nate", "Fogo", 3000, 1700, 4);
insert into tb_personagem(nome, elemento, ataque, defesa, classe_id) values("Cara", "Água", 2500, 2100, 1);
insert into tb_personagem(nome, elemento, ataque, defesa, classe_id) values("Eri", "Terra", 1900, 2600, 5);
insert into tb_personagem(nome, elemento, ataque, defesa, classe_id) values("Anton", "Ar", 2800, 1800, 2);
insert into tb_personagem(nome, elemento, ataque, defesa, classe_id) values("Fielp", "Ar", 1500, 2000, 3);
insert into tb_personagem(nome, elemento, ataque, defesa, classe_id) values("Gose", "Fogo", 1980, 1670, 3);
insert into tb_personagem(nome, elemento, ataque, defesa, classe_id) values("Trona", "Água", 2300, 2200, 4);
insert into tb_personagem(nome, elemento, ataque, defesa, classe_id) values("Nate", "Terra", 1800, 2100, 1);

select * from tb_personagem;

select * from tb_personagem where ataque > 2000;
select * from tb_personagem where defesa > 1000 and defesa < 2000;
select * from tb_personagem where nome like "%c%";

select tb_personagem.nome, tb_personagem.elemento, tb_personagem.ataque, tb_personagem.defesa, tb_classe.nome as classe
	from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.classe_id order by tb_personagem.nome;

select tb_personagem.nome, tb_personagem.elemento, tb_personagem.ataque, tb_personagem.defesa, tb_classe.nome as classe
	from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.classe_id where tb_classe.nome like "%mago%" order by tb_personagem.nome    
    


