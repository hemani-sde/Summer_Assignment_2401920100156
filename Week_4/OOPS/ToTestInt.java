interface Test {
    int square(int n);
}


class Arithmetic implements Test {

    public int square(int n) {
        return n * n;
    }
}

// Main Class
public class ToTestInt {

    public static void main(String[] args) {

        Arithmetic obj = new Arithmetic();

        int num = 6;

        System.out.println("Square of " + num + " = " + obj.square(num));
    }
}
