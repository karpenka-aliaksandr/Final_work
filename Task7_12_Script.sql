DROP DATABASE IF EXISTS Друзья_человека;
CREATE DATABASE Друзья_человека;
USE Друзья_человека;

DROP TABLE IF EXISTS Types_animal;
CREATE TABLE Types_animal
(
type_id INT AUTO_INCREMENT PRIMARY KEY,
type_name VARCHAR(20) NOT NULL
);

INSERT INTO Types_animal (type_name)
VALUES
('Домашние животные'),
('Дикие животные');

SELECT * FROM Types_animal;

DROP TABLE IF EXISTS Comands;
CREATE TABLE Comands 
(
comand_id INT AUTO_INCREMENT PRIMARY KEY,
comand_name VARCHAR(20) NOT NULL
);

INSERT INTO Comands (comand_name)
VALUES
('лежать'),
('голос'),
('сидеть'),
('фас'),
('есть'),
('крутить колесо'),
('голоп'),
('шагом'),
('рысью'),
('идти');

SELECT * FROM Comands;

DROP TABLE IF EXISTS Pets;
CREATE TABLE Pets
(
animal_id INT AUTO_INCREMENT PRIMARY KEY,
animal_type INT,
animal_group VARCHAR(20) NOT NULL,
animal_name VARCHAR(20) NOT NULL,
animal_birthdate date,
FOREIGN KEY (animal_type) REFERENCES Types_animal (type_id) 
);


INSERT INTO Pets (animal_type, animal_group, animal_name,animal_birthdate)
VALUES
('1', 'Собака','Борис', '2022-03-28'),
('1', 'Собака','Джек', '2017-08-10'),
('1', 'Собака','Томас Шелби', '2010-11-17'),
('1', 'Кот','Санчес', '2021-03-21'),
('1', 'Хомяк','Диего', '2020-01-08'),
('1', 'Кошка','Валли', '2022-03-28');

DROP TABLE IF EXISTS Wild_animals;
CREATE TABLE Wild_animals
(
animal_id INT AUTO_INCREMENT PRIMARY KEY,
animal_type INT,
animal_group VARCHAR(20) NOT NULL,
animal_name VARCHAR(20) NOT NULL,
animal_birthdate date,
FOREIGN KEY (animal_type) REFERENCES Types_animal (Type_id) 
);

INSERT INTO Wild_animals (animal_type, animal_group, animal_name, animal_birthdate)
VALUES
('2', 'Лошадь','Сандра Булок', '2019-03-14'),
('2', 'Конь','Ричард', '2013-07-10'),
('2', 'Верблюд','Чук', '2018-11-23'),
('2', 'Осел','Хорхе', '2018-01-21');


-- Объединим таблицы 
DROP TABLE IF EXISTS Animals;

CREATE TABLE Animals (
	animal_id INT AUTO_INCREMENT PRIMARY KEY,
	animal_type INT,
	animal_group VARCHAR(20) NOT NULL,
	animal_name VARCHAR(20) NOT NULL,
	animal_birthdate date,
	FOREIGN KEY (animal_type) REFERENCES Types_animal (Type_id));

INSERT INTO Animals (animal_type, animal_group, animal_name, animal_birthdate)
	SELECT animal_type, animal_group, animal_name, animal_birthdate FROM Pets 
		UNION
	SELECT animal_type, animal_group, animal_name, animal_birthdate FROM wild_animals;

SELECT * FROM Animals 

-- Удалим из таблицы верблюдов 
DELETE FROM Animals 
WHERE animal_group = 'Верблюд';

SELECT * FROM Animals



DROP TABLE IF EXISTS Animals_commands;
CREATE TABLE Animals_commands
(
id INT AUTO_INCREMENT PRIMARY KEY,
animal_id INT,
comand_id INT,
FOREIGN KEY (animal_id) REFERENCES Animals (animal_id),
FOREIGN KEY (comand_id) REFERENCES Comands (comand_id) 
);

DROP TABLE IF EXISTS Pets;
DROP TABLE IF EXISTS Wild_animals;

INSERT INTO Animals_commands (animal_id, comand_id)
VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(2, 1),
(2, 2),
(2, 3),
(2, 8),
(3, 2),
(7, 7),
(7, 8),
(7, 9);




CREATE TABLE young_animals
  SELECT * FROM Animals where YEAR(CURRENT_TIMESTAMP) - YEAR(animal_birthdate) - (RIGHT(CURRENT_TIMESTAMP, 5) < RIGHT(animal_birthdate , 5))>1 and YEAR(CURRENT_TIMESTAMP) - YEAR(animal_birthdate) - (RIGHT(CURRENT_TIMESTAMP, 5) < RIGHT(animal_birthdate , 5))<3;
SELECT * FROM Young_animals;
SELECT *, (TIMESTAMPDIFF(MONTH, animal_birthdate, curdate())) as month_age  FROM young_animals;


#12 Задание не понял что именно требуется
SELECT * FROM Pets JOIN Pack_animals JOIN young_animals;

SELECT * FROM Pets JOIN Comands
	UNION
SELECT * FROM Pack_animals JOIN Comands;