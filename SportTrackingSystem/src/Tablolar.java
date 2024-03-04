import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public abstract class Tablolar {

    // Abstract metotları alt sınıflarda implemente edilecek.
    protected abstract String getTabloAdi();

    protected abstract String[] getKolonIsimleri();

    public String idAdi;

    // Ortak metotları burada tanımladık.
    public void EkleGüncelleSilTakım(char islem, Integer id, Object... args) { //değişken parametre isimleriyle iişlem yapabilmeyi sağlar
        Connection con = MyConnection.getconnection();
        PreparedStatement ps;

        String[] kolonIsimleri = getKolonIsimleri();

        //ekleme --> "e"
        if (islem == 'e') {
            try {
                StringBuilder insertQuery = new StringBuilder("INSERT INTO ")
                        .append(getTabloAdi())
                        .append(" (");

                for (String kolon : kolonIsimleri) {
                    insertQuery.append(kolon).append(",");
                }

                insertQuery.deleteCharAt(insertQuery.length() - 1);
                insertQuery.append(") VALUES (");

                for (int i = 0; i < kolonIsimleri.length; i++) {
                    insertQuery.append("?,");
                }

                insertQuery.deleteCharAt(insertQuery.length() - 1);
                insertQuery.append(")");

                ps = con.prepareStatement(insertQuery.toString());

                for (int i = 0; i < args.length; i++) {
                    ps.setObject(i + 1, args[i]);
                }

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Yeni Kayıt Başarıyla Eklendi");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Tablolar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // Güncelleme --> "g"
        if (islem == 'g') {
            try {
                StringBuilder updateQuery = new StringBuilder("UPDATE ")
                        .append(getTabloAdi())
                        .append(" SET ");

                for (String kolon : kolonIsimleri) {
                    updateQuery.append(kolon).append("=?,");
                }

                if (getTabloAdi().equals("puanlar")){
                    idAdi = "takım_id";
                }
                if (getTabloAdi().equals("maçlar")){
                    idAdi = "lig_id";
                }
                updateQuery.deleteCharAt(updateQuery.length() - 1);
                updateQuery.append(" WHERE ").append(idAdi).append("=?");

                System.out.println("DELETE FROM " + getTabloAdi() + " WHERE " + idAdi + " = ?"); //kontrol
                ps = con.prepareStatement(updateQuery.toString());

                for (int i = 0; i < args.length; i++) {
                    ps.setObject(i + 1, args[i]);
                }

                ps.setInt(args.length + 1, id);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Kayıt Başarıyla Güncellendi");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Tablolar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Silme --> "s"

if (islem == 's') {
    try {
        if (getTabloAdi().equals("puanlar")){
                    idAdi = "takım_id";
                }
        if (getTabloAdi().equals("maçlar")){
                    idAdi = "lig_id";
                }
        String deleteQuery = "DELETE FROM " + getTabloAdi() + " WHERE " + idAdi + " = ?";
        ps = con.prepareStatement(deleteQuery);
        System.out.println("DELETE FROM " + getTabloAdi() + " WHERE " + idAdi + " = " + id);
//kontrol
        ps.setInt(1, id);
    int rowCount = ps.executeUpdate();
          if (rowCount > 0) {
              JOptionPane.showMessageDialog(null, "Kayıt Başarıyla Silindi");
          } else {
              JOptionPane.showMessageDialog(null, "Silme işlemi gerçekleştirilemedi. Belirtilen ID bulunamadı.");
          }
      } catch (SQLException ex) {
          Logger.getLogger(Tablolar.class.getName()).log(Level.SEVERE, null, ex);
      }

}

    }
}
