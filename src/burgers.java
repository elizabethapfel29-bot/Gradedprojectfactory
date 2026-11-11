public class burgers {//this is the start of my burger class


    public int Numberofpattys;//make instance variable called numberofpattys.

    public boolean HasCheese;//make instance variable called Haschese.

    public String TypeOfSause;//make instance variable called typeofsause.

    public burgers(int pNumberOfPattys, boolean pHasCheese,String pTypeOfSause){//this is my constructor method that has 3 starting parameters.
        Numberofpattys=pNumberOfPattys;//seting vaule to the parameter
        HasCheese=pHasCheese; //setting the boolean to the parameter
        TypeOfSause= pTypeOfSause;//seting the string to the parameter
    }
    public void printinfo() { //this is the start of my printifo method
        System.out.println("The number of pattys in the burger is " + Numberofpattys);
        System.out.println(" It is " + HasCheese + " that the Burgers have cheese");
        System.out.println("The Sause on the Burger is  " + TypeOfSause);
    }

    public void addPatty(){//starts a method called addPattys to modifty the buger and add more pattys
        Numberofpattys = Numberofpattys+1;//increases the current vaulue of NumberofPattys by 1

    }

    public void changeSauseType(String NewSauseType){//starts a method called NewSauseType
        TypeOfSause=NewSauseType; //overrides the current sausetype and changes it
    }
    }
