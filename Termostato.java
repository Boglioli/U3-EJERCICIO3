public class Termostato {
    private double temperaturaActual;
    private String modoOperacion;
    public Termostato(String modoOperacion) {
        this.modoOperacion = modoOperacion;
        this.temperaturaActual = 20;
    }
    public void setTemperatura(double nuevaTemperatura) {
        if (nuevaTemperatura >= 15 && nuevaTemperatura <= 30) {
            temperaturaActual = nuevaTemperatura;
            System.out.println("temperatura actualizar correctamente");
        } else {
            System.out.println("advertencia: la temperatura debe estar entre 15 y 30 grados");
        }
    }
    public double getTemperatura() {
        return temperaturaActual;
    }
}
