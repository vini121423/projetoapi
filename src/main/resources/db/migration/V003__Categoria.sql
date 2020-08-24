Create table Categoria(
    id int not null auto_increment primary key,
    nome varchar(100) not null) ENGINE = InnoDB DEFAULT CHARSET=UTF8;
    
    insert into Categoria(nome) values  ('Alimentícios'),('Lazer'),('Bem Estar'),('Eletrônicos');