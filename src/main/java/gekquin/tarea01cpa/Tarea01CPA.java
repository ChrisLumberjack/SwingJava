package gekquin.tarea01cpa;

import javax.swing.SwingUtilities;

public class Tarea01CPA {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Principal princ = new Principal();
            princ.setVisible(true);
            princ.setLocationRelativeTo(null);
        });
    }
}