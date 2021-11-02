public abstract class Cake {
    //makeDough
    //addFlavour

    //common
    private void makeDough(){
        System.out.println("Making Dough");
    }

    //depend upon child class
    protected abstract void addFlavour();

    public void makeCake(){
        makeDough();
        addFlavour();
    }
}
