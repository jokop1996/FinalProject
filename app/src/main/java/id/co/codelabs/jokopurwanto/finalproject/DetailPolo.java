package id.co.codelabs.jokopurwanto.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailPolo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_polo);

        Intent i=getIntent();
        String dataTotal=i.getStringExtra(MainActivity.DATA_TOTAL3);
        TextView viewHarga=(TextView) findViewById(R.id.harga);
        TextView viewTotal=(TextView) findViewById(R.id.total);
        String hasil=("Rp. "+dataTotal);
        viewHarga.setText(hasil);
        viewTotal.setText(hasil);
    }
}
