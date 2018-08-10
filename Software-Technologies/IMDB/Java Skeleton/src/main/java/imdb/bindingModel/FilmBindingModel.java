package imdb.bindingModel;

public class FilmBindingModel {

    private String name;
    private String director;
    private String genre;
    private Integer year;

    public FilmBindingModel() {
    }

    public FilmBindingModel(String name, String director, String genre, Integer year) {
        this.name = name;
        this.director = director;
        this.genre = genre;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
