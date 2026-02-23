package demo;


import java.util.Scanner;

/* ---------- PRODUCT ---------- */
class Product {
    int id;
    String name;
    String brand;
    int ram;
    int storage;
    double price;
    Product(int id, String name, String brand, int ram, int storage, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }
    void display() {
        System.out.println(id + ". " + name + " | " + brand + 
                           (ram>0 ? " | RAM: "+ram+"GB" : "") + 
                           (storage>0 ? " | Storage: "+storage+"GB" : "") + 
                           " | ₹" + price);
    }
}
/* ---------- CART ---------- */
class Cart {
    Product[] items = new Product[200];
    int count = 0;
    void add(Product p) {
        items[count++] = p;
        System.out.println("✔ Added to cart: " + p.name);
    }
    double showCart() {
        double total = 0;
        System.out.println("\n--- CART ---");
        for (int i = 0; i < count; i++) {
            items[i].display();
            total += items[i].price;
        }
        System.out.println("Total Amount: ₹" + total);
        return total;
    }
}
/* ---------- PAYMENT ---------- */
class Payment {
    Scanner sc = new Scanner(System.in);

    void upi() {
        System.out.print("Enter UPI PIN: ");
        sc.nextInt();
        System.out.println( Ecomm.GREEN+"Payment Successful (UPI)"+ Ecomm.RESET);
        System.out.println( Ecomm.GREEN+"Your Order is Placed"+ Ecomm.RESET);
        System.out.println( Ecomm.BLUE+"Thank you for shopping" +Ecomm.RESET);
    }
    void netBanking() {
        System.out.print("Enter Account No: ");
        sc.nextLong();
        System.out.println( Ecomm.GREEN+"Payment Successful (Net Banking)"+ Ecomm.RESET);
        System.out.println( Ecomm.GREEN+"Your Order is Placed"+ Ecomm.RESET);
        System.out.println( Ecomm.BLUE+"Thank you for shopping"+ Ecomm.RESET);
    }
}
/* ---------- BILL ---------- */
class Bill {

    void printBill(Cart cart, double total, String paymentMode) {

        System.out.println("\n========= BILL RECEIPT =========");
        System.out.println("Items Purchased:");

        for (int i = 0; i < cart.count; i++) {
            cart.items[i].display();
        }

        System.out.println("-------------------------------");
        System.out.println("Payment Mode : " + paymentMode);
        System.out.println("Total Amount : ₹" + total);
        System.out.println("===============================");
        System.out.println("Thank you for shopping 😊");
    }
}

/* ---------- MAIN APPLICATION ---------- */
public class Ecomm {
	static final String RESET  = "\u001B[0m";
    static final String GREEN  = "\u001B[32m";
    static final String RED    = "\u001B[31m";
    static final String BLUE   = "\u001B[34m";
    static final String PURPLE = "\u001B[35m";
    static final String YELLOW = "\u001B[33m";
    static final String BRIGHT_YELLOW = "\u001B[93m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();
        Payment payment = new Payment();
        double total = 0;

        /* ================= ELECTRONICS ================= */
        Product[][] electronics = new Product[5][10];
        // Mobiles
        electronics[0] = new Product[]{
            new Product(1,"Galaxy S23","Samsung",8,128,55000),
            new Product(2,"iPhone 14","Apple",6,128,65000),
            new Product(3,"OnePlus 11","OnePlus",8,256,52000),
            new Product(4,"Pixel 7","Google",8,128,48000),
            new Product(5,"Vivo X90","Vivo",12,256,60000),
            new Product(6,"Oppo Reno","Oppo",8,128,35000),
            new Product(7,"Realme GT","Realme",8,128,30000),
            new Product(8,"Redmi Note","Xiaomi",6,128,20000),
            new Product(9,"Nothing Phone","Nothing",8,256,45000),
            new Product(10,"Moto Edge","Motorola",8,128,28000)
        };
        // Laptops
        electronics[1] = new Product[]{
            new Product(1,"MacBook Air M1","Apple",8,256,90000),
            new Product(2,"Dell Inspiron 15","Dell",16,512,75000),
            new Product(3,"HP Pavilion","HP",16,512,70000),
            new Product(4,"Lenovo ThinkPad","Lenovo",16,512,82000),
            new Product(5,"Asus ROG","Asus",32,1024,150000),
            new Product(6,"Acer Swift 3","Acer",8,512,60000),
            new Product(7,"Lenovo IdeaPad","Lenovo",8,512,55000),
            new Product(8,"HP Victus","HP",16,512,90000),
            new Product(9,"MSI GF63","MSI",16,512,83000),
            new Product(10,"Surface Laptop","Microsoft",16,512,120000)
        };
        // Chargers
        electronics[2] = new Product[]{
            new Product(1,"Apple 20W Charger","Apple",25,3,2000),
            new Product(2,"OnePlus 65W Charger","OnePlus",30,3,3000),
            new Product(3,"Xiaomi 33W Charger","Xiaomi",30,4,1500),
            new Product(4,"Samsung 45W Charger","Samsung",30,3,2500),
            new Product(5,"Boat Charger","Boat",40,3,1300),
            new Product(6,"Anker Charger","Anker",40,2,3500),
            new Product(7,"Portronics Charger","Portronics",30,3,1000),
            new Product(8,"Ambrane Charger","Ambrane",30,3,900),
            new Product(9,"Realme Charger","Realme",25,1,1600),
            new Product(10,"Nothing Charger","Nothing",40,2,1800)
        };
        // Watches
        electronics[3] = new Product[]{
            new Product(1,"Apple Watch","Apple",25,8,46000),
            new Product(2,"Galaxy Watch","Samsung",20,8,30000),
            new Product(3,"Noise ColorFit","Noise",30,8,5000),
            new Product(4,"Boat Xtend","Boat",35,8,4000),
            new Product(5,"Fossil Gen 6","Fossil",25,8,23000),
            new Product(6,"FireBoltt","FireBoltt",20,8,3500),
            new Product(7,"Amazfit GTR","Amazfit",20,8,16000),
            new Product(8,"Realme Watch","Realme",20,8,3000),
            new Product(9,"Titan Smart","Titan",30,8,12000),
            new Product(10,"Casio G-Shock","Casio",50,8,10000)
        };
        // Headphones
        electronics[4] = new Product[]{
            new Product(1,"Sony WH-1000XM5","Sony",0,0,30000),
            new Product(2,"Apple AirPods Pro","Apple",0,0,25000),
            new Product(3,"Boat Rockerz","Boat",0,0,5000),
            new Product(4,"JBL Tune","JBL",0,0,8000),
            new Product(5,"Noise 4","Noise",0,0,6000),
            new Product(6,"Skullcandy Crusher","Skullcandy",0,0,13000),
            new Product(7,"Sennheiser 450","Sennheiser",0,0,16000),
            new Product(8,"OnePlus Buds Pro","OnePlus",0,0,12000),
            new Product(9,"Realme Buds","Realme",0,0,4000),
            new Product(10,"Bose QC45","Bose",0,0,28000)
        };
        /* ================= SNACKS ================= */
        Product[][] snacks = new Product[5][10];
        String[][] snackNames = {
            {"Hide & Seek","Treat","Good Day","Britannia Milk","Oreo","Perk","KitKat","Munch","Mango Bite","Roulade"},
            {"Lays","Kurkure","Pringles","Doritos","Uncle Chips","Balaji","Tango","Tasties","Jack n Jill","Haldiram Chips"},
            {"Cadbury Dairy Milk","5 Star","Bournville","Perk","KitKat","Munch","Snickers","Galaxy","Mars","Twix"},
            {"Coca Cola","Pepsi","Fanta","Sprite","Maaza","Slice","Thums Up","Mirinda","Appy Fizz","Limca"},
            {"Aloo Bhujia","Namakpara","Sev","Chivda","Mixture","Papdi","Masala Peanuts","Cornflakes","Murukku","Bhakarwadi"}
        };
        String[][] snackBrands = {
                {"Britannia","Britannia","Britannia","Oreo","Britannia","Britannia","Britannia","Britannia","Britannia","Britannia"},
                {"Lays","Kurkure","Pringles","Doritos","ITC","Uncle Chips","Balaji","Too Yumm","Haldiram","Cheetos"},
                {"Cadbury","Cadbury","Nestle","Cadbury","Nestle","Mars","Galaxy","Mars","Mars","Ferrero"},
                {"Coca Cola","Pepsi","Coca Cola","Coca Cola","Maaza","Slice","Coca Cola","Coca Cola","Coca Cola","Parle"},
                {"Haldiram","Haldiram","Haldiram","Haldiram","Haldiram","Haldiram","Haldiram","Haldiram","Haldiram","Haldiram"}
        };
        double[] prices = {20,25,30,15,10,12,18,22,14,16};
        for(int i=0;i<5;i++){
            snacks[i] = new Product[10];
            for(int j=0;j<10;j++){
            	 snacks[i][j] = new Product(j + 1, snackNames[i][j], snackBrands[i][j], 0, 0, prices[j]);
            }
        }
        /* ================= FASHION ================= */
        Product[][] fashion = new Product[5][10];
        String[][] fashionNames = {
            {"T-Shirt","Shirt","Jacket","Hoodie","Sweater","Polo","Blazer","Kurta","Jumpsuit","Harem Pants"},
            {"Dress","Skirt","Top","Blouse","Jeans","Leggings","Palazzo","Tunic","Saree","Salwar Kameez"},
            {"Sneakers","Boots","Sandals","Loafers","Flip Flops","Heels","Slippers","Oxford","Moccasin","Canvas Shoes"},
            {"Analog Watch","Smart Watch","Chronograph","Diver Watch","Leather Strap","Digital Watch","Metal Band","Fitness Watch","Hybrid Watch","Luxury Watch"},
            {"Backpack","Handbag","Messenger Bag","Duffel Bag","Clutch","Tote Bag","Sling Bag","Laptop Bag","Wallet","Pouch"}
        };
        String[][] fashionBrands = {
                {"Nike","Allen Solly","Levis","Puma","Adidas","Roadster","Van Heusen","Manyavar","HRX","U.S. Polo"},
                {"Zara","H&M","Forever 21","Levis","Biba","W","Sabyasachi","FabIndia","AND","Global Desi"},
                {"Nike","Woodland","Bata","Clarks","Puma","Metro","Relaxo","Converse","Adidas","Red Tape"},
                {"Titan","Apple","Casio","Fossil","Rolex","Fitbit","Fastrack","G-Shock","Sonata","Timex"},
                {"Wildcraft","Lavie","HP","Skybags","Caprese","Baggit","Tommy Hilfiger","Allen Solly","Safari","American Tourister"}
        };
        for(int i=0;i<5;i++){
            fashion[i] = new Product[10];
            for(int j=0;j<10;j++){
            	 fashion[i][j] = new Product(j + 1, fashionNames[i][j], fashionBrands[i][j], 0, 0, 800 + j * 300);
            }
        }
        /* ================= GROCERIES ================= */
        Product[][] groceries = new Product[5][10];
        String[][] groceryNames = {
            {"Rice","Wheat","Ragi","Oats","Barley","Millet","Quinoa","Corn Flour","Maida","Suji"},
            {"Sunflower Oil","Mustard Oil","Groundnut Oil","Coconut Oil","Olive Oil","Rice Bran Oil","Soybean Oil","Refined Oil","Vegetable Oil","Palm Oil"},
            {"Toor Dal","Moong Dal","Chana Dal","Urad Dal","Masoor Dal","Kidney Beans","Black Gram","Lentils","Soybeans","Rajma"},
            {"Turmeric","Red Chili","Coriander","Cumin","Mustard Seeds","Garam Masala","Black Pepper","Cardamom","Cloves","Cinnamon"},
            {"Milk","Curd","Cheese","Paneer","Butter","Ghee","Yogurt","Cream","Khoa","Lassi"}
        };
        double[] groceryPrice = {120,150,140,160,130,110,180,100,90,200};
        for(int i=0;i<5;i++){
            groceries[i] = new Product[10];
            for(int j=0;j<10;j++){
                groceries[i][j] = new Product(j+1,groceryNames[i][j],"Brand"+(i+1),0,0,groceryPrice[j]);
            }
        }
        /* ================= MAIN MENU LOOP ================= */
        while(true){
            System.out.println(YELLOW+"\n===== MAIN MENU ====="+RESET);
            System.out.println(BLUE+"1. Electronics"+RESET);
            System.out.println(BLUE+"2. Snacks"+RESET);
            System.out.println(BLUE+"3. Fashion"+RESET);
            System.out.println(BLUE+"4. Groceries"+RESET);
            System.out.println(BLUE+"5. View Cart"+RESET);
            System.out.println(BLUE+"6. Checkout"+RESET);
            System.out.println(BLUE+"7. Exit"+RESET);
            System.out.print(YELLOW+"Choice: "+RESET);
            int mainChoice = sc.nextInt();
            Product[][] selectedSection = null;
            String[] sectionNames = null;
            switch(mainChoice){
                case 1: selectedSection = electronics; sectionNames = new String[]{"Mobiles","Laptops","Chargers","Watches","Headphones"}; break;
                case 2: selectedSection = snacks; sectionNames = new String[]{"Biscuits","Chips","Chocolates","Soft Drinks","Namkeen"}; break;
                case 3: selectedSection = fashion; sectionNames = new String[]{"Men Wear","Women Wear","Footwear","Watches","Bags"}; break;
                case 4: selectedSection = groceries; sectionNames = new String[]{"Rice & Grains","Oils","Pulses","Spices","Dairy"}; break;
                case 5: cart.showCart(); continue;
                case 6:
               
                    total = cart.showCart();

                    if(total > 0){
                        System.out.println(PURPLE+"1. UPI\n2. Net Banking"+RESET);
                        int payChoice = sc.nextInt();

                        String mode;
                        if(payChoice == 1){
                            payment.upi();
                            mode = "UPI";
                        } else {
                            payment.netBanking();
                            mode = "Net Banking";
                        }

                        Bill bill = new Bill();
                        bill.printBill(cart, total, mode);
                    }
                    continue;
                case 7: System.out.println(GREEN+"Thank you!"+RESET); return;
                default: System.out.println(RED+"Invalid choice"+RESET); continue;
            }
            /* SUB-CATEGORY MENU */
            System.out.println(PURPLE+"\nSelect Sub-Category:"+RESET);
            for(int i=0;i<5;i++) System.out.println((i+1)+". "+sectionNames[i]);
            int subChoice = sc.nextInt()-1;
            if(subChoice<0 || subChoice>4){ System.out.println(RED+"Invalid subcategory"+RESET); continue;}
            Product[] products = selectedSection[subChoice];
            for(Product p: products) p.display();
            System.out.print("Select product ID to add to cart: ");
            int pid = sc.nextInt();
            cart.add(products[pid-1]);
        }
    }
}
