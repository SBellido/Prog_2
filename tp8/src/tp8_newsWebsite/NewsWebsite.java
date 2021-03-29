package tp8_newsWebsite;

import java.util.List;

public class NewsWebsite {
	private CompositeContent content;
	private String name;
	
	public NewsWebsite(String name) {
		this.name = name;
		this.content = new CompositeContent("Generales");
	}
	
	public void addContent(Content content) {
		this.content.addContent(content);
	}
	
	public List<String> fullPath() {
		return this.content.fullPath();
	}
//	GETTERS & SETTERS
	public CompositeContent getContent() {
		return content;
	}
	public void setContent(CompositeContent content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
