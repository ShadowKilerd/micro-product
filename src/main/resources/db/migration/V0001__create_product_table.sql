create table product (
id int not null primary key,
name varchar(50) not null,
price decimal(10,2) not null,
unit varchar(50) not null,
total_amount int not null,
img_url varchar(500) not null
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

create table shopping_item (
id varchar(50) not null primary key,
user_id varchar(50) not null,
product_id varchar(50) not null,
amount int not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;