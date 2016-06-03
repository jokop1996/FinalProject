package id.co.codelabs.jokopurwanto.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Deskripsi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        // Jika Data Integer
        /*
        Button btn_angka=(Button) findViewById(R.id.angkaBaru);
        Bundle b = getIntent().getExtras();
        int tmp_angka = b.getInt("angka");
        btn_angka.setText(tmp_angka);
        */


        // Jika Data String
        Intent i=getIntent();
        String dataTotal=i.getStringExtra(MainActivity.DATA_TOTAL);
        TextView viewTotal=(TextView) findViewById(R.id.harga);
        String hasil=("Total Biaya : Rp. "+dataTotal);
        viewTotal.setAllCaps(true);
        viewTotal.setText(hasil);
    }

}
