public class Movie {
    private String titles;
    private int likes;

    private Genre genre;

    public Movie(String titles, int likes, Genre genre) {
        this.titles = titles;
        this.likes = likes;
        this.genre = genre;
    }

    public String getTitle() {
        return titles;
    }
    public Genre getGenre() {
        return genre;
    }
    public int getLikes() {
        return likes;
    }
}
