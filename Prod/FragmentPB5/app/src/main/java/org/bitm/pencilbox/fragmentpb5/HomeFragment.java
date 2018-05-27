package org.bitm.pencilbox.fragmentpb5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Person person = (Person) getArguments().getSerializable("person");
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        TextView tv = v.findViewById(R.id.detailsTV);
        if(person != null){
            tv.setText(person.getName()+"\n"+person.getAge()+"\n"+person.getCity());
        }
        return v;
    }

}
