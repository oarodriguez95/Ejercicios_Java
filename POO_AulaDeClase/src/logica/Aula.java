package logica;

public class Aula {

    private int idAula;
    private Materia materiaAula;
    private final int CANT_MAX_ALUMNOS = 10;

    public Aula(int idAula, Materia materiaAula) {
        this.idAula = idAula;
        this.materiaAula = materiaAula;
    }
    
    

    public int getIdAula() {
        return idAula;
    }

    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    public Materia getMateriaAula() {
        return materiaAula;
    }

    public void setMateriaAula(Materia materiaAula) {
        this.materiaAula = materiaAula;
    }

    public int getCANT_MAX_ALUMNOS() {
        return CANT_MAX_ALUMNOS;
    }
    
    
}
