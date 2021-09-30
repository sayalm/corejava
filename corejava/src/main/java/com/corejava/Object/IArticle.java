package com.corejava.Object;

import java.util.List;

public interface IArticle {

    void exportArticles(List<Article> articleList, String fileName);

    List<Article> importArticles(String fileName);
}
