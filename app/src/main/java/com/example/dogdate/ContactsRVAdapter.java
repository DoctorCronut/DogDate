package com.example.dogdate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContactsRVAdapter extends RecyclerView.Adapter<ContactsRVAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    private List<Contacts> mContacts;
    private Context mContext;

    public ContactsRVAdapter(Context context, ArrayList<Contacts> contacts){
        mContacts = contacts;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View contactsView = inflater.inflate(R.layout.contacts_row, parent, false);
        return new ViewHolder(contactsView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contacts contacts = mContacts.get(position);
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

}
