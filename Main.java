import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int choice;
        boolean ShopCreated=false;
        Scanner scan=new Scanner(System.in);

        do
        {
            Store store=new Store();
            System.out.println("1.Add a dog");
            System.out.println("2.Add a cat");
            System.out.println("3.Sell a dog");
            System.out.println("4.Sell a cat");
            System.out.println("5.Display the count of animals");
            System.out.println("6.Sell all");
            System.out.println("0.Exit");
            choice=scan.nextInt();
            switch (choice)
            {
                case 1:
                {
                 store.addDog();
                }
                case 2:
                {
                    store.addCat();
                }
                case 3:
                {
                    store.sellDog();
                }
                case 4:
                {
                    store.sellCat();
                }
                case 5:
                {
                    store.CountOfAnimals();
                }
                case 6:
                {
                    store.sellAll();
                }
                case 0:
                {
                    System.out.println("Goodbye!");
                }

            }

        }while(choice != 0);


    }
}