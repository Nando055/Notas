package notas.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import notas.modelo.Curso;
import notas.vista.VistaCurso;

/**
 *
 * @author andres
 */
public class Control implements ActionListener {

    VistaCurso v;
    Curso c;

    public Control(VistaCurso v, Curso c) {
        super();
        this.v = v;
        this.c = c;
        ActionListener(this);
    }

    private void ActionListener(Control controlador) {
        v.pc1.addActionListener(controlador);
        v.pc2.addActionListener(controlador);
        v.r1.addActionListener(controlador);
        v.r2.addActionListener(controlador);
        v.r3.addActionListener(controlador);
        v.r4.addActionListener(controlador);
        v.r5.addActionListener(controlador);
        v.r6.addActionListener(controlador);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(v.pc2)) {
            c.promedioCurso();
            v.jTextArea1.setText("" + c.getPromedio());
        }

        if (e.getSource().equals(v.pc1)) {
            c.cantidadEncimaPromedio();
            v.jTextArea1.setText("" + c.cantidadEncimaPromedio());
        }

        if (e.getSource().equals(v.r1)) {
            c.registarCambiarNota(Double.parseDouble(v.AL1.getText()));
            v.p1.setText(v.AL1.getText());
        }
        
        if (e.getSource().equals(v.r2)) {
            c.registarCambiarNota(Double.parseDouble(v.AL2.getText()));
            v.p2.setText(v.AL2.getText());
        }
        if (e.getSource().equals(v.r3)) {
            c.registarCambiarNota(Double.parseDouble(v.AL3.getText()));
            v.p3.setText(v.AL3.getText());
        }
        if (e.getSource().equals(v.r4)) {
            c.registarCambiarNota(Double.parseDouble(v.AL4.getText()));
            v.p4.setText(v.AL4.getText());
        }
        if (e.getSource().equals(v.r5)) {
            c.registarCambiarNota(Double.parseDouble(v.AL5.getText()));
            v.p5.setText(v.AL5.getText());
        }
        if (e.getSource().equals(v.r6)) {
            c.registarCambiarNota(Double.parseDouble(v.AL6.getText()));
            v.p6.setText(v.AL6.getText());
        }

    }
}
