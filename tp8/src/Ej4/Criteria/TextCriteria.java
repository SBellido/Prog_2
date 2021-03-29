package Ej4.Criteria;

import Ej4.News;

public class TextCriteria implements Criteria{


    private int quantityOfChars;

    public TextCriteria(int quantityOfChars) {
        this.quantityOfChars=quantityOfChars;
    }

    @Override
    public boolean isTrue(News news) {
        return news.getText().length()>quantityOfChars;
    }
}
