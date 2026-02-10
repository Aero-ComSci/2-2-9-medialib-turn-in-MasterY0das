public class MediaLib
{
  private String owner;
  private Book book;
  private Movie movie;
  private Song song;
  private String lastModified;

  private static int numBooks = 0;
  private static int numMovies = 0;
  private static int numSongs = 0;

  public MediaLib()
  {
    owner = "Unknown";
    lastModified = Date.getCurrentDateTime();
  }

  public MediaLib(String o)
  {
    owner = o;
    lastModified = Date.getCurrentDateTime();
  }

  public void setOwner(String o)
  {
    owner = o;
  }

  public static String getOwner()
  {
    return "Library Owner";
  }

  public String getOwnerInstance()
  {
    return owner;
  }

  public void addBook(Book b)
  {
    if (book == null) {
      book = b;
      numBooks++;
      lastModified = Date.getCurrentDateTime();
    } else {
      System.out.println("Cannot add another book. Library already contains a book. Use changeBook() to replace it.");
    }
  }

  public void addMovie(Movie m)
  {
    if (movie == null) {
      movie = m;
      numMovies++;
      lastModified = Date.getCurrentDateTime();
    } else {
      System.out.println("Cannot add another movie. Library already contains a movie. Use changeMovie() to replace it.");
    }
  }

  public void addSong(Song s)
  {
    if (song == null) {
      song = s;
      numSongs++;
      lastModified = Date.getCurrentDateTime();
    } else {
      System.out.println("Cannot add another song. Library already contains a song. Use changeSong() to replace it.");
    }
  }

  public void changeBook(Book b)
  {
    book = b;
  }

  public void changeMovie(Movie m)
  {
    movie = m;
  }

  public void changeSong(Song s)
  {
    song = s;
  }

  public Book getBook()
  {
    return book;
  }

  public static int getNumBooks()
  {
    return numBooks;
  }

  public static int getNumMovies()
  {
    return numMovies;
  }

  public static int getNumSongs()
  {
    return numSongs;
  }

  public static int getNumEntries()
  {
    return numBooks + numMovies + numSongs;
  }

  public String toString()
  {
    String info = "";
    if (book != null) {
      info = "/" + book.getTitle() + "/ by " + book.getAuthor();
    }
    if (movie != null) {
      if (info.length() > 0) {
        info += " | ";
      }
      info += "/" + movie.getTitle() + "/ duration: " + movie.getDuration() + " hours";
    }
    if (song != null) {
      if (info.length() > 0) {
        info += " | ";
      }
      info += "/" + song.getTitle() + "/";
    }
    info += "\nLast Modified: " + lastModified;
    return info;
  }
}
