public class Driver {
	public static void main(String [] args) {
		Directory root = new Directory ("root");
		File settings = new File("Settings", 10);
		root.add(settings);
		
		Directory music = new Directory("music");
		File ringtone = new File("ringtone",120);
		
		music.add(ringtone);
		
		root.add(music);
		
		Directory pictures = new Directory("pictures");
		Directory personal = new Directory ("personal");
		
		pictures.add(personal);
		File familyHoliday = new File("family-holiday", 201);
		File portrait = new File("portrait", 134); 
		
		personal.add(familyHoliday);
		personal.add(portrait);
		
		root.add(pictures);
		
		Directory misc = new Directory("misc");
		File wallpaper = new File("wallpaper", 421);
		misc.add(wallpaper);
		
		
		pictures.add(misc);
		
		Directory newDirectory = new Directory("newDirectory");
		File newFile = new File ("newFile", 10);
		newDirectory.add(newFile);
		misc.add(newDirectory);
		
		
		
		System.out.println(root.display("\t"));
		


	}

}