public class Movie {
    private String titles;
    private int likes;

    public String getTitle() {
        return titles;
    }
    public Movie(String titles, int likes) {
        this.titles = titles;
        this.likes = likes;
    }
    public int getLikes() {
        return likes;
    }
}
