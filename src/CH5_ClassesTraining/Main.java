package CH5_ClassesTraining;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());
    }
}
