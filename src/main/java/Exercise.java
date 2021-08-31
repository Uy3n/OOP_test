import java.util.List;
import java.util.ArrayList;
import Entities.Passenger;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Passenger> passengerList = new ArrayList<>();
        System.out.println("nhap so luong khach hang: ");
        int n = sc.nextInt();

        Passenger passenger = new Passenger();

        for (int i = 0; i < n; i++) {
            System.out.println("nhap khach hang thu: " + i);

            Passenger passenger1 = passenger.inputPassenger();
            passengerList.add(passenger1);
        }

        System.out.println("danh sach khach hang: ");
        passengerList.forEach(Passenger::outputPassenger);

        System.out.println("danh sach khach hang theo chieu giam dan cua tong tien: ");
        passengerList.sort((p1, p2) -> (int) (p1.total() - p2.total()));

        for (Passenger value : passengerList) {
            System.out.println(value);
        }
    }
}
