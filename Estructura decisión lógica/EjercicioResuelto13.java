import java.util.Scanner;

public class EjercicioResuelto13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("""
                Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la\s
                compra total, según el color de la bolita que el cliente saque al pagar en caja. Si la bolita\s
                es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es\s
                amarilla un 25%, si es azul un\s
                50% y si es roja un 100%.""");

        double valorCompra, descuento, valorPagar;
        String colorBolita;
        System.out.print("Ingresa el valor de la compra: ");
        valorCompra = entrada.nextDouble();
        System.out.print("Ingresa el color de la bola: ");
        colorBolita = entrada.next();

        if(colorBolita.equalsIgnoreCase("BLANCA")){
            valorPagar = valorCompra;
            System.out.println("\nEl valor total a pagar es: " + valorPagar);
            System.out.println("¡Mejor suerte la próxima vez!");
        }
        else if(colorBolita.equalsIgnoreCase("VERDE")){
            descuento = valorCompra*0.1;
            valorPagar = valorCompra - descuento;
            System.out.println("El valor total a pagar es: " + valorPagar);
        }
        else if(colorBolita.equalsIgnoreCase("AMARILLA")){
            descuento = valorCompra*0.25;
            valorPagar = valorCompra - descuento;
            System.out.println("El valor total a pagar es: " + valorPagar);
        }
        else if(colorBolita.equalsIgnoreCase("AZUL")){
            descuento = valorCompra*0.5;
            valorPagar = valorCompra - descuento;
            System.out.println("El valor total a pagar es: " + valorPagar);
        }
        else {
            valorPagar = 0;
            System.out.println("El valor total a pagar es: " + valorPagar);
            System.out.println("¡Felicidades, tu compra ha salido gratis!");
        }
    }
}
