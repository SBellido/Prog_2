package tp8_fileSystem;

public class File extends ElementFileSystem {
	private String extension;
	private double size;

	public File(String name, String extension, double size) {
		super(name);
		this.extension = extension;
		this.size = size;
	}


	@Override
	public boolean equals(Object obj) {
		try {
			File aux = (File) obj;
			return (super.equals(aux) && this.getExtension().equals(aux.getExtension()));
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return this.getName() + "." + this.getExtension();
	}

//	GETTERS & SETTERS	
	public double getSize() {
		return this.size;
	}

	public void setSize(double size) {
		this.size = size;
		this.setModificationDate();
	}

	public String getExtension() {
		return this.extension;
	}

}
