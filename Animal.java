public class Animal
{
    private double price;
    private int age;

    private String color;

    public Animal( double price,int age,String color) {
        this.price = price;
        this.color=color;
        this.age=age;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
    public String toString() {
        return "Animal{" +
                ", price=" + getPrice() +
                ", age='" + getAge() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
