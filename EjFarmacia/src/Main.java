public class Main {
    public static void main(String[] args) {
        Medicamento medicamento1 = new DeLaboratorio("Medicamento1","dolor de estomago","Paracetamol",100, 20, "Abot");
        Medicamento medicamento2 = new Generico("Medicamento2", "dolor de cabeza", "Diclofenac",100, 30,"Diclofenac");

        medicamento1.aprobarMedicamento();

        System.out.println(medicamento1.obtenerEstado());
        System.out.println(medicamento2.obtenerEstado());

        System.out.println("");

        System.out.println("PRECIOS: ");
        System.out.println(medicamento1.getPrecio());
        System.out.println(medicamento2.getPrecio());

        System.out.println("");

        System.out.println("COMPRAS");
        System.out.println(medicamento1.realizarCompra(5));
        System.out.println(medicamento2.realizarCompra(40));


    }
}