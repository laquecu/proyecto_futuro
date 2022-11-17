public class Proyecto {
    public static void estudio(String nombre, int modulos,int horas){

        System.out.println(nombre+" "+modulos+" "+horas);
        System.out.println(nombre+" "+modulos+" "+horas);

    }

    public static String veredicto(String valor1, String valor2){
        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
}
