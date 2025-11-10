package Latihan2;
import java.lang.Math;
public class SPL {
    public static void main(String[] args) {
        segitiga s = new segitiga(2, 4);
        System.out.println("\n=== SEGITIGA ===");
        System.out.println("Alas     = " + s.geta());
        System.out.println("Tinggi   = " + s.gett());
        System.out.println("Luas     = " + s.getluas());
        System.out.println("Keliling = " + s.getkel());

        persegi p = new persegi(10);
        System.out.println("\n=== PERSEGI ===");
        System.out.println("Jari-jari= " + p.gets());
        System.out.println("Luas     = " + p.getluas());
        System.out.println("Keliling = " + p.getkel());

        lingkaran l = new lingkaran(5);
        System.out.println("\n=== LINGKARAN ===");
        System.out.println("Jari-jari= " + l.getr());
        System.out.println("Luas     = " + l.getluas());
        System.out.println("Keliling = " + l.getkel());
    }
    
}

class segitiga {
        double a;
        double t;
        segitiga (double a, double t){
            this.a = a;
            this.t = t;
        }
        double geta(){
            return a;
        }
        double gett(){
            return t;
        }
        double getluas(){
            return (this.a*this.t)/0.5;
        }
        double getkel(){
            double sisimiring = Math.sqrt(Math.pow(a / 2, 2) + Math.pow(t, 2));
            return this.a+this.t+sisimiring;
        }
}

class persegi {
        int s;
        persegi (int s){
        this.s = s;
        }
        int gets(){
            return s;
        }
        int getluas(){
            return s * s;
        }
        int getkel(){
            return s * 4;
        }
}

class lingkaran {
        double r;
        lingkaran (double r){
            this.r = r;
        }
        double getr(){
            return r;
        }
        double getluas(){
            return Math.PI * r * r;
        }
        double getkel(){
            return 2 * Math.PI * r;
        }
}


