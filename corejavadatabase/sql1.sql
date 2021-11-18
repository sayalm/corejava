INSERT INTO authors VALUES(1,'Willian','Shakespeare','USA','Willian@gmail.com','9816121101');
INSERT INTO authors VALUES(2,'C.S','Lewis','ITALY','LewisCS@gmail.com','9816456201');
INSERT INTO authors VALUES(3,'Emest','Hemingway','NEPAL','EmestBahadur@gmail.com','9816789101');
INSERT INTO authors VALUES(4,'James','Patterson','ENGLAND','Willian@gmail.com','9813611101');
INSERT INTO authors VALUES(5,'Neil','Gainman','JAPAN','JamesPatty@gmail.com','9816121998');
SELECT * from authors;

UPDATE authors SET Authors_Email = 'NeilGainman@gmail.com'
WHERE idAuthors = 5;

UPDATE authors SET Authors_Email = 'Willian@gmail.com'
WHERE idAuthors = 1;

