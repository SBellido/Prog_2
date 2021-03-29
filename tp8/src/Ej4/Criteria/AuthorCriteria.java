package Ej4.Criteria;

import Ej4.News;

public class AuthorCriteria implements Criteria{

   String name;

   public AuthorCriteria(String name){
       this.name=name;
   }

    @Override
    public boolean isTrue(News news) {
        return news.getAuthor().equals(name);
    }
}
