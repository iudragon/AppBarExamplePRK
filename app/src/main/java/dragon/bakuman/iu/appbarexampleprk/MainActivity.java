package dragon.bakuman.iu.appbarexampleprk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    Toolbar mToolbar;

    //handler for the recyclerView
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<String> mList;
    private RecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//ToolBar is the default action bar for this activity
        //if not it does not display the App Name!
        mToolbar = findViewById(R.id.toolBar);
        setSupportActionBar(mToolbar);

        mRecyclerView = findViewById(R.id.recyclerView);

        //for recyclerView we need 3 things: 1)Layout Manager 2) View Holder 3) Adapter

        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(mLayoutManager);

        mList = Arrays.asList(getResources().getStringArray(R.array.kpopGroups));


        mAdapter = new RecyclerAdapter(mList);

        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setAdapter(mAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        getMenuInflater().inflate(R.menu.app_bar_menu, menu);

        MenuItem menuItem = menu.findItem(R.id.action_share);
        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(this);

        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
       String userInput = s.toLowerCase();
       List<String> newList = new ArrayList<>();
       for (String list: mList){

           if (list.toLowerCase().contains(userInput)){

               newList.add(list);
           }
       }


       mAdapter.updateList(newList);

        return true;
    }
}