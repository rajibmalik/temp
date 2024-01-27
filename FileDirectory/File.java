public class File implements Component{
	private String name; 
	private int size;
	
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public int getCount() { // each file represents a count of 1
		return 1;
	}

	@Override
	public String display(String prefix) { // displays the prefix, name and size of the file
		return (prefix + this.name + " (" + size + ")");
	}

	@Override
	public Component search(String searchedName) { // returns file if matching searchedName
		if (this.name.equals(searchedName)) {
			return this;
		}
		
		return null;
	}
}
