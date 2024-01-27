
import java.util.ArrayList;

public class Directory implements Component{
	private String name; 
	private ArrayList<Component> children = new ArrayList<>();
	
	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getSize() {
		int totalSize = 0;
		for(Component child:children) {
			totalSize += child.getSize();
		}
		return totalSize;
	}

	@Override
	public int getCount() {
		int totalCount = 0; // directory does not count towards totalCount
		for(Component child:children) {
			totalCount += child.getCount();
		}
		
		return totalCount;
	}

	@Override

	public String display(String prefix) {
		String displayString = this.name + ": (count=" + this.getCount() + ", size=" + this.getSize() + ")";
		
		for (Component child:children) {
			displayString += "\n";
			if (child instanceof Directory) {
				displayString += prefix;
				displayString += child.display(prefix + "\t"); // hard coded 
			} else {
				displayString += child.display(prefix);
			}
		}
		
		return displayString;
	}
	
	public Component search(String searchedName) {	// returns the component if found within the directory or subdirectories
	    for (Component child : children) {
	        if (searchedName.equals(child.getName())) {
	            return child; // Return the file if found within the directory
	        }

	        if (child instanceof Directory) {
	            Component searchResult = child.search(searchedName);
	            		
	            if (searchResult != null) {
	                return child; // Return directory if file found in directory
	            }
	        }
	    }

	    return null; // File not found in this directory or its subdirectories
	}
	
	public void add(Component component) {
		this.children.add(component);
	}
	
	public void remove(Component component) {
		this.children.remove(component);
	}
	
}
