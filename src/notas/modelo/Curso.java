package notas.modelo;

/**
 *
 * @author andres
 */
public class Curso {

   
    double[] notas;
    double promedio =0;

    public Curso() {

        notas = new double[6];
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    

    public void registarCambiarNota(double nota) {
        for (int i = 0; i < 6; i++) {
            if (notas[i]== 0.0) {
                 notas[i] = nota;
                 break;
            }
           
        }
        

    }
 public double promedioCurso() {
      promedio =0;
      for (int i = 0; i < notas.length; i++) {
            promedio += notas[i];
            promedio = promedio/6;
            break;
        }
      
        return promedio;
    }

    public int cantidadEncimaPromedio() {
        double aux = promedioCurso();
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > aux) {
                contador++;
            }
        }

        return contador;
    }

}
