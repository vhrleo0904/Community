package kr.co.itsco.community;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity /*implements ItemClickListener*/ {

    private RecyclerView postList;
    private RecyclerView.LayoutManager layoutManager;
    private PostAdapter adapter;
    private List<Post> posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);

        postList = findViewById(R.id.postList);

        PostDatabase db = PostDatabase.getAppDatabase(this);

        //PostDatabase database = Room.databaseBuilder(getApplicationContext(), PostDatabase.class, "Post").build();
//        Log.d("main", Integer.toString(db.postDAO().getAll().size()));

        /*adapter = new PostAdapter(posts, this);
        layoutManager = new LinearLayoutManager(this);
        postList.setLayoutManager(layoutManager);
        postList.setAdapter(adapter);*/
    }

/*    @Override
    public void onItemClick(View v, int position) {
        Intent intent = new Intent(this, PostActivity.class);
        intent.putExtra("id", position + 1);
        startActivity(intent);
    }*/
}