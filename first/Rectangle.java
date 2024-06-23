package first;

public class Rectangle {
    private int a;
    private int b;


    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private int getArea(){
        return a * b;
    }

    private int getPerimetr(){
        System.out.println(Math.PI);
        System.out.println(Math.pow(1, 2));
        return 2 * (a + b);
    }

    public void showInfo(){
        System.out.println("Площадь " + getArea() + " \nПериметр: " + getPerimetr() );
    }
}
