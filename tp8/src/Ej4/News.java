package Ej4;

import Ej4.Criteria.Criteria;

import java.util.ArrayList;

public class News extends ElementNews{
    private ArrayList<String> keywords;
    private String introduction;
    private String text;
    private String author;
    private String link;

    public News(String title, String introduction, String text, String author, String link) {
        super(title);
        this.introduction = introduction;
        this.text = text;
        this.author = author;
        this.link = link;
        this.keywords=new ArrayList<>();
    }

    public void addKeyword(String keyword){
        if(!keywords.contains(keyword)){
            keywords.add(keyword);
        }
    }

    public ArrayList<String> getKeywords() {
        return new ArrayList<>(keywords);
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean containsKeyword(String keyword){
        return this.keywords.contains(keyword);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public ArrayList<ElementNews> getNewsBy(Criteria c1) {
        ArrayList<ElementNews> aux= new ArrayList<>();
        if(c1.isTrue(this)){
            aux.add(this);
        }
        return aux;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public ElementNews getCopy(Criteria c1) {
        News copy= null;
        if(c1.isTrue(this)){
           copy= new News(this.getTitle(),this.getIntroduction(),this.text,this.author,this.link);
            copy.setKeywords(this.getKeywords());
            return copy;
        }
        return copy;
    }

    @Override
    public ArrayList<String> getPath(String path) {
        ArrayList<String> paths = new ArrayList<>();
        paths.add(path+"/"+this.getLink());
        return paths;
    }

    @Override
    public String toString() {
        return "News{" +
                "introduction='" + introduction + '\'' +
                ", text='" + text + '\'' +
                ", author='" + author + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
