public class Jus extends Minuman {
    private String buah;

    // Constructor
    public Jus(String nama, String rasa, String buah) {
        super(nama, rasa);  // Memanggil constructor induk
        this.buah = buah;
    }

    // Overriding constructor
    public Jus() {
        this("Jus", "Manis", "Tidak Diketahui");
    }

    // Getter dan Setter untuk buah
    public void setBuah(String buah) {
        this.buah = buah;
    }

    public String getBuah() {
        return buah;
    }

    
    public String info() {
        return getNama() + " adalah jus dari buah " + buah + " dengan rasa " + getRasa();
    }
}

