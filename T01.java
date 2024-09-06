// 12S24043 - DESNITA PARDOSI
// 12S24018 - KELVIN  YOHANES PUTRA
import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judul, penulis, penerbit, formatBuku;
        int tahunTerbit, stok;
        double hargaPembelian, minimumMargin, rating;

        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        penerbit = input.nextLine();
        formatBuku = input.nextLine();
        tahunTerbit = Integer.parseInt(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        hargaPembelian = Double.parseDouble(input.nextLine());
        minimumMargin = Double.parseDouble(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        System.out.println(isbn + "|" + judul + "|" + penulis + "|" + penerbit + "|" + formatBuku + "|" + tahunTerbit + "|" + stok + "|" + hargaPembelian + "|" + minimumMargin + "|" + rating);
    }
}
