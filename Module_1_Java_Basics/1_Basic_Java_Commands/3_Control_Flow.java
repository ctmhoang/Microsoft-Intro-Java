//Write a program using three static methods: firstMethod(), secondMethod(), thirdMethod(). firstMethod() calls secondMethod()
//, secondMethod() calls thirdMethod(). Inside thirdMethod() use println statement to print “You are in third method”

public class ControlFlow {
    public static void main(String[] args) {
        //Call the FirstMethod() method here to print 'You are in the third method'
        firstMethod();
    }

    // Define firstMethod()
    public static void firstMethod(){
        secondMethod();
    }
    // Define secondMethod()
    public static void secondMethod(){
        thirdMethod();
    }

    // Define thirdMethod()
    public static void thirdMethod(){
        System.out.println("You are in third method");
    }
}
