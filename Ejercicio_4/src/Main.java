public class Main {
    public static void main(String[] args) {
        int num = 777;
        int suma = sumaDigitos(num);
        System.out.println("La suma de los digitos de " + num + " es: " + suma);
    }
    public static int sumaDigitos(int num) {
        if (num <= 0) {
            return 0;
        }
        return (num % 10) + sumaDigitos(num / 10);
    }
}