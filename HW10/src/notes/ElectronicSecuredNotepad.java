package notes;

import java.awt.Checkbox;

import javax.xml.stream.events.StartDocument;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

	
	boolean isStarted;
	
	public ElectronicSecuredNotepad(int pageCount, String password) throws WeakPasswordException {
		super(pageCount, password);
		isStarted=false;
	}

	@Override
	public void start() {
		isStarted=true;
	}
	
	public void start (String password){
		if(!checkPassword(password)){
			System.out.println("Wrong password!");
			return;
		}
		System.out.println("Device is turned ON");
		isStarted=true;
	}

	@Override
	public void stop() {
		isStarted=false;
	}
	
	public void stop(String password){
		if(!checkPassword(password)){
			System.out.println("Wrong password!");
			return;
		}
		System.out.println("Device is turned OFF");
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
		super.addTextToPage(addition, pageNumber, password);
	}

	public void replaceTextOnPage(String newText, int pageNumber, String password) {
		if(!isStarted){
			System.out.println("Electronic notepad not turned on!");
			return;
		}
		super.replaceTextOnPage(newText, pageNumber, password);
	}

	public void deletePage(int pageNumber, String password) {
		if(!isStarted){
			System.out.println("Electronic notepad not turned on!");
			return;
		}
		super.deletePage(pageNumber, password);
	}

	public void print(String password) {
		if(!isStarted){
			System.out.println("Electronic notepad not turned on!");
			return;
		}
		super.print(password);
	}
	
	public void printAllPagesWithDigits(String password) {
		if(!isStarted){
			System.out.println("Electronic notepad not turned on!");
			return;
		}
		super.printAllPagesWithDigits(password);
	}
	
	public boolean searchWord(String word, String password) {
		if(!isStarted){
			System.out.println("Electronic notepad not turned on!");
			return false;
		}
		return super.searchWord(word, password);
	}
	
}
