package notes;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class NotepadDemo {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		boolean exit=false;
		while(true){
			if(exit){
				break;
			}
			int pageCount;
			int deviceChoice = 0;
			do{
				System.out.println("What type of notepad do you want to create?");
				System.out.println("1: Simple");
				System.out.println("2: Secured");
				System.out.println("3: Electronic");
				System.out.println("4: Exit");
				deviceChoice=getInteger();
			}
			while(deviceChoice<1);
			switch(deviceChoice){
				case 1:
					do{
						System.out.println("Input number of pages for the Simple Notepad");
						pageCount=getInteger();
					}
					while(pageCount<1);
					SimpleNotepad notepad1 = new SimpleNotepad(pageCount);
					boolean isDone=false;
					while(true){
						if(isDone){
							break;
						}
						int actionChoice;
						System.out.println("What do you want to do?");
						System.out.println("1: Add text to a page");
						System.out.println("2: Replace the text on a page");
						System.out.println("3: Delete the text on a page");
						System.out.println("4: Print the contents of the notepad");
						System.out.println("5: Search for a word");
						System.out.println("6: Print all pages that have numbers");
						System.out.println("7: End working on this notepad");
						actionChoice=getInteger();
						int page;
						switch(actionChoice){
							case 1:
								String add="";
								System.out.println("Type the text you want to add:");
								add=sc.nextLine();
								System.out.println("To which page do you want to add this text?");
								page=getInteger();
								notepad1.addTextToPage(add, page);
								break;
							case 2:
								String replace="";
								System.out.println("Type the text you want to replace the old text:");
								replace=sc.nextLine();
								System.out.println("On which page do you want to replace the text?");
								page=getInteger();
								notepad1.replaceTextOnPage(replace, page);
								break;
							case 3:
								System.out.println("On which page do you want to delete the text?");
								page=getInteger();
								notepad1.deletePage(page);
								break;
							case 4:
								notepad1.print();
								break;
							case 5:
								String word = "";
								System.out.println("Type the word that you want to find");
								word=sc.next();
								sc.nextLine();
								if(notepad1.searchWord(word)){
									System.out.println("The word exists in the notepad");
								}
								else{
									System.out.println("The word is not found in the notepad");
								}
								break;
							case 6:
								notepad1.printAllPagesWithDigits();
								break;
							case 7:
								isDone=true;
								break;
							default:
								System.out.println("Incorrect choice! Please try again.");
						}
					}
					break;
				case 2:
					do{
						System.out.println("Input number of pages for the Secured Notepad");
						pageCount=getInteger();
					}
					while(pageCount<1);
					System.out.println("Enter password to secure this notepad:");
					String password = sc.nextLine();
					SecuredNotepad notepad2;
					try{
						notepad2 = new SecuredNotepad(pageCount,password);
					}
					catch(WeakPasswordException e){
						System.out.println("Password too weak! Try again please.");
						continue;
					}
					isDone=false;
					while(true){
						if(isDone){
							break;
						}
						int choice;
						System.out.println("What do you want to do?");
						System.out.println("1: Add text to a page");
						System.out.println("2: Replace the text on a page");
						System.out.println("3: Delete the text on a page");
						System.out.println("4: Print the contents of the notepad");
						System.out.println("5: Search for a word");
						System.out.println("6: Print all pages that have numbers");
						System.out.println("7: End working on this notepad");
						choice=getInteger();
						System.out.println("Input password:");
						password= sc.nextLine();
						int page;
						switch(choice){
							case 1:
								String add="";
								System.out.println("Type the text you want to add:");
								add=sc.nextLine();
								System.out.println("To which page do you want to add this text?");
								page=getInteger();
								notepad2.addTextToPage(add, page, password);
								break;
							case 2:
								String replace="";
								System.out.println("Type the text you want to replace the old text:");
								replace=sc.nextLine();
								System.out.println("On which page do you want to replace the text?");
								page=getInteger();
								notepad2.replaceTextOnPage(replace, page, password);
								break;
							case 3:
								System.out.println("On which page do you want to delete the text?");
								page=getInteger();
								notepad2.deletePage(page, password);
								break;
							case 4:
								notepad2.print(password);
								break;
							case 5:
								String word = "";
								System.out.println("Type the word that you want to find");
								word=sc.next();
								sc.nextLine();
								if(notepad2.checkPassword(password)){
									if (notepad2.searchWord(word, password)) {
										System.out.println("The word exists in the notepad");
									}
									else{
										System.out.println("The word is not found in the notepad");
									}
								}
								else{
									System.out.println("Wrong password!");
								}
								break;
							case 6:
								notepad2.printAllPagesWithDigits(password);
								break;
							case 7:
								isDone=true;
								break;
							default:
								System.out.println("Incorrect choice! Please try again.");
						}
					}
					break;
				case 3:
					
					pageCount=0;
					do{
						System.out.println("Input number of pages for the Electronic Secured Notepad");
						pageCount=getInteger();
					}
					while(pageCount<1);
					System.out.println("Enter password to secure this notepad:");
					password = sc.nextLine();
					ElectronicSecuredNotepad notepad3; 
					try{
						notepad3 = new ElectronicSecuredNotepad(pageCount,password);
					}
					catch(WeakPasswordException e){
						System.out.println("Password too weak! Try again please.");
						break;
					}
					isDone=false;
					while(true){
						if(isDone){
							break;
						}
						int choice;
						System.out.println("What do you want to do?");
						System.out.println("1: Add text to a page");
						System.out.println("2: Replace the text on a page");
						System.out.println("3: Delete the text on a page");
						System.out.println("4: Print the contents of the notepad");
						System.out.println("5: Search for a word");
						System.out.println("6: Print all pages that have numbers");
						System.out.println("7: Turn device on");
						System.out.println("8: Turn device off");
						System.out.println("9: End working on this notepad");
						choice=getInteger();
						System.out.println("Input password:");
						password= sc.nextLine();
						int page;
						switch(choice){
							case 1:
								String add="";
								System.out.println("Type the text you want to add:");
								add=sc.nextLine();
								System.out.println("To which page do you want to add this text?");
								page=getInteger();
								notepad3.addTextToPage(add, page, password);
								break;
							case 2:
								String replace="";
								System.out.println("Type the text you want to replace the old text:");
								replace=sc.nextLine();
								System.out.println("On which page do you want to replace the text?");
								page=getInteger();
								notepad3.replaceTextOnPage(replace, page, password);
								break;
							case 3:
								System.out.println("On which page do you want to delete the text?");
								page=getInteger();
								notepad3.deletePage(page, password);
								break;
							case 4:
								notepad3.print(password);
								break;
							case 5:
								String word = "";
								System.out.println("Type the word that you want to find");
								word=sc.next();
								sc.nextLine();
								if(notepad3.checkPassword(password)){
									if (notepad3.searchWord(word, password)) {
										System.out.println("The word exists in the notepad");
									}
									else{
										System.out.println("The word is not found in the notepad");
									}
								}
								else{
									System.out.println("Wrong password!");
								}
								break;
							case 6:
								notepad3.printAllPagesWithDigits(password);
								break;
							case 7:
								notepad3.start();
								break;
							case 8:
								notepad3.stop();
								break;
							case 9:
								isDone=true;
								break;
							default:
								System.out.println("Incorrect choice! Please try again.");
							}
						}
					break;
				case 4:
					System.out.println("Thank you for using Notepad!");
					System.out.println("Have a nice day!");
					exit=true;
					sc.close();
			}
		}
	}
	
	private static int getInteger(){
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int result=0;
		do
		{
		    try
		    {
		        result = sc.nextInt();
		        flag=true;
		    }
		    catch (InputMismatchException e)
		    {
		        System.out.println("Integers only, please.");
		    }
		    sc.nextLine();
		}
		while ( !flag );
		return result;
	}
}
