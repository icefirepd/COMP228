package FangDou_COMP228Lab1;

import java.time.LocalDate;

public class Singers {
    //5 instance variables that would store the following singer data
    private int singerId;
    private String singerName;
    private String singerAddress;
    private LocalDate dateOfBirth;
    private int numberOfAlbums;

    //Several constructors that would allow you to construct Singer object with 0-5 arguments
    public Singers() {
        this.singerId = 0;
        this.singerName = "";
        this.singerAddress = "";
        this.dateOfBirth = null;
        this.numberOfAlbums = 0;
    }
    public Singers(int singerId){
        this.singerId = singerId;
        this.singerName = "";
        this.singerAddress = "";
        this.dateOfBirth = null;
        this.numberOfAlbums = 0;
    }
    public Singers(int singerId, String singerName){
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = "";
        this.dateOfBirth = null;
        this.numberOfAlbums = 0;
    }
    public Singers(int singerId, String singerName, String singerAddress){
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = null;
        this.numberOfAlbums = 0;
    }
    public Singers(int singerId, String singerName, String singerAddress, LocalDate dateOfBirth){
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbums = 0;
    }
    public Singers(int singerId, String singerName, String singerAddress, LocalDate dateOfBirth, int numberOfAlbums) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbums = numberOfAlbums;
    }

    //Create Setters for all the instance variables of class Singer
    public void setSingerId(int singerId){
        this.singerId = singerId;
    }
    public void setSingerName(String singerName){
        this.singerName = singerName;
    }
    public void setSingerAddress(String singerAddress){
        this.singerAddress = singerAddress;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setNumberOfAlbums(int numberOfAlbums){
        this.numberOfAlbums = numberOfAlbums;
    }

    //Create getters for all the instance variables of class Singer
    public int getSingerId(){
        return singerId;
    }
    public String getSingerName(){
        return singerName;
    }
    public String getSingerAddress(){
        return singerAddress;
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public int getNumberOfAlbums(){
        return numberOfAlbums;
    }
}
