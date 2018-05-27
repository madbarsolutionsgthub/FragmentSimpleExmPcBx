package org.bitm.pencilbox.fragmentpb5;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements ListFragment.ListFragmentListener{

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ListFragment listFragment = new ListFragment();
        ft.add(R.id.fragmentContainer,listFragment);
        ft.addToBackStack(null);
        ft.commit();
        Log.e(TAG, "onCreate");
    }

    @Override
    public void getPerson(Person person) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        HomeFragment homeFragment = new HomeFragment();
        Bundle b = new Bundle();
        b.putSerializable("person",person);
        homeFragment.setArguments(b);
        ft.replace(R.id.fragmentContainer,homeFragment);
        ft.addToBackStack(null);
        ft.commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }
}
