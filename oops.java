//1. Create a class for Birds which should have a method fly. Inherit the class in child class and access the method.

  class Birds {

    void fly() {
        System.out.println("Birds can fly");
    }
}

class Parrot extends Birds {

    public static void main(String[] args) {

        Parrot p = new Parrot();
        p.fly();
    }
}

// output : Birds can fly
