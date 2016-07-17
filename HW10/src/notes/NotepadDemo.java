package notes;
import java.util.Scanner;
public class NotepadDemo {

	public static void main(String[] args) {

		Page one = new Page();
		one.setCaption("Test Caption");
		one.addText("Test page 1");
		System.out.println(one.view());
		System.out.println("--------------");
		Scanner sc= new Scanner(System.in);
		int pageCount;
		do{
			System.out.println("Input number of pages for the Simple Notepad");
			pageCount=sc.nextInt();
		}
		while(pageCount<1);
		SimpleNotepad notepad1 = new SimpleNotepad(pageCount);
		boolean isDone=false;
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
			System.out.println("5: End working on this notepad");
			choice=sc.nextInt();
			int page;
			switch(choice){
				case 1:
					String add="";
					System.out.println("Type the text you want to add:");
					sc.nextLine();
					add=sc.nextLine();
					System.out.println("To which page do you want to add this text?");
					page=sc.nextInt();
					notepad1.addTextToPage(add, page);
					break;
				case 2:
					String replace="";
					System.out.println("Type the text you want to replace the old text:");
					sc.nextLine();
					replace=sc.nextLine();
					System.out.println("On which page do you want to replace the text?");
					page=sc.nextInt();
					notepad1.replaceTextOnPage(replace, page);
					break;
				case 3:
					System.out.println("On which page do you want to delete the text?");
					page=sc.nextInt();
					notepad1.deletePage(page);
					break;
				case 4:
					notepad1.print();
					break;
				case 5:
					isDone=true;
					break;
				default:
					System.out.println("Incorrect choice! Please try again.");
			}
		}
		
		pageCount=0;
		do{
			System.out.println("Input number of pages for the Secured Notepad");
			pageCount=sc.nextInt();
		}
		while(pageCount<1);
		sc.nextLine();
		System.out.println("Enter password to secure this notepad:");
		String password = sc.nextLine();
		SecuredNotepad notepad2 = new SecuredNotepad(pageCount,password);
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
			System.out.println("5: End working on this notepad");
			choice=sc.nextInt();
			int page;
			switch(choice){
				case 1:
					String add="";
					System.out.println("Type the text you want to add:");
					sc.nextLine();
					add=sc.nextLine();
					System.out.println("To which page do you want to add this text?");
					page=sc.nextInt();
					sc.nextLine();
					System.out.println("Input password:");
					password= sc.nextLine();
					notepad2.addTextToPage(add, page, password);
					break;
				case 2:
					String replace="";
					System.out.println("Type the text you want to replace the old text:");
					sc.nextLine();
					replace=sc.nextLine();
					System.out.println("On which page do you want to replace the text?");
					page=sc.nextInt();
					sc.nextLine();
					System.out.println("Input password:");
					password= sc.nextLine();
					notepad2.replaceTextOnPage(replace, page, password);
					break;
				case 3:
					System.out.println("On which page do you want to delete the text?");
					page=sc.nextInt();
					sc.nextLine();
					System.out.println("Input password:");
					password= sc.nextLine();
					notepad2.deletePage(page, password);
					break;
				case 4:
					sc.nextLine();
					System.out.println("Input password:");
					password= sc.nextLine();
					notepad2.print(password);
					break;
				case 5:
					isDone=true;
					break;
				default:
					System.out.println("Incorrect choice! Please try again.");
			}
		}
		
		
		pageCount=0;
		do{
			System.out.println("Input number of pages for the Electronic Secured Notepad");
			pageCount=sc.nextInt();
		}
		while(pageCount<1);
		sc.nextLine();
		System.out.println("Enter password to secure this notepad:");
		password = sc.nextLine();
		ElectronicSecuredNotepad notepad3 = new ElectronicSecuredNotepad(pageCount,password);
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
			System.out.println("5: Turn device on");
			System.out.println("6: Turn device off");
			System.out.println("7: End working on this notepad");
			choice=sc.nextInt();
			int page;
			switch(choice){
				case 1:
					String add="";
					System.out.println("Type the text you want to add:");
					sc.nextLine();
					add=sc.nextLine();
					System.out.println("To which page do you want to add this text?");
					page=sc.nextInt();
					sc.nextLine();
					System.out.println("Input password:");
					password= sc.nextLine();
					notepad3.addTextToPage(add, page, password);
					break;
				case 2:
					String replace="";
					System.out.println("Type the text you want to replace the old text:");
					sc.nextLine();
					replace=sc.nextLine();
					System.out.println("On which page do you want to replace the text?");
					page=sc.nextInt();
					sc.nextLine();
					System.out.println("Input password:");
					password= sc.nextLine();
					notepad3.replaceTextOnPage(replace, page, password);
					break;
				case 3:
					System.out.println("On which page do you want to delete the text?");
					page=sc.nextInt();
					sc.nextLine();
					System.out.println("Input password:");
					password= sc.nextLine();
					notepad3.deletePage(page, password);
					break;
				case 4:
					sc.nextLine();
					System.out.println("Input password:");
					password= sc.nextLine();
					notepad3.print(password);
					break;
				case 5:
					notepad3.start();
					break;
				case 6:
					notepad3.stop();
					break;
				case 7:
					isDone=true;
					break;
				default:
					System.out.println("Incorrect choice! Please try again.");
			}
		}
	}

}
