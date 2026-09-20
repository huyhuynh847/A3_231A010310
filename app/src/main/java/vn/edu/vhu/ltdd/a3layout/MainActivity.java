package vn.edu.vhu.ltdd.a3layout;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Kiểm tra Android đang dùng layout dọc hay ngang
        if (getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_LANDSCAPE) {

            Log.d("A3", "Hệ thống đã nạp layout: res/layout-land");

        } else {

            Log.d("A3", "Hệ thống đã nạp layout: res/layout");
        }

        // Nút ĐĂNG NHẬP
        View btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {

            Snackbar.make(
                    v,
                    getString(R.string.login_success),
                    Snackbar.LENGTH_SHORT
            ).show();

        });
    }
}