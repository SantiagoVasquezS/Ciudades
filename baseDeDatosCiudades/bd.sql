create table habitante(
    id varchar(15),
    n_hijos int,
    apellido varchar(200),
    id_predioC int,
    nitE varchar(20),

    primary key(id),
    foreign key(id_predioC) references casa(id_predio),
    foreign key(nitE) references empresa(nit)
);

create table empresa(
    nit varchar(20),
    n_maquinas int,
    f_fundacion date,

    primary key(nit)
);

create table parque(
    cod_placas varchar(8),
    n_arboles int,
    area float,

    primary key(cod_placas)
);

create table casa(
    id_predio varchar(20),
    n_habitantes int,
    estructura varchar(100),
    idH varchar(15),

    primary key(id_predio),
    foreign key(idH) references habitante(id)
);

create table asistencia(
    idH varchar(15),
    cod_placasParque varchar(8),
    fecha_hora timestamp,

    primary key(idH,cod_placasParque,fecha_hora),
    foreign key(idH) references habitante(id),
    foreign key(cod_placasParque) references parque(cod_placas)
);

insert into habitante (id,n_hijos,apellido) values 
(1,1, 'Villamil'),
(2,1, 'Vasquez'),
(3,2, 'Caro'),
(4,3, 'Giraldo'),
(5,4, 'Urrea');

alter table habitante 
    add constraint habitante_fk1 foreign key(id_predioC) references casa(id_predio),
    add constraint habitante_fk2 foreign key(nitE) references empresa(nit)

alter table casa
    add constraint casa_fk1 foreign key(idH) references habitante(id);

alter table asistencia
    add constraint asistencia_fk1 foreign key(idH) references habitante(id),
    add constraint asistencia_fk2 foreign key(cod_placasParque) references parque(cod_placas);
    



