package BTVN_buoi4;
import java.util.Scanner;

public class BT2{
    private int D ;
    private int R ;
    public BT2(){

    }
    public BT2(int D,int R)
    {
        this.D = D;
        this.R = R;
    }
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.println("nhap chieu dai :");
        D = s.nextInt();
        System.out.println("nhap chieu rong :");
        R = s.nextInt();
    }
    public void veHCN()
    {

        for(int i=1;i<=R;i++)
        {
            for(int j=1;j<=D;j++)
            {
                if(i==1 || i== R|| j==1||j==D)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public float Chuvi()
    {
        return (D+R)*2;
    }
    public float Dientich()
    {
        return D*R;
    }

    public static void main(String[] age)
    {

        BT2 b2 = new BT2();
        b2.nhap();
        System.out.println("dien tich hcn = "+b2.Dientich());
        System.out.println("chu vi hcn = "+ b2.Chuvi());
        System.out.println("HInh ve " );
        b2.veHCN();

    }



}

