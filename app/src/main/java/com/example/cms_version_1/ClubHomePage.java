package com.example.cms_version_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ClubHomePage extends AppCompatActivity {
    private Button so;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_home_page);

        so= findViewById(R.id.CSignOut);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        Toast.makeText(this, "Welcome Back " + user.getDisplayName(), Toast.LENGTH_SHORT).show();
  //      Toast.makeText(this, "Welcome Back " + user.getEmail(), Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, "Welcome Back " + user.getUid(), Toast.LENGTH_SHORT).show();

        so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ClubHomePage.this, "Signing Out...", Toast.LENGTH_SHORT).show();
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });

    }
}
