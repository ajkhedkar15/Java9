package AutoClosable;

//Effectively final in try-with-resource
class Resource implements AutoCloseable{
    public Resource() {
        System.out.println("Created...");
    }

    public void op1(){
        System.out.println("Op1 performed");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed...");
    }
}

//In Java 7 we get try with resource feature we can eliminate the catch block
//dependency but we need to initialize the object in try block and scope of that
//object is only inside try block
//Java 9 removed this dependency.
public class Example {
    public static void main(String[] args) throws Exception{

        //Java 7
        //We need to initialize the object in try with resource
        try(Resource r = new Resource()){
            r.op1();
        }

        //Java 9
        Resource r1 = new Resource();
        try (r1){
            r1.op1();
        }
    }
}
