package example.model;

import java.rmi.server.UID;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

import thewebsemantic.Id;
import thewebsemantic.Namespace;

@Namespace("http://example.org/")
public class Post {
	private Collection<Comment> comments = new LinkedList<Comment>();
	private Collection<Tag> tags = new LinkedList<Tag>();
	private User author;
	private Date createdAt;
	private String title;
	private String content;
	private String id;

	public Post() {
		createdAt = new Date();
	}
	
	public Post(User u) {
		author = u;
		id = new UID().toString();
	}

	@Id
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Collection<Comment> getComments() {
		return comments;
	}
	
	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}
	
	public void addComment(Comment c) {
		comments.add(c);
	}
	
	public User getAuthor() {
		return author;
	}
	
	public void setAuthor(User author) {
		this.author = author;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	
	public Collection<Tag> getTags() {
		return tags;
	}
	
	public void setTags(Collection<Tag> tags) {
		this.tags = tags;
	}
	
	public void addTag(Tag t) {
		tags.add(t);
	}
}