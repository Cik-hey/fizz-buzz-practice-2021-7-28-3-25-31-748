package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String WHIZZ = "Whizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";
    public static final String FIZZ_WHIZZ = "FizzWhizz";
    public static final String BUZZ_WHIZZ = "BuzzWhizz";
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";

    public String countOff(int order) {
        if(order % 3 == 0 && order % 5 == 0 && order % 7 == 0){
            return FIZZ_BUZZ_WHIZZ;
        }
        if(order % 3 == 0 && order % 5 == 0){
            return FIZZ_BUZZ;
        }
        if(order % 5 == 0 && order % 7 == 0){
            return BUZZ_WHIZZ;
        }
        if(order % 3 == 0 && order % 7 == 0){
            return FIZZ_WHIZZ;
        }
        if(order % 3 == 0){
            return FIZZ;
        }
        if(order % 5 == 0){
            return BUZZ;
        }
        if(order % 7 == 0){
            return WHIZZ;
        }
        return String.valueOf(order);
    }
}
