import com.ejer.itemseparator.ItemSeparator;

public class Main {
    public static void main(String[] args) {

        try {
            ItemSeparator it = new ItemSeparator("nombre$$##1.2$$##3");
        } catch(NumberFormatException e) {
            System.out.println("Formato numérico erroneo.");
            System.out.println("Precio debe de estar separado por un '.' sus decimales");
            System.out.println("Cantidad debe de ser un número entero.");
        }
    }
}