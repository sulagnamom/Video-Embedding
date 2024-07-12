package com.example.video;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        VideoView dp=findViewById(R.id.dp);
        dp.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.dp1);
        MediaController mediaController=new MediaController(this);
        dp.setMediaController(mediaController);
        mediaController.setAnchorView(dp);
        dp.start();
    }
}



