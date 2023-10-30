package oppsConcept;

interface ExampleInterface {

    void printInfo();
    default void printInfo1() {
        System.out.println("Interface Class");
    }

}

abstract class ExampleAbstract {
    
    abstract void printInfo();
    void printInfo1() {
        System.out.println("Abstract Class");
    }

}

class Child implements ExampleInterface {

    @Override
    public void printInfo() {
        System.out.println("Class Child");
    }
    
}