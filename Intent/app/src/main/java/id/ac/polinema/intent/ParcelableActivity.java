package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import id.ac.polinema.intent.model.user;

public class ParcelableActivity extends AppCompatActivity {
    private EditText username;
    private EditText name;
    private EditText age;
    public static final String USER_KEY = "halo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);
        username = findViewById(R.id.input_username);
        name = findViewById(R.id.input_name);
        age = findViewById(R.id.input_age);
    }

    public void HandleAndroidParcelable(View view) {
        String Username = username.getText().toString();
        String Name = name.getText().toString();
        int Age = Integer.parseInt(age.getText().toString());
        Intent intent = new Intent(this, ProfileParcelableActivity.class);
        user User = new user(Username, Name, Age);
        intent.putExtra(USER_KEY, User);
        startActivity(intent);
    }
}
