package com.example.infs3605;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.infs3605.Entities.DiscussionThread;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;


public class DiscussionThreadAdapter extends RecyclerView.Adapter<DiscussionThreadAdapter.ViewHolder> implements Filterable {
    private ArrayList<DiscussionThread> mDiscussionThreads, mDiscussionThreadsFiltered;
    private DiscussionThread discussionThread;
    private static final String TAG = "DiscussionThreadAdapter";
    private RecyclerViewClickListener mListener;
    private Context context;
    private FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

    public DiscussionThreadAdapter(ArrayList<DiscussionThread> discussionThreads, RecyclerViewClickListener listener) {
        mDiscussionThreads = discussionThreads;
        mDiscussionThreadsFiltered = discussionThreads;
        mListener = listener;
    }



    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                String charString = constraint.toString();
                // If no input, use the default Array List
                if(charString.isEmpty()) {
                    mDiscussionThreadsFiltered = mDiscussionThreads;
                    // Use a for loop to go through the Movies Array List
                } else {
                    ArrayList<DiscussionThread> filteredList = new ArrayList<>();
                    for(DiscussionThread discussionThread : mDiscussionThreadsFiltered) {
                        // If the String contains any characters that are in the Movie Title (all converted to lower case), add the movie to the filtered List
                        if(discussionThread.getTitle().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(discussionThread);
                            // Filter for Genre as well
                        } else if(discussionThread.getAuthor().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(discussionThread);
                        }
                    }
                    // Add the filtered list to the Movies Filtered Array List
                    mDiscussionThreadsFiltered = filteredList;
                }
                // Return the Filter Results
                FilterResults filterResults = new FilterResults();
                filterResults.values = mDiscussionThreadsFiltered;
                return filterResults;
            }

            // Display the results and notify the data set that it has been changes
            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                mDiscussionThreadsFiltered = (ArrayList<DiscussionThread>) results.values;
                notifyDataSetChanged();
            }

        };

    }

    public interface RecyclerViewClickListener {
        void onClick(View v,String threadID, String title, String author, String authorID, Date postTime, String post);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView tvTitle, tvAuthor, tvPostTime, tvReplies;

        private RecyclerViewClickListener mListener;

        public ViewHolder(@NonNull View itemView, RecyclerViewClickListener listener) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvAuthor = itemView.findViewById(R.id.tvAuthor);
            tvPostTime = itemView.findViewById(R.id.tvPostTime);
            tvReplies = itemView.findViewById(R.id.tvReplies);

            mListener = listener;
            itemView.setOnClickListener(this);
        }



        @Override
        public void onClick(View v) {
            discussionThread = mDiscussionThreadsFiltered.get(getAdapterPosition());
            mListener.onClick(v,discussionThread.getThreadID(), discussionThread.getTitle(), discussionThread.getAuthor(), discussionThread.getAuthorID(),  discussionThread.getPostTime(), discussionThread.getPost());

        }
    }

    @NonNull
    @Override
    public DiscussionThreadAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.discussion_thread_item, parent, false);
        return new ViewHolder(view, mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        discussionThread = mDiscussionThreadsFiltered.get(position);

        holder.tvTitle.setText(discussionThread.getTitle());
        if (discussionThread.getAuthorID().equals(user.getUid())){
            holder.tvAuthor.setTextColor(Color.parseColor("#71C453"));
            holder.tvAuthor.setText(discussionThread.getAuthor());
        } else {
            holder.tvAuthor.setText(discussionThread.getAuthor());
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm aaa");
        String date = dateFormat.format(discussionThread.getPostTime());
        holder.tvPostTime.setText("Posted: " + date);
        if(discussionThread.getNumberOfReplies() == 1) {
            holder.tvReplies.setText("" + (discussionThread.getNumberOfReplies()) + " Reply");
        } else {
            holder.tvReplies.setText("" + (discussionThread.getNumberOfReplies()) + " Replies");
        }


    }

    @Override
    public int getItemCount() {
        return mDiscussionThreadsFiltered.size();
    }

    public void sort() {
        Collections.sort(mDiscussionThreadsFiltered, new Comparator<DiscussionThread>() {
            @Override
            public int compare(DiscussionThread o1, DiscussionThread o2) {
                return(o2.getPostTime().compareTo(o1.getPostTime()));

            }
        });

        notifyDataSetChanged();
    }

}


