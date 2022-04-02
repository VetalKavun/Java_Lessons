package code.two;

public class Exception2 {

    int genException() {
        int e = 92;
        try {
            int num[] = new int[3];
            System.out.println("Before exception generation");
            num[7] = 255 + e;
            System.out.println("It will not be shown");
            //throw new ArrayStoreException();
            return 1;

        } catch (Exception u) {
            System.out.println("Exceeding of array");
            System.out.println(u.getCause());
            return 14;
            //throw u;
            // u.printStackTrace();
        }
    }

    int e(Exception k){
        System.out.println("ArithmeticException");
        return 1;
    }





    }


