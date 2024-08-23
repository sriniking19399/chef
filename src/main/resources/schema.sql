create table if not exists restaurant(
        id int primary key AUTO_INCREMENT,
        name text,
        address text,
        cuisineType text,
        rating int

);

create table if not exists chef(
    id int primary key AUTO_INCREMENT,
    firstName text,
    lastName text,
    expertise text,
    experienceYears int,
    restaurantId int,
    foreign key(restaurantId) references restaurant(id)
);

