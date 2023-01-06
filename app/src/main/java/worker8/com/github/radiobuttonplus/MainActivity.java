package worker8.com.github.radiobuttonplus;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import worker8.com.github.radiogroupplus.RadioGroupPlus;

public class MainActivity extends AppCompatActivity {
    RadioGroupPlus mRadioGroupPlus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRadioGroupPlus = findViewById(R.id.radio_group_plus);
        mRadioGroupPlus.setOnCheckedChangeListener((radioGroupPlus, i) -> {
            Log.i("RadioGroupPlus", "onCheckedChanged:");
        });

    }

    public void onOrderClicked(View view) {
        if (R.id.rb_latte == mRadioGroupPlus.getCheckedRadioButtonId()) {
            Toast.makeText(MainActivity.this, "Latte", Toast.LENGTH_SHORT).show();
        } else if (R.id.rb_mocha == mRadioGroupPlus.getCheckedRadioButtonId()) {
            Toast.makeText(MainActivity.this, "Mocha", Toast.LENGTH_SHORT).show();
        } else if (R.id.rb_americano == mRadioGroupPlus.getCheckedRadioButtonId()) {
            Toast.makeText(MainActivity.this, "Americano", Toast.LENGTH_SHORT).show();
        } else if (R.id.rb_espresso == mRadioGroupPlus.getCheckedRadioButtonId()) {
            Toast.makeText(MainActivity.this, "Espresso", Toast.LENGTH_SHORT).show();
        } else if (R.id.rb_orange == mRadioGroupPlus.getCheckedRadioButtonId()) {
            Toast.makeText(MainActivity.this, "Orange", Toast.LENGTH_SHORT).show();
        } else if (R.id.rb_butter == mRadioGroupPlus.getCheckedRadioButtonId()) {
            Toast.makeText(MainActivity.this, "Butter", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "No Drinks :(", Toast.LENGTH_SHORT).show();
        }
    }
}
