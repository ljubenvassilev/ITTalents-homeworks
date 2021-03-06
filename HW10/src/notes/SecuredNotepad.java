package notes;

public class SecuredNotepad extends SimpleNotepad {

	public SecuredNotepad(int pageCount, String password) throws WeakPasswordException {
		super(pageCount);
		if(isPasswordStrong(password)){
			this.password=password;
		}
		else{
			throw new WeakPasswordException();
		}
	}
	protected final String password;
	
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
	
	public void printAllPagesWithDigits(String password) {
		if(!checkPassword(password)){
			System.out.println("Wrong password!");
			return;
		}
		super.printAllPagesWithDigits();
	}
	
	public boolean searchWord(String word, String password) {
		if(!checkPassword(password)){
			System.out.println("Wrong password!");
			return false;
		}
		return super.searchWord(word);
	}
	
	boolean checkPassword(String pass){
		return this.password.equals(pass);
	}
	
	private boolean isPasswordStrong(String pass){
		if(pass.length()>=5&&pass.matches(".*[A-Z].*")&&pass.matches(".*[a-z].*")&&pass.matches(".*\\d.*")){
			return true;
		}
		return false;
	}

}
