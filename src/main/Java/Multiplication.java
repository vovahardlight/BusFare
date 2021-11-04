public class Multiplication {
    int people,buses,busFare;

    public Multiplication(int people, int buses, int busFare) {
        this.people = people;
        this.buses = buses;
        this.busFare = busFare;
    }
        String calculation(int buses,int people,int busFare){
            return "All benefit is "+((buses * people) * busFare);

        }
    }
class Program {
    public static void main(String[] args) {
Multiplication benefit = new Multiplication(23,8,8);
        System.out.println(benefit.calculation(25,8,8));
    }
}
