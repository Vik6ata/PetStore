public class Dog extends Animal implements DogMarker{
    private int topSpeed;
    private DogBreeds dogBreed;

    public Dog( double price, int age,String color, int topSpeed,DogBreeds dogBreed) {
        super(price, age,color);
        this.topSpeed = topSpeed;
        this.dogBreed=dogBreed;
        try{
            validate();
        }catch (DogException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public int getAge() {
        return super.getAge();
    }

    public double getPrice() {
        return super.getPrice();
    }


    public DogBreeds getDogBreed() {
        return dogBreed;
    }

    public String getColor() {
        return super.getColor();
    }

    public int getTopSpeed() {
        return topSpeed;
    }


    public String toString()
    {
        return super.toString()+
                "Breed:"+getDogBreed()+
                "TopSpeed="+getTopSpeed()+"\n";
    }
    public void validate() throws DogException
    {
        if(this.getPrice()<=0)
        {
            throw new DogException("The dog's price has to be above 0!");
        }
        if(this.getAge()<=0)
        {
            throw new DogException("The dog's age has to be above 0!");
        }
        if(this.getDogBreed()==null)
        {
            throw new DogException("The dog must have a breed!");
        }
        if(this.getColor()==null || this.getColor().isEmpty())
        {
            throw new DogException("The dog must have a color!");
        }
        if(this.getTopSpeed()<=0)
        {
            throw new DogException("The dog's running speed must be above 0!");
        }
    }
}
