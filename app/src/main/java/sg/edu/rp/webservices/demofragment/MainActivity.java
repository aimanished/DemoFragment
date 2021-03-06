package sg.edu.rp.webservices.demofragment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment F1 = new FragmentFirst();
        ft.replace(R.id.frame1,F1);

        Fragment F2 = new FragmentSecond();
        ft.replace(R.id.frame2,F2);
        ft.commit();
    }
}
