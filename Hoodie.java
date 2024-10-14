public class Hoodie extends Clothes {
    public Hoodie(String size, String color, int price) {
        super(size, color, price);
    }
    public String sizeFit(){
        if (getSize().equalsIgnoreCase("small")){
            return "Цей розмір вам не підходить";
        } else if (getSize().equalsIgnoreCase("large")) {
            return "Цей розмір вам не підходить";
        } else {
            return "Цей розмір вам підходить!";
        }
    }
}
