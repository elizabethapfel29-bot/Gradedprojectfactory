public class Factory {//defines my class named factory

    public String owner = "Ellie";//says a text (string) variable for the owner (ellie)
    public boolean isOpen =true;//says true or false(boolean) variable indicating if the facory is open
    public int yearFounded=2026;//says a integer variable for the year it was founded

    public burgers BurgersOrder1;// makes my object variable of type (burgers)
    public burgers BurgersOrder2;//makes my second object variable of type (burgers)
    public burgers BurgersOrder3;//makes my third object variable of type (burgers)
    public Lollypops LollypopsOrder1;//makes my object variable of type (lollypops)







    public static void main(String[] args) {//psvm method that starts my code
        Factory a = new Factory(); // creats a new object for my facotry class and sets it to variable "a"



    }

    //special method:constructor
    //name has to be the same name as class
    //you do not say void
    public Factory() {//this is the start of my factory constructor
        System.out.println("Welcome to Ellie's factory");
        System.out.println("the factory was founded in " + yearFounded);
        System.out.println("it is " + isOpen + " that the factory is open");

        //make an object of type Donuts

        BurgersOrder1 = new burgers (5,true,"Mustard");// creates a new burger order with parameters
        System.out.println( "order 1 #Burgers");//prints a header
        System.out.println("Each Burger comes with " + BurgersOrder1.Numberofpattys + " pattys");
        System.out.println("The type of sause is " + BurgersOrder1.TypeOfSause);
        System.out.println("It is " + BurgersOrder1.HasCheese + " that the burgers have cheese");

        BurgersOrder1.addPatty();//increases the patty count of order 1 by one
        BurgersOrder1.changeSauseType("ketchup");//changes the type of sause in order 1 to ketcup.


        BurgersOrder2 = new burgers (7,false,"ketchup");// creates a new burger order with parameters
        System.out.println( "order 2 #Burgers");//prints a header
        System.out.println("Each Burger comes with " + BurgersOrder2.Numberofpattys + " pattys");
        System.out.println("The type of sause is " + BurgersOrder2.TypeOfSause);
        System.out.println("It is " + BurgersOrder2.HasCheese + " that the burgers have cheese");
        BurgersOrder1.Numberofpattys=BurgersOrder2.Numberofpattys +1;


        BurgersOrder3 = new burgers (1,true,"no sause");// creates a new burger order with parameters
        System.out.println( "order 3 #Burgers");
        System.out.println("Each Burger comes with " + BurgersOrder2.Numberofpattys + " pattys");
        System.out.println("there is " + BurgersOrder2.TypeOfSause);
        System.out.println("It is " + BurgersOrder2.HasCheese + " that the burgers have cheese");









        LollypopsOrder1 = new Lollypops (3,true,"cherry");// creates a lollypop order with parameters
        System.out.println("we also have lollypops!");
        System.out.println("the radis of the lollypop is " + LollypopsOrder1.RadisOfLollypop + "cm");
        System.out.println(" It is " + LollypopsOrder1.HasDesign + "that the lollypops have a design");
        System.out.println("The flavor is " + LollypopsOrder1.Flavor);

    }




}
