package com.khilman.messagebox;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // deklarasi global variable
    Button btnToast, btnAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // inisialisasi
        btnToast = (Button) findViewById(R.id.btnToast);
        btnAlert = (Button) findViewById(R.id.btnAlert);

        // beri event/aksi pada tombol toast
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // aksi yang akan di jalankan
                Toast.makeText(MainActivity.this, "Tombol toast di tekan", Toast.LENGTH_SHORT).show();
            }
        });
        // beri event/aksi pada tombol alert
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // aksi yang akand di jalankan
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                // beri judul
                alert.setTitle("Konfirmasi");
                // beri isi pesan yang akan di tampilkan
                alert.setMessage("Anda yakin ingin keluar ?");
                // tambahkan tombol ya
                alert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // aksi yang akan di jalankan
                        System.exit(0);
                    }
                });
                // tambahkan tombol tidak
                alert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // aksi yang akan di jalankan
                        Toast.makeText(MainActivity.this, "Tombol tidak di pilih", Toast.LENGTH_SHORT).show();

                    }
                });
                // tambahkan tombol batal
                alert.setNeutralButton("Batal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // aksi yang akan di jalankan
                        Toast.makeText(MainActivity.this, "Tombol batal di pilih", Toast.LENGTH_SHORT).show();

                    }
                });
                // tampilkan alert dialog
                alert.show();
            }
        });


    }
}
