package com.example.bookreader.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookreader.R;
import com.example.bookreader.model.BookModel;

import java.util.ArrayList;

public class BookAdepter extends RecyclerView.Adapter<BookAdepter.MyViewHolder> {
    private ArrayList<BookModel> bookData;

    private MyViewHolder.OnBookListener mOnBookListener;


    public BookAdepter(ArrayList<BookModel> bookData) {

        this.bookData = bookData;
    }

    @NonNull
    @Override
    public BookAdepter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.custom_cardview, parent,false);
        return new BookAdepter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookAdepter.MyViewHolder holder, int position) {
        holder.bookName.setText(bookData.get(position).getBookName());
        holder.bookImage.setImageResource(bookData.get(position).getBookImage());
    }

    @Override
    public int getItemCount() {
        return bookData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView bookImage;
        TextView bookName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            bookImage = itemView.findViewById(R.id.book_image);
            bookName = itemView.findViewById(R.id.book_name);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

        }

        public interface OnBookListener{
            void onBookClick(int position);
        }
    }
}
