create table account (
                     id bigint not null primary key,
                     account_type varchar(255),
                     clr_bal decimal(25,2),
                     created_by varchar (255),
                     created_date datetime(6),
                     last_modified_by varchar (255),
                     last_modified_date datetime(6),
                     version int
);

create table customers (
                       id varchar(255) not null primary key,
                       first_name varchar(255),
                       last_name varchar(255),
                       email varchar(255),
                       phone_number varchar(255),
                       bvn varchar(255),
                       created_by varchar (255),
                       created_date datetime(6),
                       last_modified_by varchar (255),
                       last_modified_date datetime(6),
                       version int
);