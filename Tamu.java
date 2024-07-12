public class Tamu extends Pengguna {
  private int sisaMasaAktif;

  public void menambahMasaAktif(int tambahan) {
    this.sisaMasaAktif += tambahan;
  }

  public int getSisaMasaAktif() {
    return sisaMasaAktif;
  }

  public void setSisaMasaAktif(int sisaMasaAktif) {
    this.sisaMasaAktif = sisaMasaAktif;
  }

  @Override
  public void hapus() {
    System.out.println("DELETE FROM pengguna WHERE status='tamu'");
  }

  @Override
  public void login() {
    System.out.println("Login sebagai tamu");
  }
}
