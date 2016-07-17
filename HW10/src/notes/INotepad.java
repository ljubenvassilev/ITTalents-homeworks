package notes;

public interface INotepad {

	void addTextToPage(String addition, int pageNumber);
	
	void replaceTextOnPage(String newText, int pageNumber);
	
	void deletePage(int pageNumber);
	
	void print();
	
	boolean searchWord(String word);
	
	void printAllPagesWithDigits();
	
}
