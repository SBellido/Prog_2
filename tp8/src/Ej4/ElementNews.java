package Ej4;

import Ej4.Criteria.Criteria;

import java.util.ArrayList;

public abstract class ElementNews {

    private String title;

    public ElementNews(String title){
        this.title=title;
    }

    public abstract ArrayList<ElementNews> getNewsBy(Criteria c1);

    public abstract ElementNews getCopy(Criteria c1);

    public abstract ArrayList<String> getPath(String path);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
