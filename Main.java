public class Main {
    public static void main(String[] args) {
        Termostato termostato = new Termostato("automatico");
        System.out.println("temperatura inicial: " + termostato.getTemperatura() + "°C ");
        termostato.setTemperatura(25);
        System.out.println("temperatura actual: " + termostato.getTemperatura() + "°C ");
        termostato.setTemperatura(35);
        System.out.println("temperatura actual: " + termostato.getTemperatura() + "°C ");
        termostato.setTemperatura(10);
        System.out.println("temperatura final: " + termostato.getTemperatura() + "°C ");
    }
}