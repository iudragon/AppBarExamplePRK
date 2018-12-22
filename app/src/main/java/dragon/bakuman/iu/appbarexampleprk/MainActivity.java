package dragon.bakuman.iu.appbarexampleprk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //ToolBar is the default action bar for this activity
        //if not it does not display the App Name!
        mToolbar = findViewById(R.id.toolBar);
        setSupportActionBar(mToolbar);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.app_bar_menu, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_share:
                Toast.makeText(this, "Share option selected", Toast.LENGTH_SHORT).show();
                return true;


            case R.id.action_settings:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }

    public void startAnotherActivity(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
