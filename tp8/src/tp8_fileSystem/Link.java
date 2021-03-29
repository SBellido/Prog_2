package tp8_fileSystem;


public class Link extends ElementFileSystem {
	private ElementFileSystem pointTo;
	private final static int size = 1;
	
	public Link(String name, ElementFileSystem pointTo) {
		super(name);
		this.pointTo = pointTo;
	}

	@Override
	public double getSize() {
		return Link.size;
	}	
	
	public ElementFileSystem getPointTo() {
		return this.pointTo;
	}
}
