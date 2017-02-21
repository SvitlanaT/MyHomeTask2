package homeLesson3;

/**
 * @author Света on 19.02.2017.
 */
abstract class Mazda implements Drivable {
    public boolean inProduction(int number){

        if (number!=0 ){
            return true;
        }
        return  false;

    }
}
