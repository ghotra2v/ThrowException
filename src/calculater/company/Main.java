package calculater.company;

class cannotDivideZero extends Exception{
    @Override
    public String toString(){
        return "Cannot divide 0";
    }
    @Override
    public String getMessage(){
        return "I am getMessage";
    };

}

class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Number cannot be more than 10,000";
    }
    @Override
    public String getMessage(){
        return "I am getMessage";
    };

}


class CustomCalculator {
    double add( double a, double b) throws MaxInputException{

        if ( a==10000|| b == 10000) {
            throw new MaxInputException();
        }
        return a+b;
        }


    double subtract ( double a, double b) throws MaxInputException{

        if ( a==10000|| b == 10000) {
            throw new MaxInputException();
        }
        return a-b;

    }
    double multiply ( double a, double b) throws MaxInputException {
        if ( a==10000|| b == 10000) {
            throw new MaxInputException();
        }
        return a*b;
    }
    double divide( double a, double b) throws cannotDivideZero, MaxInputException {
        if (b==0 ){
            throw new cannotDivideZero();
        }
        if ( a==10000|| b == 10000) {
            throw new MaxInputException();
        }
        return a/b;
    }
}

public class Main {

    public static void main(String[] args) throws cannotDivideZero, MaxInputException{
	// write your code here
        CustomCalculator c = new CustomCalculator();
        c.add(4,6);
        c.subtract(10000, 7777);
        c.multiply(4, 9);
        c.divide(3000,0);
        c.divide(10000, 1000);

    }
}
