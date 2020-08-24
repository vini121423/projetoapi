Create table ItemPedido(
 id bigint not null auto_increment primary key,
 idpedido bigint not null,
 codigoproduto int not null,
 qtdeitem decimal(12,2),
 valorunitario decimal(12,2),
 totalitem decimal(12,2)) ENGINE = InnoDB DEFAULT CHARSET = UTF8;
 
alter table ItemPedido add constraint fk_itempedido_pedido foreign key(idpedido) references Pedido(id);
alter table ItemPedido add constraint fk_itempedido_produto foreign key(codigoproduto) references Produto(id);


insert into ItemPedido(idpedido,codigoproduto,qtdeitem,valorunitario,totalitem) values (1,3,12.00,92.00);      