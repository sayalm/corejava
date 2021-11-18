SELECT articles.article_id, articles.article_title,article_publishedDate,authors.author_id,
authors.firstname,authors.lastname,authors.address,authors.contactnumber,authors.email
FROM articles INNER JOIN authors ON articles.article_id = authors.article_id;


SELECT * FROM articles;

SELECT * FROM authors WHERE article_id = 1;

truncate articles,authors;