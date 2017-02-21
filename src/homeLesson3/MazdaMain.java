package homeLesson3;

/**
 * @author Света on 21.02.2017.
 */
public class MazdaMain {

    public static void main(String[] args) {

        Mazda testCar1 = new Mazda3();
        Mazda testCar2 = new Mazda5();
        System.out.println(testCar1.inProduction(3));
        System.out.println(testCar2.inProduction(0));
        testCar1.drive();
        testCar2.drive();
        System.out.println(Mazda.class.getSimpleName());
    }
}
