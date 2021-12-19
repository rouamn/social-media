package com.example.socialmedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import com.example.socialmedia.Fragment.AddFragment;
import com.example.socialmedia.Fragment.HomeFragment;
import com.example.socialmedia.Fragment.NotificationFragment;
import com.example.socialmedia.Fragment.ProfileFragment;
import com.example.socialmedia.Fragment.SearchFragment;
import com.example.socialmedia.databinding.ActivityMainBinding;
import com.iammert.library.readablebottombar.ReadableBottomBar;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, new HomeFragment());
        transaction.commit(); // by default fel home
        binding.readableBottonBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            //Toast est une petite notification que l'application envoie aux utilisateurs, elle apparaît près du bas de l'écran (par défaut) et disparaît automatiquement lorsque le temps est écoulé.
            public void onItemSelected(int i) {
                FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();

                switch (i){
                    case 0:
                        transaction.replace(R.id.container, new HomeFragment());
                       // Toast.makeText(MainActivity.this,"Home Selected",Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        transaction.replace(R.id.container, new NotificationFragment());
                        break;
                    case 2:
                        transaction.replace(R.id.container, new AddFragment());
                        break;
                    case 3:
                        transaction.replace(R.id.container, new SearchFragment());
                        break;
                    case 4:
                        transaction.replace(R.id.container, new ProfileFragment());
                        break;
                }
                transaction.commit();

            }
        });
    }
}