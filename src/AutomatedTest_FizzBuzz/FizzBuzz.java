package AutomatedTest_FizzBuzz;

public class FizzBuzz {
    private int number;
    public FizzBuzz(int number){
        this.number = number;
    }
    public String toString(){
        if (this.number %3==0 && this.number%5==0)
            return "FizzBuzz";
        else if( this.number%3 == 0)
            return "Fizz";
        else if( this.number%5== 0)
            return  "Buzz";
        else
            return "Aloha";
    }
}
