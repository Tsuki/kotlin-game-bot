CREATE TABLE "User"
(
    id INT PRIMARY KEY NOT NULL,
    exp INT default 0 not null,
    level INT default 0 not null,
    attack INT default 5 not null,
    defence INT default 5 not null,
    faction INT default 0 not null,
    location INT default 0 not null,
    hp INT default 0 not null,
    mp INT default 0 not null,
    hp_max INT default 100 not null,
    mp_max INT default 100 not null
);
-- CREATE UNIQUE INDEX User_id_uindex ON "User" (id);