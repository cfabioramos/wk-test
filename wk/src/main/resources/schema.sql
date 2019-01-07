create table TB_CLIENTE_CREDITO
(
   CD_CLIENTE_CREDITO integer auto_increment primary key,
   NM_CLIENTE varchar(255) not null,
   LIMITE_CREDITO number(6,2) not null,
   TP_RISCO char(1) not null,
   TX_JUROS numeric(2,0)
);

