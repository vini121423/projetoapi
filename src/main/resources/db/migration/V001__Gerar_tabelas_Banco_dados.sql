Create Table Cidade(
   id int not null auto_increment,
   nome varchar(150),
   estado char(2),
   primary key(id));
   
Create Table Cliente(
id int not null auto_increment,
nome varchar(200),
telefone varchar(20),
cidade_id int not null,
primary key(id));

alter table cliente add constraint fk_cliente_cidade foreign key(cidade_id) references cidade(id);   


insert into cidade(nome, estado) values ('Macatuba', 'SP');
insert into cidade(nome, estado) values ('Bauru', 'SP');
insert into cidade(nome, estado) values ('Barra Bonita', 'SP');
insert into cidade(nome, estado) values ('Lençóis Paulista', 'SP');
insert into cidade(nome, estado) values ('Piracicaba', 'SP');
insert into cidade(nome, estado) values ('Perdeneiras', 'SP');
insert into cidade(nome, estado) values ('Belo Horizonte', 'MG');
insert into cidade(nome, estado) values ('Uberlândia', 'MG');
insert into cidade(nome, estado) values ('Juiz de Fora', 'MG');
insert into cidade(nome, estado) values ('Varginha', 'MG');
insert into cidade(nome, estado) values ('Itajubá', 'MG');
insert into cidade(nome, estado) values ('Lavras', 'MG');
insert into cidade(nome, estado) values ('Rio de Janeiro', 'RJ');
insert into cidade(nome, estado) values ('Macaé', 'RJ');
insert into cidade(nome, estado) values ('Niterói', 'RJ');
insert into cidade(nome, estado) values ('Angra dos Reis', 'RJ');
insert into cidade(nome, estado) values ('Nova Iguaçu', 'RJ');
insert into cidade(nome, estado) values ('Curitiba', 'PR');
insert into cidade(nome, estado) values ('Londrina', 'PR');
insert into cidade(nome, estado) values ('Foz do Iguaçu', 'PR');
insert into cidade(nome, estado) values ('Florianópolis', 'SC');
insert into cidade(nome, estado) values ('Joinville', 'SC');
insert into cidade(nome, estado) values ('Chapecó', 'SC');
insert into cidade(nome, estado) values ('Balneário Camboriú', 'SC');
insert into cidade(nome, estado) values ('Blumenau', 'SC');
insert into cidade(nome, estado) values ('Porto Alegre', 'RS');
insert into cidade(nome, estado) values ('Caxias do Sul', 'RS');
insert into cidade(nome, estado) values ('Santa Maria', 'RS');
insert into cidade(nome, estado) values ('Gramado', 'RS');
insert into cidade(nome, estado) values ('Canoas', 'RS');
insert into cidade(nome, estado) values ('Manaus', 'AM');
insert into cidade(nome, estado) values ('Belém', 'PA');
insert into cidade(nome, estado) values ('Salvador', 'BA');
insert into cidade(nome, estado) values ('Maceió', 'AL');
insert into cidade(nome, estado) values ('Goiânia', 'GO');
insert into cidade(nome, estado) values ('Cuiabá', 'MT');
insert into cidade(nome, estado) values ('Vitória', 'ES');
insert into cidade(nome, estado) values ('Rio Branco', 'AC');
insert into cidade(nome, estado) values ('Macapá', 'AP');
insert into cidade(nome, estado) values ('Fortaleza', 'CE');
insert into cidade(nome, estado) values ('João Pessoa', 'PB');
insert into cidade(nome, estado) values ('Natal', 'RN');

insert into cliente(nome, telefone, cidade_id) values ('Rogério', '9945969',1);
insert into cliente(nome, telefone, cidade_id) values ('Roseli', '9495693',1);
insert into cliente(nome, telefone, cidade_id) values ('Rahul', '97989699',1);
insert into cliente(nome, telefone, cidade_id) values ('Benedita', '9969599',3);
insert into cliente(nome, telefone, cidade_id) values ('Leticia', '9982838',2);
insert into cliente(nome, telefone, cidade_id) values ('Carla', '9294568',1);
insert into cliente(nome, telefone, cidade_id) values ('Eduarda', '999329',1);
insert into cliente(nome, telefone, cidade_id) values ('Maria', '9992910',1);
insert into cliente(nome, telefone, cidade_id) values ('João', '9994957',3);
insert into cliente(nome, telefone, cidade_id) values ('Pedro', '9982883',2);
insert into cliente(nome, telefone, cidade_id) values ('Julia', '9923945',1);
insert into cliente(nome, telefone, cidade_id) values ('Julio', '9921192',1);
insert into cliente(nome, telefone, cidade_id) values ('Gabriela', '99399213',1);
insert into cliente(nome, telefone, cidade_id) values ('Iago', '9949900',3);
insert into cliente(nome, telefone, cidade_id) values ('Igor', '99883810',2);
insert into cliente(nome, telefone, cidade_id) values ('Ketelin', '99192390',1);
insert into cliente(nome, telefone, cidade_id) values ('Rafael', '9923194',1);
insert into cliente(nome, telefone, cidade_id) values ('Rafaela', '9922993',1);
insert into cliente(nome, telefone, cidade_id) values ('Enzo', '9939594',3);
insert into cliente(nome, telefone, cidade_id) values ('Cristiano', '99064563',2);
insert into cliente(nome, telefone, cidade_id) values ('Ronaldo', '9945536',1);
insert into cliente(nome, telefone, cidade_id) values ('Sebastião', '9247462',1);
insert into cliente(nome, telefone, cidade_id) values ('Henrique', '995345',4);
insert into cliente(nome, telefone, cidade_id) values ('Breno', '9914260',13);
insert into cliente(nome, telefone, cidade_id) values ('Bruno', '99354356',2);
insert into cliente(nome, telefone, cidade_id) values ('Bruna', '9924630',1);
insert into cliente(nome, telefone, cidade_id) values ('Vanessa', '994536',11);
insert into cliente(nome, telefone, cidade_id) values ('Xuxa', '9925346',1);
insert into cliente(nome, telefone, cidade_id) values ('Vitória', '99134609',3);
insert into cliente(nome, telefone, cidade_id) values ('Izabella', '99543532',12);
insert into cliente(nome, telefone, cidade_id) values ('Guilherme', '95245463',1);
insert into cliente(nome, telefone, cidade_id) values ('Tiago', '9925464',1);
insert into cliente(nome, telefone, cidade_id) values ('Thiago', '9963356',1);
insert into cliente(nome, telefone, cidade_id) values ('Mateus', '9925462',3);
insert into cliente(nome, telefone, cidade_id) values ('Matheus', '9906753',3);
insert into cliente(nome, telefone, cidade_id) values ('Gustavo', '99436804',1);
insert into cliente(nome, telefone, cidade_id) values ('Augusto', '99574682',1);
insert into cliente(nome, telefone, cidade_id) values ('Daniel', '9934457',5);
insert into cliente(nome, telefone, cidade_id) values ('Damião', '9934657',3);
insert into cliente(nome, telefone, cidade_id) values ('Natália', '99436500',4);
