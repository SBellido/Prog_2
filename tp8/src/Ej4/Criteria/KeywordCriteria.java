package Ej4.Criteria;

import Ej4.News;

public class KeywordCriteria implements Criteria{

    private String keyword;

    public KeywordCriteria(String keyword){
        this.keyword=keyword;
    }

    @Override
    public boolean isTrue(News news) {
        return news.containsKeyword(keyword);
    }
}
