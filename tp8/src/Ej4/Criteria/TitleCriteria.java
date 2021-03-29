package Ej4.Criteria;

import Ej4.News;

public class TitleCriteria implements Criteria{

    private String title;

    public TitleCriteria(String title){
        this.title=title;
    }

    @Override
    public boolean isTrue(News news) {
        return news.getTitle().equals(title);
    }
}
