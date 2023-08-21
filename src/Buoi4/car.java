package Buoi4;

public class car {
    //thuoc tinh lop oto
    private   String ten;
    int namsx;
    //phuong thuc cua lop oto
    void di(){
        System.out.println("o to dang di chuyen");
    }
    void dung(){
        System.out.println("o to dung lai");
    }
    void inthongtin(){
        System.out.println("ten:"+ten);
        System.out.println("nam sx:"+ namsx);

    }

    public void setTen(String ten2) {
        ten =ten2;
    }
    public String getTen(){
        return ten;

    }

    public void setNamsx(int namsx2) {
        namsx = namsx2;
    }
    public car(){

    }
    public car( String ten2,int namsx2){
        ten=ten2;
        namsx=namsx2;

    }


    public static void main(String[] args) {
//comtructor
        //public +lop
        //ham tao phai co ten trung voi ten class
        //ham tao tu khoi dong qua tu khoa new

    }
}
