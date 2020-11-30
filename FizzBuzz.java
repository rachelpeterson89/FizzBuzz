public class FizzBuzz {
    // needs to return a string
    public String calculateFizzBuzz(int num) {
        // fizzBuzz logic goes here
        if(num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if(num % 3 == 0) {
            return "Fizz";
        } else if(num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }
}