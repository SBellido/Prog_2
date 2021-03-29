package Ej4.Criteria;

import Ej4.News;

public class AndCriteria implements Criteria{

    private Criteria c1;
    private Criteria c2;

    public AndCriteria(Criteria c1, Criteria c2){
        this.c1=c1;
        this.c2=c2;
    }

    @Override
    public boolean isTrue(News news) {
        return c1.isTrue(news) && c2.isTrue(news);
    }
}
