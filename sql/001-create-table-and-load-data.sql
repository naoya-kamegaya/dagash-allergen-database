DROP TABLE IF EXISTS snacks;

CREATE TABLE snacks (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  contains_shrimps BIT,
  contains_crabs BIT,
  contains_wheat BIT,
  contains_buckwheat BIT,
  contains_eggs BIT,
  contains_milk BIT,
  contains_peanuts BIT,
  updated_at date,
  PRIMARY KEY(id)
);

INSERT INTO snacks VALUES (1, "うまい棒 コーンポタージュ味", 0, 0, 1, 0, 0, 1, 0, "2020-12-09");
INSERT INTO snacks VALUES (2, "ヤングドーナツ 4個", 0, 0, 1, 0, 1, 1, 0, "2021-10-19");
INSERT INTO snacks VALUES (3, "オレンジ フーセンガム", 0, 0, 0, 0, 0, 0, 0, "2017-05-21");
