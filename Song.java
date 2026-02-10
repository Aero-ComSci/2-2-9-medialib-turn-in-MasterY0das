public class Song {
  private String title;
  private int rating;

  public Song(String title) {
    this.title = title;
    this.rating = 0;
  }

  public String getTitle() {
    return title;
  }

  public int getRating() {
    return rating;
  }

  public void adjustRating(int r) {
    if (r >= 0 && r <= 10) {
      rating = r;
    } else {
      rating = 0;
    }
  }

  public String toString() {
    String info = "\"" + title + "\"";
    if (rating != 0) {
      info += ", rating is " + rating;
    }
    return info;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Song)) return false;
    Song other = (Song) o;
    return java.util.Objects.equals(title, other.title);
  }
}
