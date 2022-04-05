package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AhadethAdapter extends ArrayAdapter<Hadeeth> {
    List<Hadeeth> hadeethItem;
    public AhadethAdapter(@NonNull Context context, int resource, @NonNull List<Hadeeth> objects) {
        super(context, resource, objects);

        hadeethItem = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        Hadeeth currentItem=hadeethItem.get(position);
        TextView text = view.findViewById(R.id.hadeth);
        text.setText(currentItem.getHadeethtext());
        return view;

    }
}
