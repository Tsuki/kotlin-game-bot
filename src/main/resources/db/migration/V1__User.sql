CREATE TABLE "User"
(
  id              INT PRIMARY KEY                 NOT NULL,
  exp             INT DEFAULT 0                   NOT NULL,
  level           INT DEFAULT 0                   NOT NULL,
  attack          INT DEFAULT 5                   NOT NULL,
  defence         INT DEFAULT 5                   NOT NULL,
  faction         INT DEFAULT 0                   NOT NULL,
  location        INT DEFAULT 0                   NOT NULL,
  hp              REAL DEFAULT 0                  NOT NULL,
  mp              REAL DEFAULT 0                  NOT NULL,
  last_updatetime TIMESTAMP DEFAULT current_date  NOT NULL,
  hp_max          INT DEFAULT 100                 NOT NULL,
  mp_max          INT DEFAULT 100                 NOT NULL
);
-- CREATE UNIQUE INDEX User_id_uindex ON "User" (id);