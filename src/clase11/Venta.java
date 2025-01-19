package clase11;

import java.time.Month;

public class Venta {
    private double totalMensual;
    private Month month;

    public Venta(Month month, double totalMensual) {
        this.month = month;
        this.totalMensual = totalMensual;

    }

    public double getTotalMensual() {
        return totalMensual;
    }

    public void setTotalMensual(double totalMensual) {
        this.totalMensual = totalMensual;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Venta{");
        sb.append("totalMensual=").append(totalMensual);
        sb.append(", month=").append(month);
        sb.append('}');
        return sb.toString();
    }
}
