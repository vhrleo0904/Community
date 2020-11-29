package kr.co.itsco.community;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostItemViewHolder> {

    private List<Post> posts;
    private ItemClickListener listener;

    public PostAdapter(List<Post> posts, ItemClickListener listener) {
        this.posts = posts;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PostItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater
                .from(viewGroup.getContext())
                .inflate(R.layout.item_post, viewGroup, false);
        return new PostItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PostItemViewHolder holder, int i) {
        Post post = posts.get(i);

        byte[] image = post.getImage();
        Bitmap bitmap = BitmapFactory.decodeByteArray(image, 0, image.length);
        String title = post.getTitle();

        holder.imageView.setImageBitmap(bitmap);
        holder.textViewTitle.setText(title);

        holder.itemView.setOnClickListener(v -> {
            listener.onItemClick(v, i);
        });
    }

    @Override
    public int getItemCount() {
        if(posts == null)
            return 0;
        else
            return posts.size();
    }
}
