import java.util.Scanner;

class buah {
    int berapa;
    String nama;
    public void display(){
        System.out.println(" Fruit Store");
    }
}

class manis extends buah {
    @Override
    public void display(){
        System.out.println("Buah Manis : ");
        String [] arrBuah = {"Mangga","Manggis","Naga"};
        for (int i = 0; i < arrBuah.length; i++){
            System.out.println(arrBuah[i]);
        } 
        
    }    
}

class asam extends buah {
    @Override
    public void display(){
        System.out.println("Buah Asam :");
        String [] arrAsam = {"Jeruk","Nanas","Lemon"};
        for (int i = 0; i < arrAsam.length; i++){
            System.out.println(arrAsam[i]);
        } 

    }
}




public class App {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Buah Siapa = ");
        String name = inputan.next();
        System.out.print(name);
        manis h1 = new manis();
        asam h2 = new asam();
        buah h3 = new buah();
        h3.display();
        System.out.println("============================================\nTersedia 2 pilihan Jenis Buah :");
        h1.display();
        h2.display();
    }
}
