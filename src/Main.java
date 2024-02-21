import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km , totalcost , baseMoney = 10 , kmPerPrice = 2.20 ;
        // kullanacağımız değerleri tanımlama

        Scanner input = new Scanner(System.in);     //gidilen km için yeni scanner oluşturma
        System.out.print("Gidilen KM giriniz : ");  // gidilen km sorusu
        km = input.nextDouble();                    // km bilgisini içe aktarma

        totalcost = (kmPerPrice * km ) + baseMoney;    // fiyat denklemini oluşturma

        System.out.println(totalcost < 20 ? "Taxi fiyatı : 20.0 ": "Taxi fiyatı :" + totalcost);
        //tutar 20 tl'nin altındaysa  20 tl , üstündeyse totalcost denklemini kullan )
        }
    }           //Ali Erem KÖSE 21/02/2024  04:26