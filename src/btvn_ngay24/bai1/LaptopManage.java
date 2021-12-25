package btvn_ngay24.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class LaptopManage {
    ArrayList<Laptop> laptops = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public LaptopManage() {
    }

    public Laptop creatLaptop(){ //for fun thôi nhé
        System.out.println("Nhập thông tin sản phẩm");
        System.out.print("Hãng sản xuất: ");
        String brand = sc.nextLine();
        System.out.print("Màu sắc của sản phẩm: ");
        String color = sc.nextLine();
        System.out.print("Giá thành: ");
        double price = sc.nextDouble();
        System.out.print("Số lượng: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        Laptop laptop = new Laptop(brand,color,price,quantity);
        return laptop;
    }
    public void addLaptop(){
        Laptop laptop = creatLaptop();
        laptops.add(laptop);
    }

    public Laptop editLaptop(int id){
        for (int i = 0; i < laptops.size(); i++) {
            if (laptops.get(i).getId()==id){
//                laptops.remove(laptops.get(i));
                laptops.set(i,creatLaptop());
                laptops.get(i).setId(id);
                Laptop.ID--;
            }
        }
        return null;
    }

    public Laptop deleteLaptop(int id){
        for (Laptop laptop: laptops) {
            if (laptop.getId() == id){
                laptops.remove(laptop);
                return laptop;
            }
        }
        return null;
    }

    public void displayLaptops(){
        for (Laptop laptop: laptops) {
            System.out.println(laptop);
        }
    }

    public ArrayList<Laptop> displayByBrand(String brand){
        ArrayList<Laptop> laptopsBrand = new ArrayList<>();
        for (Laptop laptop: laptops) {
            if (laptop.getBrand().equals(brand)){
                laptopsBrand.add(laptop);
            }
        }
        return laptopsBrand;
    }

    public ArrayList<Laptop> findByPrice(int lowPrice, int highPrice){
        ArrayList<Laptop> laptopsPrice = new ArrayList<>();
        for (Laptop laptop: laptops) {
            if (laptop.getPrice() > lowPrice && laptop.getPrice() < highPrice){
                laptopsPrice.add(laptop);
            }
        }
        return laptopsPrice;
    }

    public ArrayList<Laptop> findByColor(String color){
        ArrayList<Laptop> laptopsColor = new ArrayList<>();
        for (Laptop laptop: laptops) {
            if (laptop.getColor().equalsIgnoreCase(color)){
                laptopsColor.add(laptop);
            }
        }
        return laptopsColor;
    }

}
