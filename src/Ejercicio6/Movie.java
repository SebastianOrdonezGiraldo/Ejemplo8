package Ejercicio6;

public class Movie {
    private String title;
    private String mainCharacter;
    private String directBy;
    private float price;

    public Movie(String title, String mainCharacter, String directBy, float price) {
        this.title = title;
        this.mainCharacter = mainCharacter;
        this.directBy = directBy;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Movie:" +
                "title:" + title + '\'' +
                "mainCharacter" + mainCharacter + '\'' +
                "directBy" + directBy + '\'' +
                "price" + price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(String mainCharacter) {
        this.mainCharacter = mainCharacter;
    }

    public String getDirectBy() {
        return directBy;
    }

    public void setDirectBy(String directBy) {
        this.directBy = directBy;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
