package id.co.codelabs.jokopurwanto.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailJam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_jam);

        Intent i=getIntent();
        String dataTotal=i.getStringExtra(MainActivity.DATA_TOTAL5);
        TextView viewHarga=(TextView) findViewById(R.id.harga);
        TextView viewTotal=(TextView) findViewById(R.id.total);
        String hasil=("Rp. "+dataTotal);
        viewHarga.setText(hasil);
        viewTotal.setText(hasil);
    }
}
