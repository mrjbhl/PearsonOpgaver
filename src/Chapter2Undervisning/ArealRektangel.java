package Chapter2Undervisning;

public class ArealRektangel {
    public static void main(String[] args) {
        System.out.println("Beregner areal af rektangel med metoder");
        System.out.println("Arealet for to sider af 2 og 6 er: " + beregnAreal(2, 6));
        System.out.println("Arealet for to sider af 5 og 6 er: " + beregnAreal(5, 6));
    }

    // metode til beregning af areal
    public static double beregnAreal(double sideA, double sideB) {
        double areal = sideA * sideB;
        return areal;

    }
}
