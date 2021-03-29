package tp8_fileSystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ZipFile extends Folder {
	private double compresionFactor;
	
	public ZipFile(String name, double compresionFactor) {
		super(name);
		this.compresionFactor = compresionFactor;
	}
	
	@Override
	public double getSize() {
		return (super.getSize() / this.compresionFactor); 		
	}

	@Override
	public List<ElementFileSystem> search(Comparator<ElementFileSystem> comparator, Criteria criteria){ 
		List<ElementFileSystem> found = new ArrayList<>();
		if (super.search(comparator, criteria).size() > 0) {
			found.add(this);
		}
		return found;
	}

	public double getCompresionFactor() {
		return this.compresionFactor;
	} 
	
	
}
