package Entities;

import java.util.Scanner;

public class Ticket {
    public String tenchuyen;
    public String ngayBay;
    public double giaVe;

    public Ticket() {

    }

    public Ticket(String tenchuyen, String ngayBay, double giaVe) {
        this.tenchuyen = tenchuyen;
        this.ngayBay = ngayBay;
        this.giaVe = giaVe;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public Ticket input() {
        System.out.println("nhap thong tin ve: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ten chuyen bay: ");
        this.tenchuyen = sc.nextLine();

        System.out.println("nhap ngay bay: ");
        this.ngayBay = sc.nextLine();

        System.out.println("nhap gia ve: ");
        this.giaVe = sc.nextDouble();

        Ticket ticket = new Ticket(this.tenchuyen, this.ngayBay, this.giaVe);
        return ticket;
    }

    public void output() {
        System.out.println("thong tin ve: ");
        System.out.println("ten chuyen bay: " + this.tenchuyen);
        System.out.println("ngay bay: " + this.ngayBay);
        System.out.println("gia ve: " + this.giaVe);
    }
}