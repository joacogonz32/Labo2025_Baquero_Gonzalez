package SistemaPoblacion;

public class Barrio extends Lugar{
    private int cantHabitantes;

    public Barrio(int cantHabitantes) {
        this.cantHabitantes = cantHabitantes;
    }

    public int getCantHabitantes() {
        return cantHabitantes;
    }

    public void setCantHabitantes(int cantHabitantes) {
        this.cantHabitantes = cantHabitantes;
    }
}
