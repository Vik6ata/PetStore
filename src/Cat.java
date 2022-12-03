public class Cat extends Animal implements CatMarker{
    private double furSize;
    private CatBreed catBreed;
    public Cat(double price, int age,String color,double furSize,CatBreed catBreed) {
        super( price, age,color);
        this.furSize=furSize;
        this.catBreed=catBreed;
        try{
            validate();
        }catch (CatException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public double getPrice() {

        return super.getPrice();
    }

    public int getAge()
    {
        return super.getAge();
    }

    public double getFurSize() {
        return furSize;
    }

    public String getColor() {
        return super.getColor();
    }
    public CatBreed getCatBreed() {
        return catBreed;
    }

    public String toString() {
        return super.toString()+
                "Breed="+getCatBreed()+
                "FurSize="+getFurSize()+"\n";
    }
    public void validate() throws CatException
    {
        if(this.getPrice()<=0)
        {
            throw new CatException("The cat's price has to be above 0!");
        }
        if(this.getAge()<=0)
        {
            throw new CatException("The cat's age has to be above 0!");
        }
        if(this.getCatBreed()==null)
        {
            throw new CatException("The cat must have a breed!");
        }
        if(this.getColor()==null || this.getColor().isEmpty())
        {
            throw new CatException("The cat must have a color!");
        }
        if(this.getFurSize()<=0)
        {
            throw new CatException("The cat's fur size must be above 0!");
        }
    }
}
