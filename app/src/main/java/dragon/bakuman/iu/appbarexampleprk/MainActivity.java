package dragon.bakuman.iu.appbarexampleprk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //handler for the recyclerView
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<String> mList;
    private RecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mRecyclerView = findViewById(R.id.recyclerView);

        //for recyclerView we need 3 things: 1)Layout Manager 2) View Holder 3) Adapter

        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(mLayoutManager);

        mList = Arrays.asList(getResources().getStringArray(R.array.kpopGroups));


        mAdapter = new RecyclerAdapter(mList);

        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setAdapter(mAdapter);

    }
}