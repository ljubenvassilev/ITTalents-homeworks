package notes;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

	
	boolean isStarted;
	
	public ElectronicSecuredNotepad(int pageCount, String password) {
		super(pageCount, password);
		isStarted=false;
	}

	@Override
	public void start() {
		isStarted=true;
	}

	@Override
	public void stop() {
		isStarted=false;
	}

	@Override
	public boolean isStarted() {
		if(isStarted){
			return true;
		}
		return false;
	}

	public void addTextToPage(String addition, int pageNumber, String password) {
		if(!isStarted){
			System.out.println("Electronic notepad not turned on!");
			return;
		}
		if(!checkPassword(password)){
			System.out.println("Wrong password!");
			return;
		}
		super.addTextToPage(addition, pageNumber);
	}

	public void replaceTextOnPage(String newText, int pageNumber, String password) {
		if(!isStarted){
			System.out.println("Electronic notepad not turned on!");
			return;
		}
		if(!checkPassword(password)){
			System.out.println("Wrong password!");
			return;
		}
		super.replaceTextOnPage(newText, pageNumber);
	}

	public void deletePage(int pageNumber, String password) {
		if(!isStarted){
			System.out.println("Electronic notepad not turned on!");
			return;
		}
		if(!checkPassword(password)){
			System.out.println("Wrong password!");
			return;
		}
		super.deletePage(pageNumber);
	}

	public void print(String password) {
		if(!isStarted){
			System.out.println("Electronic notepad not turned on!");
			return;
		}
		if(!checkPassword(password)){
			System.out.println("Wrong password!");
			return;
		}
		super.print();
	}
	
	public void printAllPagesWithDigits(String password) {
		if(!isStarted){
			System.out.println("Electronic notepad not turned on!");
			return;
		}
		if(!checkPassword(password)){
			System.out.println("Wrong password!");
			return;
		}
		super.printAllPagesWithDigits();
	}
	
	public boolean searchWord(String word, String password) {
		if(!isStarted){
			System.out.println("Electronic notepad not turned on!");
			return false;
		}
		if(!checkPassword(password)){
			System.out.println("Wrong password!");
			return false;
		}
		return super.searchWord(word);
	}
	
	
}