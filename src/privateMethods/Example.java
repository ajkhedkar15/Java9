package privateMethods;

public class Example {
}

class Addition implements Util1{

    @Override
    public int addMultiply(int a, int b, int c) {
        return 0;
    }
}

class AdditionAndMultiply implements Util1{

    @Override
    public int addMultiply(int a, int b, int c) {
        return  (a + b)*c;
    }
}

//Before Java 8
//Addition and AdditionAndMultiply classes implements Utils interface
//which have addMultiply methods which will take three params a and b for add
//and then c to multiply
//In Case of Addition class c will be 1
//In case of AdditionAndMultiply class c will be any random int.
//Due to some client updation we need to change Addition class and for
//even nos we need to multiply by two and for odd multiply by four.
//for this requirement we have add two separate methods in an interface
//say addAndMultiplyByTwo, addAndMultiplyByFour
//As we have added these two methods two classes we need to change as this
//interface implemented by these two classes
//So consider if interface implemented by multiple classes then we need to change
//either all classes or need to have one new interface or we can create an abstract
//class and then will implemented classes extend this class
//Java 8 onwards default methods come to rescue.

interface  Utils{
    int addMultiply(int a, int b, int c);//Abstract Method
}

//Java 8
interface Util1 {

    int addMultiply(int a, int b, int c);//Abstract Method

    default int add(int a, int b) {
        return a + b;
    }

    default int addAndMultiplyByTwo(int a, int b) {
        return (a + b) * 2;
    }

    default int addAndMultiplyByFour(int a, int b) {
        return (a + b) * 4;
    }

    //This is violating the DRY (Don't Repeat Yourself) principle.
}

//Java 9
interface  Util2{
    default int add(int a, int b) {
        return sum(a,b);
    }

    default int addAndMultiplyByTwo(int a, int b) {
        return sum(a,b)*2;
    }

    default int addAndMultiplyByFour(int a, int b) {
        return sum(a,b)*4;
    }

    //Helper method
    private int sum(int a, int b) {
        return a + b;
    }
}


