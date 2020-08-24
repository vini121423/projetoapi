Create table Produto(
    id int not null auto_increment primary key,
    nome varchar(100) not null,
    preco numeric(12,2) not null,
    idcategoria int not null) ENGINE = InnoDB DEFAULT CHARSET = UTF8;
    
    alter table Produto add constraint fk_produto_categoria foreign key(idcategoria) references Categoria(id);
    
    insert into produto(nome,preco,idcategoria) values ('Pão de forma',3.40,1),
                   ('Raquete de tênis',25.90,2),('Vitamina',80.90,3),
                   ('Playstation 4 Pro',350.00,4);   