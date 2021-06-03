USE adlister_db;

DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    UNIQUE username VARCHAR(100) NOT NULL,
    UNIQUE email VARCHAR(100) NOT NULL,
    password VARCHAR(100),
    PRIMARY KEY (id)
    );


INSERT INTO users (id, username, email, password)
    VALUE(19, 'Floyd Pink','TheWolfOfTheWall@gmail.com', 'pinkfloyd'),
        (20, 'Young Neil', 'HeartOfGold@gmail.com', 'neilyoung');

DROP TABLE IF EXISTS ads;

CREATE TABLE IF NOT EXISTS ads (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id VARCHAR(100),
    title VARCHAR(100) NOT NULL,
    description VARCHAR(1000),
    PRIMARY KEY (id)
    );

INSERT INTO ads (id, user_id, title, description)
    VALUE(19, 1979, 'Just another brink', 'great for building social dissidence');