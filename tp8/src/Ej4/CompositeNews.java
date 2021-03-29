package Ej4;

import Ej4.Criteria.Criteria;

import java.util.ArrayList;

public  class CompositeNews extends ElementNews {
    private String description;
    private String image;
    private ArrayList<ElementNews> elements;


    public CompositeNews(String title, String description, String image) {
        super(title);
        this.elements= new ArrayList<>();
        this.description = description;
        this.image = image;
    }

    public void addElement(ElementNews elem){
        elements.add(elem);
    }

    public void addAllElements(ArrayList<ElementNews> elems){
        this.elements.addAll(elems);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getElementsSize(){
        return elements.size();
    }

    @Override
    public ArrayList<ElementNews> getNewsBy(Criteria c1) {
        ArrayList<ElementNews> aux = new ArrayList<>();
        for(ElementNews elem: elements){
            aux.addAll(elem.getNewsBy(c1));
        }
        return aux;
    }

    @Override
    public ElementNews getCopy(Criteria c1) {
        CompositeNews compositeNews= new CompositeNews(this.getTitle(),this.getDescription(),this.getImage());
        for(ElementNews elem: elements){
            ElementNews copy= elem.getCopy(c1);
            if(copy != null){
                compositeNews.addElement(copy);
            }
        }
        if(compositeNews.getElementsSize()>0){
            return compositeNews;
        }else{
            return null;
        }



    }

    @Override
    public ArrayList<String> getPath(String path) {
        ArrayList<String> paths= new ArrayList<>();
        String myPath;
        if(path.equals("")){
             myPath= this.getTitle();
        }else {
             myPath = path + "/" + this.getTitle();
        }
        paths.add(myPath);
        for(ElementNews elem: elements){
            paths.addAll(elem.getPath(myPath));
        }
        return paths;
    }

    @Override
    public String toString() {
        return "CompositeNews{" +
                "description='" + description + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
