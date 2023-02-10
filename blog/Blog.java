package blog;

import java.util.ArrayList;

public class Blog {
	private ArrayList<Post> posts;

	public Blog() {
		posts = new ArrayList<Post>();
	}
	
	public boolean add(Post post) {
		return posts.add(post);
	}
	
	public boolean remove(String post) {
	    if (posts.isEmpty()) {
	        return false;
	    }

	    for (int i = 0; i < posts.size(); i++) {
	        if (posts.get(i).getPost() != null && posts.get(i).getPost().equals(post)) {
	            posts.remove(i);
	            return true;
	        }
	    }

	    return false;
	}

	
	public void showAll() {
	    System.out.println("\nAll posts:");
	    for (int i = 0; i < posts.size(); i++) {
	        if (posts.get(i).getPost() != null) {
	            System.out.println(posts.get(i));
	        }
	    }
	}

	
	public String showPostStatus(int index) {
		if (index < 0 || index >= posts.size()) {
			return "Post not found";
		} else {
			return "\n" + posts.get(index).toString();
		}
	}
}
