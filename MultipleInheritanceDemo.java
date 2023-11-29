package assignments12;

interface Engine {
    void start();
}


interface Wheels {
    void rotate();
}


class Van implements Engine, Wheels {
    public void start() {
        System.out.println("Van is starting");
    }

    public void rotate() {
        System.out.println("Wheels are rotating");
    }
}


public class MultipleInheritanceDemo {
    public static void main(String[] args) {

        Van myVan = new Van();


        myVan.start();
        myVan.rotate();
    }
}
