package homework.lesson2.boss;

/**
 * @author Света on 19.02.2017.
 */
class MainBoss {

    public static void main(String[] args) {
        Boss bob = new Boss();
        Worker1 w1 = new Worker1();
        Worker2 w2 = new Worker2();
        Worker3 w3 = new Worker3();
        bob.hobby();
        w1.hobby();
        w2.hobby();
        w3.hobby();
    }
}
