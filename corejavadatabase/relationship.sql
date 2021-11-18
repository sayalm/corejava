ALTER TABLE authors 
ADD CONSTRAINT fk_articles
      FOREIGN KEY(article_id) 
	  REFERENCES articles(article_id);