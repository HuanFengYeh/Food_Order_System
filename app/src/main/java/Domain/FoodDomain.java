package Domain;

public class FoodDomain {
    private String title;
    private String pic;
    private String description;
    private Double fee;
    private int numberInCart;

    public FoodDomain(String title, String pic, String description, Double fee, int numberInCart) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
        this.numberInCart = numberInCart;
    }

    public FoodDomain(String title, String pic, String description, Double fee) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
    }

    public String getTitle() {
        return title;
    }

    public String getPic() {
        return pic;
    }

    public String getDescription() {
        return description;
    }

    public Double getFee() {
        return fee;
    }

    public int getNumberInCart() {
        return numberInCart;
    }
}
