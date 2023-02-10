package blog;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String option = "";	
		Post post = new Post();  
		Blog blog = new Blog();
		blog.add(post);  

		Scanner reader = new Scanner(System.in);
		do {
			// Mostrar menú
			menu();
			System.out.print(">> ");
			option = reader.nextLine();
			stateMachine(option, blog);
			
		} while (!option.equals("5"));	
	}
	
	private static void menu() {
		System.out.println("[o===o]----Welcome to Post Manager----[o===o]");
		System.out.println("Select an option:");
		System.out.println("1. Add a new post");
		System.out.println("2. Delete a post");
		System.out.println("3. Show posts status");
		System.out.println("4. Show all posts");
		System.out.println("5. Exit");
	}
	
	private static void stateMachine(String option, Blog blog) {
		Scanner reader = new Scanner(System.in);
		String post = "";
		int number = 0;
		
		switch (option) {
		case "1":
			// Add a new post
			System.out.print("Please, enter a post: ");
			post = reader.nextLine(); 
			if(blog.add(new Post(post))) {
				System.out.println("Post " + post + " added");
			} else {
				System.out.println("Post can not be added");
			}
			break;	
		case "2":
			// Delete a post
			System.out.print("Please, enter post to remove");
			post = reader.nextLine();
			
			if(blog.remove(post)) {
				System.out.println("Post " + post + " removed");
			} else {
				System.out.println("Post can not be removed");
			}						
			break;				
		case "3":
			// Show post status
			System.out.println("Please, enter post identifier");
			String tmp = reader.nextLine();
			number = Integer.parseInt(tmp);
			
			System.out.println(blog.showPostStatus(number));
			break;
		case "4":
			// Show all posts
			blog.showAll();
			break;
		default:
			break;
		}
	}
}
