package BTVN_buoi4;
import java.util.Scanner;

public class BT1 {
        private int id;
        private String name;
        private String author;
        private String maker;
        private int pubYear;

        public BT1(int id, String name, String author, String maker, int pubYear) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.maker = maker;
            this.pubYear = pubYear;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setMaker(String maker) {
            this.maker = maker;
        }

        public void setPubYear(int pubYear) {
            this.pubYear = pubYear;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }

        public String getMaker() {
            return maker;
        }

        public int getPubYear() {
            return pubYear;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            BT1 book1 = new BT1(001, "OOP", "Nguyen Van A", "NXB KHTN", 2022);
            BT1 book2 = new BT1(002, "He quan tri CSDL", "Tran Thi B", "NXB KHTN", 2023);
            BT1 book3 = new BT1(003, "CSDL", "Dao Van C", "NXB KHTN", 2021);
            BT1 book4 = new BT1(004, "HTCSDL", "Le Van D", "NXB KHTN", 2019);
            BT1 book5 = new BT1(005, "An ninh mang", "Nguyen Van E", "NXB KHTN", 2022);
            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Ma sach", "Ten Sach", "Tac gia", "Nha xuat ban", "Nam xuat ban");
            System.out.printf("%-20d%-20s%-20s%-20s%-20s\n", book1.getId(), book1.getName(), book1.getAuthor(), book1.getMaker(), book1.getPubYear());
            System.out.printf("%-20d%-20s%-20s%-20s%-20s\n", book2.getId(), book2.getName(), book2.getAuthor(), book2.getMaker(), book2.getPubYear());
            System.out.printf("%-20d%-20s%-20s%-20s%-20s\n", book3.getId(), book3.getName(), book3.getAuthor(), book3.getMaker(), book3.getPubYear());
            System.out.printf("%-20d%-20s%-20s%-20s%-20s\n", book4.getId(), book4.getName(), book4.getAuthor(), book4.getMaker(), book4.getPubYear());
            System.out.printf("%-20d%-20s%-20s%-20s%-20s\n", book5.getId(), book5.getName(), book5.getAuthor(), book5.getMaker(), book5.getPubYear());
        }
    }

