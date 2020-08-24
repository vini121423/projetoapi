Create table Pedido(
  id bigint auto_increment primary key,
  dataPedido date,
  idcliente int not null,
  valorPedido numeric(12,2)) ENGINE = InnoDB DEFAULT CHARSET = UTF8;
 
   
  alter table Pedido add constraint fk_pedido_cliente foreign key(idcliente) references Cliente(id);
  
  
                   
insert into Pedido(dataPedido,idcliente,valorPedido) values ('2020/08/01',2,'3.20');
insert into Pedido(dataPedido,idcliente,valorPedido) values ('2020/08/02',4,'7.50');    
insert into Pedido(dataPedido,idcliente,valorPedido) values ('2020/08/03',6,'31.00');       
insert into Pedido(dataPedido,idcliente,valorPedido) values ('2020/08/04',8,'7.50');    
insert into Pedido(dataPedido,idcliente,valorPedido) values ('2020/08/04',10,'100.00');    
insert into Pedido(dataPedido,idcliente,valorPedido) values ('2020/08/05',12,'12.50');    
insert into Pedido(dataPedido,idcliente,valorPedido) values ('2020/08/06',14,'45.00');   
  