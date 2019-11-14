public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){

        numberOne = (int)(numberOne *1000);
        numberTwo = (int)(numberTwo* 1000);

        if (numberOne == numberTwo){
            return true;
        }else{
            return false;
        }
    }
}
