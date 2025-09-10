package com.deloitte.core.library;

public class LibraryBook {
	private String bookTitle;
	private String authorName;
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public void display() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "LibraryBook [bookTitle=" + bookTitle + ", authorName=" + authorName + "]";
	}
	
	
}
