public class Movie {
  private String title;
  private double duration;
  private int rating;

  public Movie(String title, double duration) {
    this.title = title;
    this.duration = duration;
    this.rating = 0;
  }

  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
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
    String info = "\"" + title + "\", duration: " + duration + " hours";
    if (rating != 0) {
      info += ", rating is " + rating;
    }
    return info;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Movie)) return false;
    Movie other = (Movie) o;
    return java.util.Objects.equals(title, other.title)
        && Double.compare(duration, other.duration) == 0;
  }
}
