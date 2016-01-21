package mapsloc.mobaires.com.locationandmaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLastLocation(View v) {
        startActivity(new Intent(this, LastKnownLocationActivity.class));
    }

    public void goToContinuousLocation(View v) {
        startActivity(new Intent(this, ContinuousLocationActivity.class));
    }

    public void goToMapExample(View v) {
        startActivity(new Intent(this, MapExampleActivity.class));
    }

}
