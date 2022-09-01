package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_return_1_when_count_off_given_number_1() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "1";

        //when
        String actual = fizzBuzz.countOff(1);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_fizz_when_count_off_given_number_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";

        //when
        String actual = fizzBuzz.countOff(3);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_Buzz_when_count_off_given_number_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";

        //when
        String actual = fizzBuzz.countOff(5);

        //then
        assertEquals(expected, actual);
    }
    @Test
    void should_return_Whizz_when_count_off_given_number_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Whizz";

        //when
        String actual = fizzBuzz.countOff(7);

        //then
        assertEquals(expected, actual);
    }
    @Test
    void should_return_FizzBuzz_when_count_off_given_number_15() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "FizzBuzz";

        //when
        String actual = fizzBuzz.countOff(15);

        //then
        assertEquals(expected, actual);
    }
    @Test
    void should_return_FizzWhizz_when_count_off_given_number_21() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "FizzWhizz";

        //when
        String actual = fizzBuzz.countOff(21);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_FizzBuzzWhizz_when_count_off_given_number_105() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "FizzBuzzWhizz";

        //when
        String actual = fizzBuzz.countOff(105);

        //then
        assertEquals(expected, actual);
    }
    @Test
    void should_return_BuzzWhizz_when_count_off_given_number_70() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "BuzzWhizz";

        //when
        String actual = fizzBuzz.countOff(70);

        //then
        assertEquals(expected, actual);
    }

}
