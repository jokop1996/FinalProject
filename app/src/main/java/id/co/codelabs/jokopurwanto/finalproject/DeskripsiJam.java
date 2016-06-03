package id.co.codelabs.jokopurwanto.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DeskripsiJam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jam);

        // Jika Data String
        Intent i=getIntent();
        String dataTotal=i.getStringExtra(MainActivity.DATA_TOTAL5);
        TextView viewTotal=(TextView) findViewById(R.id.harga);
        String hasil=("Total Biaya : Rp. "+dataTotal);
        viewTotal.setAllCaps(true);
        viewTotal.setText(hasil);
    }
}
