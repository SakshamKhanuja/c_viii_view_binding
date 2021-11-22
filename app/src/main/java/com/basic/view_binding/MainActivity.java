package com.basic.view_binding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;

import com.basic.view_binding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing View Binding for layout "activity_main.xml" by using LayoutInflater.
        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(
                (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE));

        // Get Root View.
        View rootView = activityMainBinding.getRoot();

        // Set content for this Activity.
        setContentView(rootView);

        /*
         * We can now avoid using "findViewById" method to access UI elements. We'll use the
         * binding instance from now on:
         *
         * LayoutBinding.ViewName.<...>
         */

        // Making contents of TextView with ID "two" to CAPS.
        activityMainBinding.textViewTwo.setAllCaps(true);

        // Changing the size of TextView with ID "one" to 36sp.
        activityMainBinding.textViewOne.setTextSize(TypedValue.COMPLEX_UNIT_SP, 36F);
    }
}