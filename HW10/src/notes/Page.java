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
	
	String view(){
		return caption+"\n"+content;
	}
	
	boolean searchWord(String word){
		return content.contains(word);
	}
	
	boolean containsDigits(){
		return content.contains("\\d");
	}
}
