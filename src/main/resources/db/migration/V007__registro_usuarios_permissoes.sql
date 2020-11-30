Create table usuario(
   codigo bigint(20) primary key,
   nome varchar(50) not null,
   email varchar(50) not null,
   senha varchar(150) not null) ENGINE = InnoDB DEFAULT CHARSET=utf8;
   
Create table permissao(
   codigo bigint(20) primary key,
   descricao varchar(50) not null
) ENGINE = InnoDB DEFAULT CHARSET=ut8;   

Create table usuario_permissao(
  codigo_usuario bigint(20) not null,
  codigo_permissao bigint(20) not null,
  primary key (codigo_usuario,codigo_permissao),
  foreign key (codigo_usuario) references usuario(codigo),
  foreign key (codigo_permissao) references permissao(codigo),
)ENGINE = InnoDB DEFAULT CHARSET=utf8;


insert into usuario (codigo,nome,email,senha) values (1,'Administrador','admin@admin.com', 'senha'),
                                                     (2,'Funcionário','func@admin.com', 'senha1');
                                                     
                                                     
insert into permissao(codigo, descricao) values (1, 'ROLE_CADASTRAR_CATEGORIA'),
                                                (2, 'ROLE_REMOVER_CATEGORIA'),
                                                (3, 'ROLE_PESQUISAR_CATEGORIA'),
                                                (4, 'ROLE_CADASTRAR_CIDADE'),
                                                (5, 'ROLE_REMOVER_CIDADE'),
                                                (6, 'ROLE_PESQUISAR_CIDADE'),
                                                (7, 'ROLE_CADASTRAR_PRODUTO'),
                                                (8, 'ROLE_REMOVER_PRODUTO'),
                                                (9, 'ROLE_PESQUISAR_PRODUTO'),
                                                (10, 'ROLE_CADASTRAR_PEDIDO'),
                                                (11, 'ROLE_REMOVER_PEDIDO'),
                                                (12, 'ROLE_PESQUISAR_PEDIDO'),
                                                (13, 'ROLE_CADASTRAR_CLIENTE'),
                                                (14, 'ROLE_REMOVER_CLIENTE'),
                                                (15, 'ROLE_PESQUISAR_CLIENTE');
                                               
insert into usuario_permissao(codigo_usuario,codigo_permissao) values (1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7),(1,8),(1,9),(1,10),(1,11),(1,12),(1,13),(1,14),(1,15);
                                                
                                                
                                                