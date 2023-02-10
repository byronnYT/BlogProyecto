package blog;

public class Post {
	
	public String toString() {
	    return "Post: " + post;
	}

	private String post;

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}
	
	public Post(String post) {
		this.post = post;
	}

	public Post() {
		
	}
}
