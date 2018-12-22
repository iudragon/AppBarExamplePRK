package dragon.bakuman.iu.appbarexampleprk;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class SecondActivity extends AppCompatActivity {

    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mToolbar = findViewById(R.id.toolBar);
        setSupportActionBar(mToolbar);

        //get handle to the supportactionbar through the toolbar

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


    }
}
