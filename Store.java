import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store
{
    List<Animal> animals=new ArrayList<>();
    private double checkout;
    public Store(){
    }

    public double getCheckout() {
        return checkout;
    }

    public void setCheckout(double checkout) {
        this.checkout = checkout;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addDog()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a price:");
        double price=scanner.nextDouble();
        System.out.println("Enter the age:");
        int age=scanner.nextInt();
        System.out.println("Enter color:");
        String color= scanner.next();
        System.out.println("Enter top speed:");
        int topSpeed=scanner.nextInt();
        DogBreeds dogBreed= DogBreeds.valueOf(scanner.next());
        Dog dog=new Dog(price,age,color,topSpeed,dogBreed);
        animals.add(dog);
    }
    public void addCat()
    {
        Scanner scanner=new Scanner(System.in);
        double price=scanner.nextDouble();
        int age=scanner.nextInt();
        String color= scanner.next();
        int furSize=scanner.nextInt();
        CatBreed catBreed= CatBreed.valueOf(scanner.next());
        Cat cat=new Cat(price,age,color,furSize,catBreed);
        animals.add(cat);
    }
    public void sellDog()
    {
        Scanner scanner=new Scanner(System.in);
        double price=scanner.nextDouble();
        int age=scanner.nextInt();
        String color= scanner.nextLine();
        int topSpeed=scanner.nextInt();
        DogBreeds dogBreed= DogBreeds.valueOf(scanner.nextLine());
        Dog dog=new Dog(price,age,color,topSpeed,dogBreed);
        for(int i=0;i<animals.size();i++)
          {
              if(animals.get(i).equals(dog))
             {
                 this.checkout=animals.get(i).getPrice();
                 System.out.println("Dog with name "+animals.get(i).getAge()+"was sold!");
                 animals.remove(animals.get(i));
             }

          }
    }
    public void sellCat()
    {
        Scanner scanner=new Scanner(System.in);
        double price=scanner.nextDouble();
        int age=scanner.nextInt();
        String color= scanner.nextLine();
        int furSize=scanner.nextInt();
        CatBreed catBreed= CatBreed.valueOf(scanner.nextLine());
        Cat cat=new Cat(price,age,color,furSize,catBreed);
        for(int i=0;i<animals.size();i++)
        {
            if(animals.get(i).equals(cat))
            {
                this.checkout=animals.get(i).getPrice();
                System.out.println("Cat with name "+animals.get(i).getAge()+"was sold!");
                animals.remove(animals.get(i));
            }

        }
    }
    public void CountOfAnimals()
    {    int dogCounter=0,catCounter=0;

        for(int i=0;i<animals.size();i++)
        {
            if(animals.get(i) instanceof DogMarker)
            {
                dogCounter++;
            }
            else if(animals.get(i) instanceof CatMarker)
            {
                catCounter++;
            }
            else
            {
                System.out.println("There are no animals!");
            }
        }
        System.out.println("There are"+animals.size()+"animals!");
        System.out.println("Dogs:"+dogCounter);
        System.out.println("Cats:"+catCounter);

    }
    public void sellAll()
    {
        for(int i=0;i<animals.size();i++)
       {
          this.checkout+=animals.get(i).getPrice();
       }
        animals.clear();
    }


}
