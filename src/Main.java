import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập tên hàng nhập kho: ");
        String name = scanner.nextLine();

        System.out.println("Mời bạn nhập ngày tháng năm sinh (yyyy/MM/dd): ");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Mời bạn nhập thời gian nhập hàng (yyyy/MM/dd HH:mm:ss): ");
        String timeIn = scanner.nextLine();

        System.out.println("Mời bạn nhập thời gian (HH:mm:ss)");
        String time = scanner.nextLine();


        System.out.println("Tên hàng nhập kho là: "+name);
        System.out.println("Ngày tháng năm sinh của bạn là: "+dateOfBirth);
        System.out.println("Thời gian bạn nhập hàng là: "+timeIn);
        System.out.println("Thời gian của bạn: "+time);
    }
}
