-- Converted by db_converter
START TRANSACTION;
SET standard_conforming_strings = OFF;
SET escape_string_warning = OFF;
SET CONSTRAINTS ALL DEFERRED;

CREATE TABLE "ability" (
  "ability_id"      INTEGER      NOT NULL,
  "name"            VARCHAR(510) NOT NULL,
  "ability_type_id" INTEGER      NOT NULL,
  "required_level"  INT2 DEFAULT NULL,
  PRIMARY KEY ("ability_id")
);

CREATE TABLE "ability_type" (
  "ability_type_id" INTEGER      NOT NULL,
  "name"            VARCHAR(510) NOT NULL,
  "desc"            VARCHAR(510) DEFAULT NULL,
  PRIMARY KEY ("ability_type_id")
);

CREATE TABLE "attribute" (
  "attribute_id" INTEGER      NOT NULL,
  "name"         VARCHAR(510) NOT NULL,
  "desc"         VARCHAR(510) DEFAULT NULL,
  PRIMARY KEY ("attribute_id")
);

INSERT INTO "attribute" VALUES (1, 'strength', 'A measure of how physically strong a character is.'),
  (2, 'constitution', 'A measure of how resilient a character is.'),
  (3, 'dexterity', 'A measure of how agile a character is.'),
  (4, 'intelligence', 'A measure of a character''s problem-solving ability.'),
  (5, 'charisma', 'A measure of a character''s social skills, and sometimes their physical appearance.'),
  (6, 'wisdom', 'A measure of a character''s common sense and/or spirituality.'),
  (7, 'willpower', 'A measure of the character''s mental resistance.'),
  (8, 'perception', 'A measure of a character''s openness to their surroundings.'),
  (9, 'luck', 'A measure of a character having chance to favor him or her.'),
  (10, 'damage', 'A measure to inflict damage');
CREATE TABLE "character" (
  "character_id"      INTEGER      NOT NULL,
  "character_type_id" INTEGER      NOT NULL,
  "name"              VARCHAR(510) NOT NULL,
  "alive"             INT4         NOT NULL,
  "level"             INT2         NOT NULL,
  "xp"                BIGINT       NOT NULL,
  "money"             BIGINT       NOT NULL,
  PRIMARY KEY ("character_id")
);

CREATE TABLE "character_attribute" (
  "character_attribute_id" INTEGER NOT NULL,
  "character_id"           INTEGER NOT NULL,
  "attribute_id"           INTEGER NOT NULL,
  "value"                  BIGINT  NOT NULL,
  PRIMARY KEY ("character_attribute_id"),
  UNIQUE ("character_id", "attribute_id")
);

CREATE TABLE "character_class" (
  "character_class_id" INTEGER NOT NULL,
  "character_id"       INTEGER NOT NULL,
  "class_id"           INTEGER NOT NULL,
  PRIMARY KEY ("character_class_id"),
  UNIQUE ("character_id")
);

CREATE TABLE "character_equipment" (
  "character_equipment_id" INTEGER NOT NULL,
  "equipment_slot_id"      INTEGER NOT NULL,
  "character_id"           INTEGER NOT NULL,
  "item_id"                INTEGER NOT NULL,
  PRIMARY KEY ("equipment_slot_id"),
  UNIQUE ("equipment_slot_id", "character_id")
);

CREATE TABLE "character_faction" (
  "character_faction_id" INTEGER NOT NULL,
  "character_id"         INTEGER NOT NULL,
  "faction_id"           INTEGER NOT NULL,
  PRIMARY KEY ("character_faction_id")
);

CREATE TABLE "character_guild" (
  "character_guild_id" INTEGER NOT NULL,
  "character_id"       INTEGER NOT NULL,
  "guild_id"           INTEGER NOT NULL,
  "guild_leader"       INT4 DEFAULT NULL,
  PRIMARY KEY ("character_guild_id"),
  UNIQUE ("guild_id", "guild_leader")
);

CREATE TABLE "character_guild_rank" (
  "character_guild_rank_id" INTEGER NOT NULL,
  "character_id"            INTEGER NOT NULL,
  "guild_rank_id"           INTEGER NOT NULL,
  PRIMARY KEY ("character_guild_rank_id"),
  UNIQUE ("character_id", "guild_rank_id")
);

CREATE TABLE "character_item" (
  "character_item_id" INTEGER NOT NULL,
  "character_id"      INTEGER NOT NULL,
  "item_id"           INTEGER NOT NULL,
  PRIMARY KEY ("character_item_id"),
  UNIQUE ("character_id", "item_id")
);

CREATE TABLE "character_location" (
  "character_location_id" INTEGER NOT NULL,
  "character_id"          INTEGER NOT NULL,
  "location_id"           INTEGER NOT NULL,
  PRIMARY KEY ("character_location_id"),
  UNIQUE ("character_id")
);

CREATE TABLE "character_loot" (
  "character_loot_id" INTEGER NOT NULL,
  "loot_id"           INTEGER NOT NULL,
  "character_id"      INTEGER NOT NULL,
  PRIMARY KEY ("character_loot_id")
);

CREATE TABLE "character_party" (
  "character_party_id" INTEGER NOT NULL,
  "character_id"       INTEGER NOT NULL,
  "party_id"           INTEGER NOT NULL,
  "party_leader"       INT4 DEFAULT NULL,
  PRIMARY KEY ("character_party_id"),
  UNIQUE ("character_id"),
  UNIQUE ("party_id", "party_leader")
);

CREATE TABLE "character_status_effect" (
  "character_status_effect_id" INTEGER   NOT NULL,
  "character_id"               INTEGER   NOT NULL,
  "status_effect_id"           INTEGER   NOT NULL,
  "date"                       TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY ("character_status_effect_id")
);

CREATE TABLE "character_title" (
  "character_title_id" INTEGER NOT NULL,
  "character_id"       INTEGER NOT NULL,
  "title_id"           INTEGER NOT NULL,
  PRIMARY KEY ("character_title_id")
);

CREATE TABLE "character_type" (
  "character_type_id" INTEGER      NOT NULL,
  "name"              VARCHAR(510) NOT NULL,
  PRIMARY KEY ("character_type_id")
);

INSERT INTO "character_type" VALUES (1, 'player'), (2, 'non-playable');
CREATE TABLE "class" (
  "class_id" INTEGER      NOT NULL,
  "name"     VARCHAR(510) NOT NULL,
  PRIMARY KEY ("class_id"),
  UNIQUE ("name")
);

CREATE TABLE "class_ability" (
  "class_ability_id" INTEGER NOT NULL,
  "class_id"         INTEGER NOT NULL,
  "ability_id"       INTEGER NOT NULL,
  PRIMARY KEY ("class_ability_id"),
  UNIQUE ("class_id", "ability_id")
);

CREATE TABLE "conf" (
  "conf_id" INTEGER      NOT NULL,
  "name"    VARCHAR(510) NOT NULL,
  "value"   VARCHAR(510) DEFAULT NULL,
  PRIMARY KEY ("conf_id"),
  UNIQUE ("name")
);

CREATE TABLE "effect_type" (
  "effect_type_id" INTEGER      NOT NULL,
  "name"           VARCHAR(510) NOT NULL,
  "desc"           VARCHAR(510) DEFAULT NULL,
  PRIMARY KEY ("effect_type_id")
);

INSERT INTO "effect_type" VALUES (1, 'buff', 'A temporary benefit to a character’s attributes'),
  (2, 'debuff', 'A temporary hindrance to a character’s attributes');
CREATE TABLE "entity" (
  "entity_id"      INTEGER      NOT NULL,
  "entity_type_id" INTEGER      NOT NULL,
  "name"           VARCHAR(510) NOT NULL,
  "level"          INT2 DEFAULT NULL,
  PRIMARY KEY ("entity_id")
);

CREATE TABLE "entity_attribute" (
  "entity_attribute_id" INTEGER NOT NULL,
  "entity_id"           INTEGER NOT NULL,
  "attribute_id"        INTEGER NOT NULL,
  "value"               BIGINT  NOT NULL,
  PRIMARY KEY ("entity_attribute_id"),
  UNIQUE ("entity_id", "attribute_id")
);

CREATE TABLE "entity_class" (
  "entity_class_id" INTEGER NOT NULL,
  "entity_id"       INTEGER NOT NULL,
  "class_id"        INTEGER NOT NULL,
  PRIMARY KEY ("entity_class_id"),
  UNIQUE ("entity_id")
);

CREATE TABLE "entity_faction" (
  "entity_faction_id" INTEGER NOT NULL,
  "entity_id"         INTEGER NOT NULL,
  "faction_id"        INTEGER NOT NULL,
  PRIMARY KEY ("entity_faction_id")
);

CREATE TABLE "entity_location" (
  "entity_location_id" INTEGER NOT NULL,
  "entity_id"          INTEGER NOT NULL,
  "location_id"        INTEGER NOT NULL,
  PRIMARY KEY ("entity_location_id"),
  UNIQUE ("entity_id")
);

CREATE TABLE "entity_loot" (
  "entity_loot_id" INTEGER NOT NULL,
  "loot_id"        INTEGER NOT NULL,
  "entity_id"      INTEGER NOT NULL,
  PRIMARY KEY ("entity_loot_id")
);

CREATE TABLE "entity_status_effect" (
  "entity_status_effect_id" INTEGER   NOT NULL,
  "entity_id"               INTEGER   NOT NULL,
  "status_effect_id"        INTEGER   NOT NULL,
  "date"                    TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY ("entity_status_effect_id")
);

CREATE TABLE "entity_type" (
  "entity_type_id" INTEGER      NOT NULL,
  "name"           VARCHAR(510) NOT NULL,
  PRIMARY KEY ("entity_type_id")
);

CREATE TABLE "equipment_slot" (
  "equipment_slot_id" INTEGER      NOT NULL,
  "name"              VARCHAR(510) NOT NULL,
  PRIMARY KEY ("equipment_slot_id"),
  UNIQUE ("name")
);

INSERT INTO "equipment_slot"
VALUES (4, 'back'), (3, 'chest'), (11, 'ears'), (9, 'feet'), (6, 'hands'), (1, 'head'), (8, 'leg'), (13, 'main_hand'),
  (10, 'neck'), (14, 'off_hand'), (12, 'ring'), (2, 'shoulder'), (7, 'waist'), (5, 'wrist');
CREATE TABLE "faction" (
  "faction_id" INTEGER      NOT NULL,
  "name"       VARCHAR(510) NOT NULL,
  PRIMARY KEY ("faction_id")
);

CREATE TABLE "guild" (
  "guild_id" INTEGER      NOT NULL,
  "name"     VARCHAR(510) NOT NULL,
  PRIMARY KEY ("guild_id")
);

CREATE TABLE "guild_rank" (
  "guild_rank_id" INTEGER NOT NULL,
  "guild_id"      INTEGER NOT NULL,
  "rank_id"       INTEGER NOT NULL,
  PRIMARY KEY ("guild_rank_id"),
  UNIQUE ("guild_id", "rank_id")
);

CREATE TABLE "item" (
  "item_id"        INTEGER      NOT NULL,
  "item_type_id"   INTEGER      NOT NULL,
  "name"           VARCHAR(510) NOT NULL,
  "required_level" INT2 DEFAULT NULL,
  "durability"     INT4         NOT NULL,
  PRIMARY KEY ("item_id")
);

CREATE TABLE "item_attribute" (
  "item_attribute_id" INTEGER NOT NULL,
  "item_id"           INTEGER NOT NULL,
  "attribute_id"      INTEGER NOT NULL,
  "value"             BIGINT  NOT NULL,
  PRIMARY KEY ("item_attribute_id"),
  UNIQUE ("item_id", "attribute_id")
);

CREATE TABLE "item_location" (
  "item_location_id" INTEGER NOT NULL,
  "item_id"          INTEGER NOT NULL,
  "location_id"      INTEGER NOT NULL,
  PRIMARY KEY ("item_location_id"),
  UNIQUE ("item_id")
);

CREATE TABLE "item_loot" (
  "item_loot_id" INTEGER NOT NULL,
  "loot_id"      INTEGER NOT NULL,
  "item_id"      INTEGER NOT NULL,
  "drop_chance"  REAL DEFAULT NULL,
  PRIMARY KEY ("item_loot_id")
);

CREATE TABLE "item_type" (
  "item_type_id" INTEGER      NOT NULL,
  "name"         VARCHAR(510) NOT NULL,
  "desc"         VARCHAR(510) DEFAULT NULL,
  PRIMARY KEY ("item_type_id")
);

CREATE TABLE "location" (
  "location_id" INTEGER NOT NULL,
  "x"           BIGINT  NOT NULL,
  "y"           BIGINT  NOT NULL,
  "place_id"    INTEGER NOT NULL,
  PRIMARY KEY ("location_id"),
  UNIQUE ("x", "y")
);

CREATE TABLE "loot" (
  "loot_id" INTEGER NOT NULL,
  "xp"      BIGINT DEFAULT NULL,
  "money"   BIGINT DEFAULT NULL,
  PRIMARY KEY ("loot_id")
);

CREATE TABLE "party" (
  "party_id" INTEGER NOT NULL,
  PRIMARY KEY ("party_id")
);

CREATE TABLE "place" (
  "place_id" INTEGER      NOT NULL,
  "name"     VARCHAR(510) NOT NULL,
  PRIMARY KEY ("place_id")
);

CREATE TABLE "rank" (
  "rank_id" INTEGER      NOT NULL,
  "name"    VARCHAR(510) NOT NULL,
  PRIMARY KEY ("rank_id")
);

CREATE TABLE "status_effect" (
  "status_effect_id" INTEGER      NOT NULL,
  "name"             VARCHAR(510) NOT NULL,
  "effect_type_id"   INTEGER      NOT NULL,
  "duration"         BIGINT       DEFAULT NULL,
  "desc"             VARCHAR(510) DEFAULT NULL,
  PRIMARY KEY ("status_effect_id")
);

CREATE TABLE "title" (
  "title_id" INTEGER      NOT NULL,
  "name"     VARCHAR(510) NOT NULL,
  PRIMARY KEY ("title_id")
);

CREATE TABLE "user" (
  "user_id"      INTEGER      NOT NULL,
  "user_type_id" INTEGER      NOT NULL,
  "first_name"   VARCHAR(510) NOT NULL,
  "last_name"    VARCHAR(510) NOT NULL,
  "email"        VARCHAR(510) NOT NULL,
  "password"     VARCHAR(510) NOT NULL,
  PRIMARY KEY ("user_id")
);

CREATE TABLE "user_character" (
  "user_character_id" INTEGER NOT NULL,
  "user_id"           INTEGER NOT NULL,
  "character_id"      INTEGER NOT NULL,
  PRIMARY KEY ("user_character_id"),
  UNIQUE ("user_id", "character_id")
);

CREATE TABLE "user_type" (
  "user_type_id" INTEGER      NOT NULL,
  "name"         VARCHAR(510) NOT NULL,
  PRIMARY KEY ("user_type_id")
);

INSERT INTO "user_type" VALUES (1, 'admin'), (2, 'moderator'), (3, 'player'), (4, 'spectator');

-- Post-data save --
COMMIT;
START TRANSACTION;

-- Typecasts --
ALTER TABLE "character"
  ALTER COLUMN "alive" DROP DEFAULT,
  ALTER COLUMN "alive" TYPE BOOLEAN USING CAST("alive" AS BOOLEAN);
ALTER TABLE "character_guild"
  ALTER COLUMN "guild_leader" DROP DEFAULT,
  ALTER COLUMN "guild_leader" TYPE BOOLEAN USING CAST("guild_leader" AS BOOLEAN);
ALTER TABLE "character_party"
  ALTER COLUMN "party_leader" DROP DEFAULT,
  ALTER COLUMN "party_leader" TYPE BOOLEAN USING CAST("party_leader" AS BOOLEAN);
ALTER TABLE "item"
  ALTER COLUMN "durability" DROP DEFAULT,
  ALTER COLUMN "durability" TYPE BOOLEAN USING CAST("durability" AS BOOLEAN);

-- Foreign keys --
ALTER TABLE "ability"
  ADD CONSTRAINT "fk_ability_ability_type_id" FOREIGN KEY ("ability_type_id") REFERENCES "ability_type" ("ability_type_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "ability" ("ability_type_id");
ALTER TABLE "character"
  ADD CONSTRAINT "fk_character_character_type_id" FOREIGN KEY ("character_type_id") REFERENCES "character_type" ("character_type_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character" ("character_type_id");
ALTER TABLE "character_attribute"
  ADD CONSTRAINT "fk_character_attribute_attribute_id" FOREIGN KEY ("attribute_id") REFERENCES "attribute" ("attribute_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_attribute" ("attribute_id");
ALTER TABLE "character_attribute"
  ADD CONSTRAINT "fk_character_attribute_character_id" FOREIGN KEY ("character_id") REFERENCES "character" ("character_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_attribute" ("character_id");
ALTER TABLE "character_class"
  ADD CONSTRAINT "fk_character_class_character_id" FOREIGN KEY ("character_id") REFERENCES "character" ("character_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_class" ("character_id");
ALTER TABLE "character_class"
  ADD CONSTRAINT "fk_character_class_class_id" FOREIGN KEY ("class_id") REFERENCES "class" ("class_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_class" ("class_id");
ALTER TABLE "character_equipment"
  ADD CONSTRAINT "fk_character_equipment_character_id" FOREIGN KEY ("character_id") REFERENCES "character" ("character_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_equipment" ("character_id");
ALTER TABLE "character_equipment"
  ADD CONSTRAINT "fk_character_equipment_equipment_slot_id" FOREIGN KEY ("equipment_slot_id") REFERENCES "equipment_slot" ("equipment_slot_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_equipment" ("equipment_slot_id");
ALTER TABLE "character_equipment"
  ADD CONSTRAINT "fk_character_equipment_item_id" FOREIGN KEY ("item_id") REFERENCES "item" ("item_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_equipment" ("item_id");
ALTER TABLE "character_faction"
  ADD CONSTRAINT "fk_character_faction_character_id" FOREIGN KEY ("character_id") REFERENCES "character" ("character_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_faction" ("character_id");
ALTER TABLE "character_faction"
  ADD CONSTRAINT "fk_character_faction_faction_id" FOREIGN KEY ("faction_id") REFERENCES "faction" ("faction_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_faction" ("faction_id");
ALTER TABLE "character_guild"
  ADD CONSTRAINT "fk_character_guild_character_id" FOREIGN KEY ("character_id") REFERENCES "character" ("character_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_guild" ("character_id");
ALTER TABLE "character_guild"
  ADD CONSTRAINT "fk_character_guild_guild_id" FOREIGN KEY ("guild_id") REFERENCES "guild" ("guild_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_guild" ("guild_id");
ALTER TABLE "character_guild_rank"
  ADD CONSTRAINT "fk_character_guild_rank_character_id" FOREIGN KEY ("character_id") REFERENCES "character" ("character_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_guild_rank" ("character_id");
ALTER TABLE "character_guild_rank"
  ADD CONSTRAINT "fk_character_guild_rank_guild_rank_id" FOREIGN KEY ("guild_rank_id") REFERENCES "guild_rank" ("guild_rank_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_guild_rank" ("guild_rank_id");
ALTER TABLE "character_item"
  ADD CONSTRAINT "fk_character_item_character_id" FOREIGN KEY ("character_id") REFERENCES "character" ("character_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_item" ("character_id");
ALTER TABLE "character_item"
  ADD CONSTRAINT "fk_character_item_item_id" FOREIGN KEY ("item_id") REFERENCES "item" ("item_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_item" ("item_id");
ALTER TABLE "character_location"
  ADD CONSTRAINT "fk_character_location_character_id" FOREIGN KEY ("character_id") REFERENCES "character" ("character_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_location" ("character_id");
ALTER TABLE "character_location"
  ADD CONSTRAINT "fk_character_location_location_id" FOREIGN KEY ("location_id") REFERENCES "location" ("location_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_location" ("location_id");
ALTER TABLE "character_loot"
  ADD CONSTRAINT "fk_character_loot_character_id" FOREIGN KEY ("character_id") REFERENCES "character" ("character_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_loot" ("character_id");
ALTER TABLE "character_loot"
  ADD CONSTRAINT "fk_character_loot_loot_id" FOREIGN KEY ("loot_id") REFERENCES "loot" ("loot_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_loot" ("loot_id");
ALTER TABLE "character_party"
  ADD CONSTRAINT "fk_character_party_character_id" FOREIGN KEY ("character_id") REFERENCES "character" ("character_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_party" ("character_id");
ALTER TABLE "character_party"
  ADD CONSTRAINT "fk_character_party_party_id" FOREIGN KEY ("party_id") REFERENCES "party" ("party_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_party" ("party_id");
ALTER TABLE "character_status_effect"
  ADD CONSTRAINT "fk_character_status_effect_character_id" FOREIGN KEY ("character_id") REFERENCES "character" ("character_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_status_effect" ("character_id");
ALTER TABLE "character_status_effect"
  ADD CONSTRAINT "fk_character_status_effect_status_effect_id" FOREIGN KEY ("status_effect_id") REFERENCES "status_effect" ("status_effect_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_status_effect" ("status_effect_id");
ALTER TABLE "character_title"
  ADD CONSTRAINT "fk_character_title_character_id" FOREIGN KEY ("character_id") REFERENCES "character" ("character_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_title" ("character_id");
ALTER TABLE "character_title"
  ADD CONSTRAINT "fk_character_title_title_id" FOREIGN KEY ("title_id") REFERENCES "title" ("title_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "character_title" ("title_id");
ALTER TABLE "class_ability"
  ADD CONSTRAINT "fk_class_ability_ability_id" FOREIGN KEY ("ability_id") REFERENCES "ability" ("ability_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "class_ability" ("ability_id");
ALTER TABLE "class_ability"
  ADD CONSTRAINT "fk_class_ability_class_id" FOREIGN KEY ("class_id") REFERENCES "class" ("class_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "class_ability" ("class_id");
ALTER TABLE "entity"
  ADD CONSTRAINT "fk_entity_entity_type_id" FOREIGN KEY ("entity_type_id") REFERENCES "entity_type" ("entity_type_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "entity" ("entity_type_id");
ALTER TABLE "entity_attribute"
  ADD CONSTRAINT "fk_entity_attribute_attribute_id" FOREIGN KEY ("attribute_id") REFERENCES "attribute" ("attribute_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "entity_attribute" ("attribute_id");
ALTER TABLE "entity_attribute"
  ADD CONSTRAINT "fk_entity_attribute_entity_id" FOREIGN KEY ("entity_id") REFERENCES "entity" ("entity_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "entity_attribute" ("entity_id");
ALTER TABLE "entity_class"
  ADD CONSTRAINT "fk_entity_class_class_id" FOREIGN KEY ("class_id") REFERENCES "class" ("class_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "entity_class" ("class_id");
ALTER TABLE "entity_class"
  ADD CONSTRAINT "fk_entity_class_entity_id" FOREIGN KEY ("entity_id") REFERENCES "entity" ("entity_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "entity_class" ("entity_id");
ALTER TABLE "entity_faction"
  ADD CONSTRAINT "fk_entity_faction_entity_id" FOREIGN KEY ("entity_id") REFERENCES "entity" ("entity_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "entity_faction" ("entity_id");
ALTER TABLE "entity_faction"
  ADD CONSTRAINT "fk_entity_faction_faction_id" FOREIGN KEY ("faction_id") REFERENCES "faction" ("faction_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "entity_faction" ("faction_id");
ALTER TABLE "entity_location"
  ADD CONSTRAINT "fk_entity_location_entity_id" FOREIGN KEY ("entity_id") REFERENCES "entity" ("entity_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "entity_location" ("entity_id");
ALTER TABLE "entity_location"
  ADD CONSTRAINT "fk_entity_location_location_id" FOREIGN KEY ("location_id") REFERENCES "location" ("location_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "entity_location" ("location_id");
ALTER TABLE "entity_loot"
  ADD CONSTRAINT "fk_entity_loot_entity_id" FOREIGN KEY ("entity_id") REFERENCES "entity" ("entity_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "entity_loot" ("entity_id");
ALTER TABLE "entity_loot"
  ADD CONSTRAINT "fk_entity_loot_loot_id" FOREIGN KEY ("loot_id") REFERENCES "loot" ("loot_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "entity_loot" ("loot_id");
ALTER TABLE "entity_status_effect"
  ADD CONSTRAINT "fk_entity_status_effect_entity_id" FOREIGN KEY ("entity_id") REFERENCES "entity" ("entity_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "entity_status_effect" ("entity_id");
ALTER TABLE "entity_status_effect"
  ADD CONSTRAINT "fk_entity_status_effect_status_effect_id" FOREIGN KEY ("status_effect_id") REFERENCES "status_effect" ("status_effect_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "entity_status_effect" ("status_effect_id");
ALTER TABLE "guild_rank"
  ADD CONSTRAINT "fk_guild_rank_guild_id" FOREIGN KEY ("guild_id") REFERENCES "guild" ("guild_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "guild_rank" ("guild_id");
ALTER TABLE "guild_rank"
  ADD CONSTRAINT "fk_guild_rank_rank_id" FOREIGN KEY ("rank_id") REFERENCES "rank" ("rank_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "guild_rank" ("rank_id");
ALTER TABLE "item"
  ADD CONSTRAINT "fk_item_item_type_id" FOREIGN KEY ("item_type_id") REFERENCES "item_type" ("item_type_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "item" ("item_type_id");
ALTER TABLE "item_attribute"
  ADD CONSTRAINT "fk_item_attribute_attribute_id" FOREIGN KEY ("attribute_id") REFERENCES "attribute" ("attribute_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "item_attribute" ("attribute_id");
ALTER TABLE "item_attribute"
  ADD CONSTRAINT "fk_item_attribute_item_id" FOREIGN KEY ("item_id") REFERENCES "item" ("item_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "item_attribute" ("item_id");
ALTER TABLE "item_location"
  ADD CONSTRAINT "fk_item_location_item_id" FOREIGN KEY ("item_id") REFERENCES "item" ("item_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "item_location" ("item_id");
ALTER TABLE "item_location"
  ADD CONSTRAINT "fk_item_location_location_id" FOREIGN KEY ("location_id") REFERENCES "location" ("location_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "item_location" ("location_id");
ALTER TABLE "item_loot"
  ADD CONSTRAINT "fk_item_loot_item_id" FOREIGN KEY ("item_id") REFERENCES "item" ("item_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "item_loot" ("item_id");
ALTER TABLE "item_loot"
  ADD CONSTRAINT "fk_item_loot_loot_id" FOREIGN KEY ("loot_id") REFERENCES "loot" ("loot_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "item_loot" ("loot_id");
ALTER TABLE "location"
  ADD CONSTRAINT "fk_location_place_id" FOREIGN KEY ("place_id") REFERENCES "place" ("place_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "location" ("place_id");
ALTER TABLE "status_effect"
  ADD CONSTRAINT "fk_status_effect_effect_type_id" FOREIGN KEY ("effect_type_id") REFERENCES "effect_type" ("effect_type_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "status_effect" ("effect_type_id");
ALTER TABLE "user"
  ADD CONSTRAINT "fk_user_user_type_id" FOREIGN KEY ("user_type_id") REFERENCES "user_type" ("user_type_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "user" ("user_type_id");
ALTER TABLE "user_character"
  ADD CONSTRAINT "fk_user_character_character_id" FOREIGN KEY ("character_id") REFERENCES "character" ("character_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "user_character" ("character_id");
ALTER TABLE "user_character"
  ADD CONSTRAINT "fk_user_character_user_id" FOREIGN KEY ("user_id") REFERENCES "user" ("user_id") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX ON "user_character" ("user_id");

-- Sequences --

-- Full Text keys --

COMMIT;
