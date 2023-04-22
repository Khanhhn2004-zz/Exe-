import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tính diện tích hình vuông");
            System.out.println("2. Tính diện tích hình chữ nhật");
            System.out.println("3. Tính diện tích hình tròn");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập cạnh của hình vuông: ");
                    double side = scanner.nextDouble();
                    double area = squareArea(side);
                    System.out.println("Diện tích hình vuông là: " + area);
                    break;
                case 2:
                    System.out.print("Nhập chiều dài của hình chữ nhật: ");
                    double length = scanner.nextDouble();
                    System.out.print("Nhập chiều rộng của hình chữ nhật: ");
                    double width = scanner.nextDouble();
                    area = rectangleArea(length, width);
                    System.out.println("Diện tích hình chữ nhật là: " + area);
                    break;
                case 3:
                    System.out.print("Nhập bán kính của hình tròn: ");
                    double radius = scanner.nextDouble();
                    area = circleArea(radius);
                    System.out.println("Diện tích hình tròn là: " + area);
                    break;
                case 4:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 4);
    }

    public static double squareArea(double side) {
        return side * side;
    }

    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
