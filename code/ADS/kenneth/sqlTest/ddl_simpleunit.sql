DROP DOMAIN IF EXISTS NUMBERPLATE CASCADE ;
DROP DOMAIN IF EXISTS UNIT_POSITION CASCADE ;
DROP TYPE IF EXISTS UNIT_TYPE CASCADE ;
DROP TABLE IF EXISTS simpleunit CASCADE ;

CREATE DOMAIN NUMBERPLATE AS VARCHAR(7)
  CONSTRAINT CH_VALID_NUMBERPLATE
  CHECK (VALUE ~'[a-z]{2}[0-9]{5}|[0]{2}[0-9]{5}')
--   maybe remove ^ and from regex, possibly add this: |[0]{2}[0-9]{5}
;

CREATE DOMAIN UNIT_POSITION AS VARCHAR(2)
  CONSTRAINT CH_VALID_UNIT_POS
    CHECK (VALUE ~'[a-l]{1}[1-8]{1}')
;


CREATE TYPE UNIT_TYPE AS ENUM (
  'car',
  'boat',
  'caravan',
  'motorcycle'
);


CREATE TABLE simpleunit(
  numberplate NUMBERPLATE PRIMARY KEY,
  type UNIT_TYPE NOT NULL,
  position UNIT_POSITION NOT NULL
);


INSERT INTO simpleunit (numberplate, type, position)
    VALUES ('ab12345', 'car', 'a1')
;
INSERT INTO simpleunit(numberplate, type, position)
    VALUES ('0012345', 'boat','c4')
;
