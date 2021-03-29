package tp8_newsWebsite;

import java.util.List;

public abstract class Content {
	
	public Content() {
	}
	
	public abstract int countNews();
	
	public abstract Content copy(String keyWord);
	
	public abstract Content copy();
	
//	1. Buscar todas las noticias donde el largo del texto sea superior a 200.	
	public abstract Content generateCopyNewsByCriteria(Criteria criteria);
	
	public abstract List<String> fullPath();

	
//	GETTERS & SETTERS


	
}
