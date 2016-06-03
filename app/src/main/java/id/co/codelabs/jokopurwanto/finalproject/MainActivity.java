package id.co.codelabs.jokopurwanto.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    // =====================Yang Ke Pertama=====================
    public int angka = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Fungsi Tambah
    public void tambah(View view) {
        angka = angka + 1;
        angka(angka);
        totalHarga(angka);
    }

    // Fungsi Kurang
    public void kurang(View view) {
        angka = angka - 1;
        angka(angka);
        totalHarga(angka);
    }

    // Fungsi Tampilkan Angka
    public void angka(int angka) {
        Button btn=(Button) findViewById(R.id.angka);
        btn.setText(" " + angka);
    }

    // Fungsi Harga
    public void totalHarga(int angka){
        int total=angka*400000;
        TextView hasil=(TextView) findViewById(R.id.harga);
        hasil.setText("Rp. "+total);
    }


    public static final String DATA_ANGKA="";
    public static final String DATA_TOTAL="";

    // Intent Pindah Activity
    public void deskripsi(View view) {

        Intent i = new Intent(MainActivity.this, Deskripsi.class);
        // Jika Data String
        /*
        Button btn = (Button) findViewById(R.id.angka);
        String data_angka = btn.getText().toString();
        i.putExtra(DATA_ANGKA,data_angka);
        */
        int total=angka*400000;
        //String harga_total= String.valueOf(total);
        //i.putExtra(DATA_TOTAL,harga_total);
        i.putExtra("DATA",total);
        startActivity(i);
    }

    public void buy(View view) {
        Intent i = new Intent(MainActivity.this, DetailTransaksi.class);
        // Jika Data String
        /*
        Button btn = (Button) findViewById(R.id.angka);
        String data_angka = btn.getText().toString();
        i.putExtra(DATA_ANGKA,data_angka);
        */
        int total=angka*400000;
        String harga_total= String.valueOf(total);
        i.putExtra(DATA_TOTAL,harga_total);
        startActivity(i);
    }

    // =====================Yang Ke Dua=====================

    public int angka1 = 0;

    // Fungsi Tambah
    public void tambah1(View view) {
        angka1 = angka1 + 1;
        angka1(angka1);
        totalHarga1(angka1);
    }

    // Fungsi Kurang
    public void kurang1(View view) {
        angka1 = angka1 - 1;
        angka1(angka1);
        totalHarga1(angka1);
    }

    // Fungsi Tampilkan Angka
    public void angka1(int angka) {
        Button btn=(Button) findViewById(R.id.angka1);
        btn.setText(" " + angka);
    }

    // Fungsi Harga
    public void totalHarga1(int angka){
        int total=angka*900000;
        TextView hasil=(TextView) findViewById(R.id.harga1);
        hasil.setText("Rp. "+total);
    }

    public static final String DATA_TOTAL1="";

    // Intent Pindah Activity
    public void deskripsi1(View view) {
        Intent i = new Intent(MainActivity.this, DeskripsiIphone.class);
        // Jika Data String
        /*
        Button btn = (Button) findViewById(R.id.angka);
        String data_angka = btn.getText().toString();
        i.putExtra(DATA_ANGKA,data_angka);
        */
        int total=angka1*900000;
        String harga_total= String.valueOf(total);
        i.putExtra(DATA_TOTAL1,harga_total);
        startActivity(i);
    }

    public void buy1(View view) {
        Intent i = new Intent(MainActivity.this, DetailIphone.class);
        // Jika Data String
        /*
        Button btn = (Button) findViewById(R.id.angka);
        String data_angka = btn.getText().toString();
        i.putExtra(DATA_ANGKA,data_angka);
        */
        int total=angka1*900000;
        String harga_total= String.valueOf(total);
        i.putExtra(DATA_TOTAL1,harga_total);
        startActivity(i);
    }

    // =====================Yang Ke Tiga=====================

    public int angka2 = 0;

    // Fungsi Tambah
    public void tambah2(View view) {
        angka2 = angka2 + 1;
        angka2(angka2);
        totalHarga2(angka2);
    }

    // Fungsi Kurang
    public void kurang2(View view) {
        angka2 = angka2 - 1;
        angka2(angka2);
        totalHarga2(angka2);
    }

    // Fungsi Tampilkan Angka
    public void angka2(int angka) {
        Button btn=(Button) findViewById(R.id.angka2);
        btn.setText(" " + angka);
    }

    // Fungsi Harga
    public void totalHarga2(int angka){
        int total=angka*120000;
        TextView hasil=(TextView) findViewById(R.id.harga2);
        hasil.setText("Rp. "+total);
    }

    public static final String DATA_TOTAL2="";

    // Intent Pindah Activity
    public void deskripsi2(View view) {
        Intent i = new Intent(MainActivity.this, DeskripsiSandisk.class);
        // Jika Data String
        /*
        Button btn = (Button) findViewById(R.id.angka);
        String data_angka = btn.getText().toString();
        i.putExtra(DATA_ANGKA,data_angka);
        */
        int total=angka2*120000;
        String harga_total= String.valueOf(total);
        i.putExtra(DATA_TOTAL2,harga_total);
        startActivity(i);
    }

    public void buy2(View view) {
        Intent i = new Intent(MainActivity.this, DetailSandisk.class);
        // Jika Data String
        /*
        Button btn = (Button) findViewById(R.id.angka);
        String data_angka = btn.getText().toString();
        i.putExtra(DATA_ANGKA,data_angka);
        */
        int total=angka2*120000;
        String harga_total= String.valueOf(total);
        i.putExtra(DATA_TOTAL2,harga_total);
        startActivity(i);
    }

    // =====================Yang Ke Empat=====================

    public int angka3 = 0;

    // Fungsi Tambah
    public void tambah3(View view) {
        angka3 = angka3 + 1;
        angka3(angka3);
        totalHarga3(angka3);
    }

    // Fungsi Kurang
    public void kurang3(View view) {
        angka3 = angka3 - 1;
        angka3(angka3);
        totalHarga3(angka3);
    }

    // Fungsi Tampilkan Angka
    public void angka3(int angka) {
        Button btn=(Button) findViewById(R.id.angka3);
        btn.setText(" " + angka);
    }

    // Fungsi Harga
    public void totalHarga3(int angka){
        int total=angka*200000;
        TextView hasil=(TextView) findViewById(R.id.harga3);
        hasil.setText("Rp. "+total);
    }

    public static final String DATA_TOTAL3="";

    // Intent Pindah Activity
    public void deskripsi3(View view) {
        Intent i = new Intent(MainActivity.this, DeskripsiPolo.class);
        // Jika Data String
        /*
        Button btn = (Button) findViewById(R.id.angka);
        String data_angka = btn.getText().toString();
        i.putExtra(DATA_ANGKA,data_angka);
        */
        int total=angka3*200000;
        String harga_total= String.valueOf(total);
        i.putExtra(DATA_TOTAL3,harga_total);
        startActivity(i);
    }

    public void buy3(View view) {
        Intent i = new Intent(MainActivity.this, DetailPolo.class);
        // Jika Data String
        /*
        Button btn = (Button) findViewById(R.id.angka);
        String data_angka = btn.getText().toString();
        i.putExtra(DATA_ANGKA,data_angka);
        */
        int total=angka3*200000;
        String harga_total= String.valueOf(total);
        i.putExtra(DATA_TOTAL3,harga_total);
        startActivity(i);
    }

    // =====================Yang Ke Lima=====================

    public int angka4 = 0;

    // Fungsi Tambah
    public void tambah4(View view) {
        angka4 = angka4 + 1;
        angka4(angka4);
        totalHarga4(angka4);
    }

    // Fungsi Kurang
    public void kurang4(View view) {
        angka4 = angka4 - 1;
        angka4(angka4);
        totalHarga4(angka4);
    }

    // Fungsi Tampilkan Angka
    public void angka4(int angka) {
        Button btn=(Button) findViewById(R.id.angka4);
        btn.setText(" " + angka);
    }

    // Fungsi Harga
    public void totalHarga4(int angka){
        int total=angka*800000;
        TextView hasil=(TextView) findViewById(R.id.harga4);
        hasil.setText("Rp. "+total);
    }

    public static final String DATA_TOTAL4="";

    // Intent Pindah Activity
    public void deskripsi4(View view) {
        Intent i = new Intent(MainActivity.this, DeskripsiXiaomi.class);
        // Jika Data String
        /*
        Button btn = (Button) findViewById(R.id.angka);
        String data_angka = btn.getText().toString();
        i.putExtra(DATA_ANGKA,data_angka);
        */
        int total=angka4*800000;
        String harga_total= String.valueOf(total);
        i.putExtra(DATA_TOTAL4,harga_total);
        startActivity(i);
    }

    public void buy4(View view) {
        Intent i = new Intent(MainActivity.this, DetailXiaomi.class);
        // Jika Data String
        /*
        Button btn = (Button) findViewById(R.id.angka);
        String data_angka = btn.getText().toString();
        i.putExtra(DATA_ANGKA,data_angka);
        */
        int total=angka4*800000;
        String harga_total= String.valueOf(total);
        i.putExtra(DATA_TOTAL4,harga_total);
        startActivity(i);
    }

    // =====================Yang Ke Enam=====================

    public int angka5 = 0;

    // Fungsi Tambah
    public void tambah5(View view) {
        angka5 = angka5 + 1;
        angka5(angka5);
        totalHarga5(angka5);
    }

    // Fungsi Kurang
    public void kurang5(View view) {
        angka5 = angka5 - 1;
        angka5(angka5);
        totalHarga5(angka5);
    }

    // Fungsi Tampilkan Angka
    public void angka5(int angka) {
        Button btn=(Button) findViewById(R.id.angka5);
        btn.setText(" " + angka);
    }

    // Fungsi Harga
    public void totalHarga5(int angka){
        int total=angka*250000;
        TextView hasil=(TextView) findViewById(R.id.harga5);
        hasil.setText("Rp. "+total);
    }

    public static final String DATA_TOTAL5="";

    // Intent Pindah Activity
    public void deskripsi5(View view) {
        Intent i = new Intent(MainActivity.this, DeskripsiJam.class);
        // Jika Data String
        /*
        Button btn = (Button) findViewById(R.id.angka);
        String data_angka = btn.getText().toString();
        i.putExtra(DATA_ANGKA,data_angka);
        */
        int total=angka5*250000;
        String harga_total= String.valueOf(total);
        i.putExtra(DATA_TOTAL5,harga_total);
        startActivity(i);
    }

    public void buy5(View view) {
        Intent i = new Intent(MainActivity.this, DetailJam.class);
        // Jika Data String
        /*
        Button btn = (Button) findViewById(R.id.angka);
        String data_angka = btn.getText().toString();
        i.putExtra(DATA_ANGKA,data_angka);
        */
        int total=angka5*250000;
        String harga_total= String.valueOf(total);
        i.putExtra(DATA_TOTAL5,harga_total);
        startActivity(i);
    }

}
