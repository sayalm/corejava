package Task18;

import java.util.List;

public interface IArticle {
    void exportArticles(List<Article> articleList, String FILEURL);

    List<Article> importArticles(String FILEURL);
}
