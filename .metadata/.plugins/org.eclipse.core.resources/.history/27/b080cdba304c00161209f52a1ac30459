package notes;

public class SimpleNotepad implements INotepad{

	Page[] pages;
	
	public SimpleNotepad(int pageCount) {
		pages = new Page[pageCount];
		for (int i = 0; i < pages.length; i++) {
			pages[i] = new Page();
			pages[i].setCaption("Page" +String.valueOf(i+1));
		}
	}
	
	@Override
	public void addTextToPage(String addition, int pageNumber) {
		if(!verifyPageNumber(pageNumber)){
			System.out.println("Wrong page number!");
			return;
		}
		pages[pageNumber-1].addText(addition);
	}

	@Override
	public void replaceTextOnPage(String newText, int pageNumber) {
		if(!verifyPageNumber(pageNumber)){
			System.out.println("Wrong page number!");
			return;
		}
		pages[pageNumber-1].deleteText();
		pages[pageNumber-1].addText(newText);
	}

	@Override
	public void deletePage(int pageNumber) {
		if(!verifyPageNumber(pageNumber)){
			System.out.println("Wrong page number!");
			return;
		}
		pages[pageNumber-1].deleteText();
	}

	@Override
	public void print() {
		for (int i = 0; i < pages.length; i++) {
			System.out.println(pages[i].view());
		}
	}
	
	private boolean verifyPageNumber (int number){
		if (number<=pages.length){
			return true;
		}
		return false;
	}

}
