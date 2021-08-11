package sg.edu.rp.c346.id20013676.myndpsongs;

import java.io.Serializable;

public class Song implements Serializable {

    private int _id, year, stars;
    private int count = 0;
    private String title, singers;

    public Song(String title, String singers, int year, int stars) {
        this.year = year;
        this.stars = stars;
        this.title = title;
        this.singers = singers;
        this._id = count++;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSingers() {
        return singers;
    }

    public void setSingers(String singers) {
        this.singers = singers;
    }

    @Override
    public String toString() {
        return title + "\n" + singers + " - " + year + "\n" + toStars();
    }

    public String toStars() {
        String filled =  new String(new char[stars]).replace("\0", "★");
        String empty = new String(new char[5-stars]).replace("\0", "☆");
        return filled + empty;

//        return stars + "★";
    }
}

