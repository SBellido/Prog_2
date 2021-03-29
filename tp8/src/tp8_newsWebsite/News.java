package tp8_newsWebsite;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class News extends Content {
	private String title;
	private String introduction;
	private String text;
	private String author;
	private String link;
	private List<String> keyWords;
	
	public News() {}
	public News(String title, String link) {
		this.title = title;
		this.link = link;
		this.keyWords = new ArrayList<>();	
	}
	
	@Override
	public List<String> fullPath() {
		List<String> aux = new ArrayList<>();
		aux.add(this.getLink() + System.lineSeparator());
		return aux;
	}
//	1. Buscar todas las noticias donde el largo del texto sea superior a 200.
//	2. Buscar todas las noticias del autor “Juan Pérez”.
//	3. Buscar todas las noticias que posean la palabra clave “Partido” y la palabra Clave “Goleada”.
//	4. Buscar las noticias que el título sea “Ultimo momento”.	

	@Override
	public Content generateCopyNewsByCriteria(Criteria criteria) {
		if (criteria.meetsCondition(this))  {
			News copyNews = new News(this.getTitle(), this.getLink());
			copyNews.setText(this.getText());
			copyNews.setLink(this.getLink());
			copyNews.setKeyWord(this.getKeyWords());
			return copyNews;
		}			
		return null;
	}
	
	public boolean containsKeyWord(String keyWord) {
		return this.keyWords.contains(keyWord);
	}
	
	public void addKeyWord(String keyWord) {
		if (!containsKeyWord(keyWord))
			this.keyWords.add(keyWord);
	}

	public int countWords() {
		List<String> temp = new ArrayList<>();
		StringTokenizer tokenizer = new StringTokenizer(this.text);
		while (tokenizer.hasMoreElements()) {
			String word = tokenizer.nextToken();
			temp.add(word);
		}
		return temp.size();
	}
	
	@Override
	public int countNews() {
		return 1;
	}
	
	@Override
	public Content copy(String keyWord) {
		if (this.containsKeyWord(keyWord))
			return this.copy();
		else return null;
	}
	
	@Override
	public Content copy() {
		News newsCopy = new News(this.getTitle(), this.getLink());	
		newsCopy.setKeyWord(this.getKeyWords());
		newsCopy.setText(this.getText());
		newsCopy.setAuthor(this.getAuthor());
		newsCopy.setIntroduction(this.getIntroduction());	
		return newsCopy;
	}	
	
	@Override
	public String toString() {
		return "/" + this.getLink();
	}

	@Override
	public boolean equals(Object obj) {
		try {
			News aux = (News) obj;
			return (this.getTitle().equals(aux.getTitle()) &&
					this.getIntroduction().equals(aux.getIntroduction()) && 
					this.getText().equals(aux.getText()) &&
					this.getAuthor().equals(aux.getAuthor()) && 
					this.keyWords.containsAll(aux.keyWords));
		} catch (Exception e) {
			return false;
		}
	}
	
//	GETTERS & SETTERS
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	private void setKeyWord(List<String> keyWords) {
		this.keyWords.clear();
		this.keyWords.addAll(keyWords);
	}	
	private List<String> getKeyWords() {
		return new ArrayList<>(this.keyWords);
	}
	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}


	

}
