public class Pelanggan implements iSuperMarket {
    public String NamaPelanggan;
    public String Alamat;

    public Pelanggan(String NamaPelanggan, String Alamat){
        this.NamaPelanggan=NamaPelanggan;
        this.Alamat=Alamat;
    }

    @Override
    public void cetakFaktur(){

    }

    @Override
    public Integer totalBayar() {
        throw new UnsupportedOperationException("Unimplemented method 'totalBayar'");
    }
   
}
