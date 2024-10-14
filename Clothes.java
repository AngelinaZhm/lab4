import java.util.Scanner;

abstract class Clothes {
    private String size;
    private String color;
    private int price;

    public Clothes(String size, String color, int price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
  public abstract String sizeFit();
    public void inputSize(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ваш розмір - ");
        size = scanner.nextLine();
    }

}
