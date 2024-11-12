import org.example.FizzBuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName("Test if numb is divisible by 3")
    void testWhenTheNumberIsDivisibleByThreeThenReturnFizz(){
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String res = fizzBuzz.checkNumb(9);
        //Then
        assertEquals("Fizz", res);
    }

    @Test
    @DisplayName("Test if number is divisible by 5")
    void testWhenTheNumberIsDivisibleByFiveThenReturnBuzz() {
        // Given
        FizzBuzz fizzbuzz = new FizzBuzz();
        // When
        String res = fizzbuzz.checkNumb(10);
        // Then
        assertEquals("Buzz", res);
    }


    @Test
    @DisplayName("Test if number is divisible by 3 and 5")
    void test_whenTheNumberIsDivisibleByThreeAndFive_thenReturnFizzBuzz() {
        //Given
        FizzBuzz fizzbuzz = new FizzBuzz();
        //When
        String res = fizzbuzz.checkNumb((15));
        //Then
        assertEquals("FizzBuzz", res);
    }

    @Test
    @DisplayName("Test if number is not divisible by 3 neither 5")
    void test_whenTheNumberIsNotDivisibleByThreeNeitherFive_thenReturnSameNumber(){
        //Given
        FizzBuzz fizzbuzz = new FizzBuzz();
        //When
        int numb = 7;
        String res = fizzbuzz.checkNumb(numb);
        //Then
        assertEquals("7", res);
    }
}
