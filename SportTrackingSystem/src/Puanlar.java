import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Puanlar extends Tablolar {

    @Override
    protected String getTabloAdi() {
        return "puanlar";
    }

    @Override
    protected String[] getKolonIsimleri() {
        return new String[]{"takım_adı", "lig_adı", "oynanan", "galibiyet", "beraberlik", "mağlubiyet", "atılan_gol", "yenilen_gol", "averaj", "puan"};
    }

    public void fillPuanTablosu(JTable table, String valueToSearch) {
        Connection con = MyConnection.getconnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM " + getTabloAdi() + " WHERE CONCAT (`takım_adı`) LIKE ?");
            ps.setString(1, "%" + valueToSearch + "%");

            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object[] row;
            while (rs.next()) {
                row = new Object[11];
                for (int i = 0; i < 11; i++) {
                    row[i] = rs.getObject(i + 1);
                }

                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Puanlar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
