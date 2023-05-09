USE my_db;

CREATE TABLE users (
  username varchar(15),
  password varchar(100),
  enabled tinyint(1),
  PRIMARY KEY (username)
) ;

CREATE TABLE authorities (
  username varchar(15),
  authority varchar(25),
  FOREIGN KEY (username) references users(username)
) ;

INSERT INTO my_db.users (username, password, enabled)
VALUES
	('zaur', '{noop}zaur', 1),
	('elena', '{noop}elena', 1),
	('ivan', '{noop}ivan', 1);
    
INSERT INTO my_db.authorities (username, authority)
VALUES
	('zaur', 'ROLE_EMPLOYEE'),
	('elena', 'ROLE_HR'),
    ('ivan', 'ROLE_HR'),
	('ivan', 'ROLE_MANAGER');


/*Для шифрования использовался сайт https://www.browserling.com/tools/bcrypt */
update my_db.users set password = '{bcrypt}$2a$10$sslzQk569FvzJKzz9JO1rOM5qlLU6x56XEzA1HeytWwOz7qTCuKDy'
where username = 'zaur';
update my_db.users set password = '{bcrypt}$2a$10$WKQwi1IyL.cdLO4QUmncCe/2UeMGi3DqnHQ6Qlkl4pApe2KL9HmKq'
where username = 'elena';
update my_db.users set password = '{bcrypt}$2a$10$N28RhIc0szQpceRtiF4vUuaSBuQEV8qe1MTzdP9W05XmidujIEzH2'
where username = 'ivan';
    