package dragon.bakuman.iu.appbarexampleprk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

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
}
