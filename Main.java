public class Main {
    public static void main(String[] args) {
        System.out.println("Estudiante nombre y apellido");
        Proyecto.estudio(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2]));

        System.out.println( Proyecto.veredicto(args[1],args[2]));

    }

}