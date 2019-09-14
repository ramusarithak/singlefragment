package com.example.singlefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
         Configuration config=getResources().getConfiguration();


        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        if(config.orientation==Configuration.ORIENTATION_LANDSCAPE){
            LM_Fragement ls_fragment = new LM_Fragement();
            fragmentTransaction.replace(android.R.id.content, ls_fragment);
        }else{
            PM_Fragement pm_fragment = new PM_Fragement();
            fragmentTransaction.replace(android.R.id.content, pm_fragment);
        }
        fragmentTransaction.commit();

    }

}
