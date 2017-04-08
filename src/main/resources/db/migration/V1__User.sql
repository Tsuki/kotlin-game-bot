CREATE TABLE "User"
(
    id INT PRIMARY KEY NOT NULL,
    exp INT,
    level INT,
    attack INT,
    defence INT,
    faction INT,
    location INT,
    hp INT,
    mp INT,
    hp_max INT,
    mp_max INT
);
-- CREATE UNIQUE INDEX User_id_uindex ON "User" (id);