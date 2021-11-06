-- создаем новые таблицы в схеме.

create table product
(
    id_product uuid not null,
    type_product int,
    nm_product varchar(255),
    nm_provider varchar(255),
    user_name varchar(255),
    primary key (id_product)
);
