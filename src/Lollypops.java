public class Lollypops {//start of my lollypop class

    public int RadisOfLollypop;//makes a variable that stores the intiger for my radis

    public boolean HasDesign;//creates a variable that is true or false that says if the lollypop has a design

    public String Flavor;//creats a variable string that tells the flavor

    public Lollypops(int pRadisOfLollypop, boolean pHasDesign,String pFlavor){//constructor method to set a new lollypop object with spesific values
        RadisOfLollypop=pRadisOfLollypop;
        HasDesign=pHasDesign;
        Flavor= pFlavor;
    }
    public void printinfo() {//public method called printinfor
        System.out.println("The radis of the lollypop is  " + RadisOfLollypop);
        System.out.println(" It is " + HasDesign + " that the lollypops have a design");
        System.out.println("The flavor of the lollypop is  " + Flavor);
    }



}
