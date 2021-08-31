package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Passenger {
    public String hoTen;
    public String gioiTinh;
    public int tuoi;
    public List<Ticket> danhSachVe;

    public Passenger() {

    }

    public Passenger(String hoTen, String gioiTinh, int tuoi, List<Ticket> danhSachVe) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.danhSachVe = danhSachVe;
    }

    public Passenger inputPassenger(){
        System.out.println("Nhập thông tin khách hàng: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập họ tên: ");
        String hoTen = sc.nextLine();

        System.out.println("Nhập giới tính: ");
        String gioiTinh = sc.nextLine();

        System.out.println("Nhập tuổi: ");
        int tuoi = sc.nextInt();

        System.out.println("Nhập danh sách vé: ");
        System.out.println("Nhập số vé: ");
        int total = sc.nextInt();

        Ticket ticket = new Ticket();
        List<Ticket> danhSachVe = new ArrayList<>();

        for(int i = 0; i < total; i++) {
            Ticket ticket1 = ticket.input();
            danhSachVe.add(ticket1);
        }

        Passenger passenger = new Passenger(hoTen, gioiTinh, tuoi, danhSachVe);
        return passenger;
    }

    public void outputPassenger(){
        System.out.println("Thông tin hành khách: ");
        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Giới tính: " + this.gioiTinh);
        System.out.println("Tuổi: " + this.tuoi);
        System.out.println("Danh sách vé: ");

        for(int i = 0; i < danhSachVe.size() ; i++){
            System.out.println(danhSachVe.get(i));
        }

        System.out.println("Tổng số tiền: " + total());
    }

    public double total() {
        double total = 0;

        for (int i = 0; i < danhSachVe.size(); i++) {
            total += danhSachVe.get(i).giaVe;
        }

        return total;
    }
}