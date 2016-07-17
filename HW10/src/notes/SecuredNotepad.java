package notes;

public class SecuredNotepad extends SimpleNotepad {

	public SecuredNotepad(int pageCount, String password) {
		super(pageCount);
		this.password=password;
	}
	private final String password;
	
	public void addTextToPage(String addition, int pageNumber, String password) {
		if(!checkPassword(password)){
			System.out.println("Wrong password!");
			return;
		}
		super.addTextToPage(addition, pageNumber);
	}

	public void replaceTextOnPage(String newText, int pageNumber, String password) {
		if(!checkPassword(password)){
			System.out.println("Wrong password!");
			return;
		}
		super.replaceTextOnPage(newText, pageNumber);
	}

	public void deletePage(int pageNumber, String password) {
		if(!checkPassword(password)){
			System.out.println("Wrong password!");
			return;
		}
		super.deletePage(pageNumber);
	}

	public void print(String password) {
		if(!checkPassword(password)){
			System.out.println("Wrong password!");
			return;
		}
		super.print();
	}
	
	private boolean checkPassword(String pass){
		return this.password.equals(pass);
	}

}
