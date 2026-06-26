class Box {

    double length;
    double breadth;

    
    Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

   
    double area() {
        return length * breadth;
    }
}


class Box3D extends Box {

    double height;

   
    Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    
    double volume() {
        return length * breadth * height;
    }
}

// Main Class
public class BoxDemo {

    public static void main(String[] args) {

        Box b = new Box(5, 4);

        System.out.println("Area of Box = " + b.area());

        Box3D b3 = new Box3D(5, 4, 3);

        System.out.println("Area of Box3D = " + b3.area());
        System.out.println("Volume of Box3D = " + b3.volume());
    }
}
