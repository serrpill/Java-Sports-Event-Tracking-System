import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Maçlar extends Tablolar {

    @Override
    protected String getTabloAdi() {
        return "maçlar";
    }

    @Override
    protected String[] getKolonIsimleri() {
        return new String[]{"lig_adı", "ev_sahibi_takım", "deplasman_takım", "maç_tarihi", "ev_sahibi_skor", "deplasman_skor"};
    }

    public void fillFikstürTablosu(JTable table, String valueToSearch) {
        Connection con = MyConnection.getconnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM " + getTabloAdi() + " WHERE CONCAT(`lig_adı`, `ev_sahibi_takım`) LIKE ?");
            ps.setString(1, "%" + valueToSearch + "%");

            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object[] row;
            while (rs.next()) {
                row = new Object[7];
                for (int i = 0; i < 7; i++) {
                    row[i] = rs.getObject(i + 1);
                }

                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Maçlar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
