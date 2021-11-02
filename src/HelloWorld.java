public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Cakeshop");
        ChocolateCake chocolateCake = new ChocolateCake();
        StrowberryCake strowberryCake = new StrowberryCake();
        chocolateCake.makeCake();
        strowberryCake.addFlavour();
    }
}
