package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void update(View view) {
        Uri webpage = Uri.parse("http://www.kawalcovid19.id");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void call(View view) {
        String phoneNumber = "081210841382";
        Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
        startActivity(dialPhoneIntent);
    }

    public void login(View view) {
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(intent);
    }

    public void donasi(View view) {
        Intent intent = new Intent(Main2Activity.this, Main4Activity.class);
        startActivity(intent);
    }
    public void maps(View view) {
    Uri location = Uri.parse("geo:0,0?+Jakarta");
    Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
}
}


