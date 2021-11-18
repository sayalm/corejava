CREATE TABLE authors(
author_id INT NOT NULL,
firstName VARCHAR(200)NOT NULL,
lastName VARCHAR(200)NOT NULL,
address VARCHAR(50) NOT NULL,
contactNumber VARCHAR(10) NOT NULL,
email VARCHAR(100) NOT NULL,
articleId int NOT NULL,
PRIMARY KEY (author_id)
);