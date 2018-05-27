package org.bitm.pencilbox.fragmentpb5;

import android.content.ContentValues;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mobile App on 5/26/2018.
 */

public class PersonAdapter extends ArrayAdapter<Person> {
    private Context context;
    private List<Person>persons;
    public PersonAdapter(@NonNull Context context, List<Person>persons) {
        super(context, R.layout.person_row, persons);
        this.context = context;
        this.persons = persons;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.person_row,parent,false);
        TextView nameTV = convertView.findViewById(R.id.row_name);
        TextView ageTV = convertView.findViewById(R.id.row_age);

        nameTV.setText(persons.get(position).getName());
        ageTV.setText(String.valueOf(persons.get(position).getAge()));
        return convertView;
    }
}
