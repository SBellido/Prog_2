package tp8_newsWebsite;

import java.util.ArrayList;
import java.util.List;

public class CompositeContent extends Content {
	private String name;
	private String image;
	private String description;
	private List<Content> contents;
	
	public CompositeContent() {}
	public CompositeContent(String name) {
		this.name = name;
		this.contents = new ArrayList<>();
	}
	

	@Override
	public List<String> fullPath() {
		List<String> retorno = new ArrayList<>();
		retorno.add(this.getName());
		for(Content content: this.contents){
			List<String> aux = new ArrayList<>();
			aux.addAll(content.fullPath());
			
			for(String string: aux)
				retorno.add(this.getName() + "/" + string);
		}
		return retorno;
	}
//	1. Buscar todas las noticias donde el largo del texto sea superior a 200.
//	2. Buscar todas las noticias del autor “Juan Pérez”.
//	3. Buscar todas las noticias que posean la palabra clave “Partido” y la palabra Clave “Goleada”.
//	4. Buscar las noticias que el título sea “Ultimo momento”.
	
	public Content generateCopyNewsByCriteria(Criteria criteria) {
		CompositeContent copyComposite = new CompositeContent(this.getName());
		copyComposite.setImage(this.getImage());
		copyComposite.setDescription(this.getDescription());
		
		for (Content content : this.contents) {
			Content contentCopy = content.generateCopyNewsByCriteria(criteria);
			if (contentCopy != null) { // si su contenido es null es una hoja
				copyComposite.addContent(contentCopy);
			}
		}
		return copyComposite;
	}

	public void addContent(Content content) {
		if (!this.containsContent(content))
			this.contents.add(content);
	}
	
	public boolean containsContent(Content content) {
		return this.contents.contains(content);
	}
	
	@Override
	public int countNews() {
		int totalNews = 0;
		for (Content contentOfNews : this.contents) {
			totalNews += contentOfNews.countNews();
		}
		return totalNews;
	}
	
	@Override
	public Content copy(String keyWord) {
		Content copiaChild = new CompositeContent(this.getName());
		for (Content content : this.contents)  {
			copiaChild = content.copy(keyWord);
			if (copiaChild != null) {
				return copiaChild;				
			}		
		}
		return null;
	}
	
	@Override
	public Content copy() {
		CompositeContent copy = new CompositeContent(this.getName());
		copy.setImage(this.getImage());		
		for (Content content : this.contents)
			copy.addContent(content.copy());		
		return copy;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			CompositeContent aux = (CompositeContent) obj;
			return this.contents.containsAll(aux.contents);
		} catch (Exception e) {
			return false;
		}
	}

	
	@Override
	public String toString() {
		return this.getName();
	}


//	GETTERS & SETTERS
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
