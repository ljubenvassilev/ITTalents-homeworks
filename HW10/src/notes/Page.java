package notes;

class Page {

	private String caption="";
	private String content="";
	
	String getContent() {
		return content;
	}

	void setCaption(String caption) {
		this.caption = caption;
	}

	Page() {}
	
	void addText(String addition){
		content+=addition;
	}
	
	void deleteText(){
		content="";
	}
	
	void view(){
		System.out.println(caption);
		System.out.println(content);
	}
	
	boolean searchWord(String word){
		return content.contains(word);
	}
	
	boolean containsDigits(){
		char[] chars = content.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if(Character.isDigit(chars[i])){
				return true;
			}
		}
		return false;
	}
}
