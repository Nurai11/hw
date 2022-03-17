CREATE TABLE vid_sporta (
id integer  NOT NULL,
vid_sporta varchar(50) not NULL
);

select * from vid_sporta;


create table trainers(
id integer primary key,
full_name varchar (100),
vid_sporta_id integer references vid_sporta(id) not null,
phone_number varchar(50),
inn varchar(14) not null unique
);

select * from trainers;


insert into vid_sporta values
(1, 'Football'),
(2, 'Volleyboll'),
(3, 'Basketball');


insert into trainers values
(1, 'A', 1, '0500123456', '1234567'),
(2, 'B', 2, '0500654321', '123456'),
(3, 'C', 3, '0500987654', '12345678');


create table visitors (
full_name varchar (50),
birth_date varchar(20),
gender varchar(10)
);

select * from visitors; 

insert into visitors values
('Sasha', '11.11.11', 'w'),
('Dasha', '12.12.12', 'w');


create table visits(
visitors_name varchar(50) references visitors (full_name),
visit_time timestamp,
trainers varchar(30) references trainers (id)
)

select * from visits;

insert into visits values 
()








