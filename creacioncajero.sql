create database if not exists cajero;
use cajero;

drop table if exists movimientos;
drop table if exists tarjetas;
drop table if exists propietario;
drop table if exists cuentas;
drop table if exists clientes;

create table if not exists clientes(
nombre varchar(20)not null,
apellido1 varchar(20)not null,
apellido2 varchar(20)not null,
telefono char(9)not null unique,
email varchar(20)not null unique,
direccion varchar(200)not null,
dni char(9) primary key,
contrasena varchar(20) not null
);

create table if not exists cuentas(
cliente enum('individual','indistinto'),
iban int unsigned auto_increment primary key,
saldo int not null
);

create table if not exists propietario(
cuenta int unsigned,
cliente char(9),
primary key(cuenta, cliente),
foreign key (cuenta) references cuentas(iban),
foreign key (cliente) references clientes(dni)
);

create table if not exists tarjetas(
pin char(4) not null,
numero int unsigned auto_increment primary key,
tipo enum('credito','debito'),
limite_diario int not null,
limite_mensual int not null,
cuenta int unsigned,
cliente char(9),
check(limite_diario>0),
check(limite_mensual>0),
check(limite_mensual>limite_diario),
foreign key (cuenta,cliente) references propietario(cuenta,cliente)
);

create table if not exists movimientos(
cuenta_receptor int unsigned,
cuenta_emisor int unsigned, 
codigo int unsigned auto_increment primary key, 
transferencia int unsigned not null,
foreign key (cuenta_receptor) references cuentas(iban),
foreign key (cuenta_emisor) references cuentas(iban)
);
insert into clientes values('Jorge','Baños','Quiroga','600100100','jbq@gmail.com','Plaza Mayor', 123456789,'123'),
('Aaron','Valea','Martin','600100200','avm@gmail.com','Plaza Mayor', 111222333,'123'),
('Sergio','Erce','Martinez','600100300','sem@gmail.com','Plaza Mayor', 987654321,'123');

insert into cuentas values('individual',1, 1000),
('individual', 2,  1000),
('individual', 3, 1000),
('indistinto',4, 1000);

insert into propietario values(1, 123456789),
(2, 111222333),
(3, 987654321),
(4, 123456789),
(4, 111222333);

insert into tarjetas values(1234, 1,'debito', 10, 100, 1, 123456789),
(1234, 2, 'debito', 10, 100, 2, 111222333),
(1234, 3, 'debito', 10, 100, 3, 987654321),
(1234, 4, 'debito', 10, 100, 4, 123456789),
(1234, 5, 'debito', 10, 100, 4, 111222333);
