package homeLesson3;

/**
 * @author Света on 21.02.2017.
 */
public class Mazda3 extends Mazda implements Drivable {


    @Override
    public boolean inProduction(int number) {
        return super.inProduction(number);
    }

    @Override
    public void drive() {
        System.out.println("I'm driving mazda 3!");
    }
}
