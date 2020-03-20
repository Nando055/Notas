
package notras.principal;

import notas.control.Control;
import notas.modelo.Curso;
import notas.vista.VistaCurso;

/**
 *
 * @author lmedinap
 */
public class Pruebas {
    public static void main(String[] args) {
         Curso c = new Curso(); 
         VistaCurso v = new VistaCurso();
         v.setVisible(true);
         Control control = new Control(v, c);
         
    }
}
