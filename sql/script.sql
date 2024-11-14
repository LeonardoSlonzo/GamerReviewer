CREATE DATABASE gamer_review;

CREATE TABLE users (
    userID int NOT NULL AUTO_INCREMENT,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    displayName varchar(255) NOT NULL,
    isSuperUser boolean NOT NULL,
    status integer NOT NULL,

    PRIMARY KEY (userID)
); 

CREATE TABLE games (
    gameID int NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    description varchar(255) NOT NULL,
    gameStudio varchar(255) NOT NULL,
    releaseDate DATE NOT NULL,

    PRIMARY KEY (gameID)
); 

CREATE TABLE reviews (
    reviewID int NOT NULL AUTO_INCREMENT,
    userID int,
    gameID int,
    hoursPlayed int,
    grade decimal,
    comment text,
    recommend boolean,
    status varchar(1),
    reviewDate DATE,

    PRIMARY KEY (reviewId),
    FOREIGN KEY (userID) REFERENCES users(userID),
    FOREIGN KEY (gameID) REFERENCES games(gameID)
); 