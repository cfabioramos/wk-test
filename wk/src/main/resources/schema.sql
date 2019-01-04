create table TB_CLIENTE_CREDITO
(
   CD_CLIENTE integer not null,
   NOME_CLIENTE varchar(255) not null,
   LIMITE_CREDITO number(6,2) not null, 
   primary key(CD_CLIENTE)
);

create table TB_RISCO_CREDITO
(
   CD_RISCO_CREDITO integer not null,
   CD_CLIENTE integer not null,
   TIPO_RISCO varchar not null,
   primary key(CD_RISCO_CREDITO),
   FOREIGN KEY (CD_CLIENTE) REFERENCES TB_CLIENTE_CREDITO(CD_CLIENTE)
);