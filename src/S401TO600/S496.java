package S401TO600;

public class S496 {
    public Toy getToy(String type) {
        // Write your code here
        Toy toy = null;
        switch (type)
        {
            case "Dog": { toy = new Dog(); break;}
            case "Cat": { toy = new Cat(); break;}
        }
        return toy;
    }
}

interface Toy {
    void talk();
}

class Dog implements Toy {
    @Override
    public void talk() {
        System.out.println("Wow");
    }
    // Write your code here
}

class Cat implements Toy {
    // Write your code here
    @Override
    public void talk() {
        System.out.println("Meow");
    }
}
