Create table quarkus-social;

Create table Users (
	id bigserial not null primary key,
	name varchar (100) not null,
	age integer not null
)