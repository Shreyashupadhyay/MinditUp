package com.example.minditup;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;



public class MainActivity extends AppCompatActivity {
    MeowBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        bottomNavigation = findViewById(R.id.bottomNavigation);

        bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_home));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_goal));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_bott));
        bottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.ic_settings));
        bottomNavigation.add(new MeowBottomNavigation.Model(5, R.drawable.ic_profile));

        bottomNavigation.show(1, true);
        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                switch (model.getId()){
                    case 1:
                        replace(new HomeFragment());
                        break;

                    case 2:
                        replace(new GoalFragment());
                        break;

                    case 3:
                        replace(new BotFragment());
                        break;

                    case 4:
                        replace(new ActivityFragment());
                        break;

                    case 5:
                        replace(new ProfileFragment());
                        break;

                }
                return null;
            }
        });
        replace(new HomeFragment());

//        bottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
//            @Override
//            public Unit invoke(MeowBottomNavigation.Model model) {
//                Toast.makeText(MainActivity.this, "Selected !!", Toast.LENGTH_SHORT).show();
//                return null;
//            }
//        });
    }

    private void replace(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,fragment);
        transaction.commit();
    }

}