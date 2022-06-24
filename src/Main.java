public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Singleton obj1 = Singleton.getSingleton();
        Singleton obj2 = Singleton.getSingleton();
        if (obj1 == obj2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        System.out.println("End");
    }
}
