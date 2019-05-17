package com.example.codingchallenge.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.codingchallenge.R;

import java.util.LinkedHashSet;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    frameLayout = (FrameLayout)findViewById(R.id.frameLayout);

        //removeDuplicateElementsFromString("AAA");
        //removeDuplicateElementsFromString("");
        //removeDuplicateElementsFromString(null);
        replaceFragment(MainFragment.newInstance());
    }

    private void replaceFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, fragment, "mainFragment");
        transaction.commit();

    }

/*public String removeDuplicateElementsFromString(String value){
        if(!value.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            LinkedHashSet<Character> hashSet = new LinkedHashSet<>();
            for (int i = 0; i < value.length(); i++) {
                hashSet.add(value.charAt(i));
            }

            for (Character c : hashSet) {
                stringBuilder.append(c);
            }

            return stringBuilder.toString();
        }else return "error";
    }*/
}
