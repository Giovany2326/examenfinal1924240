package entities;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private String equipoActual;  

    public Agente(int id, String nombre, String habilidadEspecial) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
        this.equipoActual = null;  
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }


    public void asignarEquipo(String equipo) {
        this.equipoActual = equipo;
    }


    public String obtenerEquipo() {
        return equipoActual != null ? "Equipo asignado: " + equipoActual : "No tiene equipo asignado.";
    }

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "") +
                ", " + obtenerEquipo();
    }
}

