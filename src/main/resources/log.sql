CREATE DATABASE workshop2
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

CREATE TABLE users
(
    id INT(11) AUTO_INCREMENT,
    email VARCHAR(255) UNIQUE NOT NULL,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(60) NOT NULL,
    PRIMARY KEY (id)
);

DESCRIBE users;

# DROP TABLE users;

INSERT INTO users (email, username, password) VALUES (?, ?, ?);
UPDATE users SET email = ? WHERE username = ?;
DELETE FROM users WHERE username = ?;