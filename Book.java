public class Book
{
  private String title;
  private String author;
  private int rating;

  public Book(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getRating() {
    return rating;
  }

  public String toString()
  {
    String info = "\"" + title + "\", written by " + author;
    if (rating != 0) {
      info += ", rating is " + rating;
    }
    return info;
  }

  public void setTitle(String t) {
    title = t;
  }

  public void setAuthor(String a) {
    author = a;
  }

  public void adjustRating(int r) {
    rating = r;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Book)) return false;
    Book other = (Book) o;
    return java.util.Objects.equals(title, other.title) && java.util.Objects.equals(author, other.author);
  }
}
