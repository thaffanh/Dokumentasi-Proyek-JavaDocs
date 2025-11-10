package dokumentasi.proyek;

/**
 * Kelas ini menyediakan utilitas dasar untuk operasi matematika sederhana.
 * Tujuan utamanya adalah melakukan operasi penambahan dan pengurangan.
 * <p>
 * Semua operasi dijamin aman dari {@code NullPointerException}.
 *
 * @author Budi Santoso (Tim Dev A)
 * @version 1.1
 * @since 2023-10-20
 */
public class KalkulatorSederhana {

    /**
     * Konstanta yang merepresentasikan nilai nol mutlak.
     * Digunakan sebagai nilai default jika input tidak valid.
     */
    private static final double NOL_MUTLAK = 0.0;

    /**
     * Melakukan operasi penambahan dua buah bilangan double.
     *
     * <p>Metode ini menjamin hasil yang akurat. Jika salah satu angka
     * adalah {@code Double.NaN} (Not-a-Number), hasil akan dikembalikan
     * sebagai {@link #NOL_MUTLAK}.
     *
     * @param angka1 Bilangan pertama yang akan ditambahkan.
     * @param angka2 Bilangan kedua yang akan ditambahkan.
     * @return Hasil dari penjumlahan {@code angka1} dan {@code angka2}.
     * @throws IllegalArgumentException Jika salah satu input bernilai
     * tak terhingga ({@code Double.isInfinite(angka)} adalah true).
     * @see KalkulatorSederhana#kurangi(double, double)
     */
    public double tambah(double angka1, double angka2) throws IllegalArgumentException {
        if (Double.isInfinite(angka1) || Double.isInfinite(angka2)) {
            throw new IllegalArgumentException("Input tidak boleh tak terhingga.");
        }
        if (Double.isNaN(angka1) || Double.isNaN(angka2)) {
            return NOL_MUTLAK;
        }
        return angka1 + angka2;
    }

    /**
     * Melakukan operasi pengurangan antara dua bilangan.
     *
     * @param angkaPengurang Bilangan dasar yang akan dikurangi.
     * @param angkaPembeda Jumlah yang akan dikurangi dari {@code angkaPengurang}.
     * @return Perbedaan antara kedua angka tersebut.
     */
    public double kurangi(double angkaPengurang, double angkaPembeda) {
        return angkaPengurang - angkaPembeda;
    }
}