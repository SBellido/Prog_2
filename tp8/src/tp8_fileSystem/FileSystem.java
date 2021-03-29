package tp8_fileSystem;

public class FileSystem {
	private Folder root;
	
	public FileSystem() {
		this.root = new Folder("/");
		this.root.setFather(null);
	}
	
	public void addElement(ElementFileSystem element) {
		this.root.addElement(element);
	}

	
}
