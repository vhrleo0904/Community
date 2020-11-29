package kr.co.itsco.community;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostItemViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView textViewTitle;

    public PostItemViewHolder(@NonNull View itemView) {
        super(itemView);
        this.imageView = itemView.findViewById(R.id.imageView);
        this.textViewTitle = itemView.findViewById(R.id.textViewTitle);
    }
}
