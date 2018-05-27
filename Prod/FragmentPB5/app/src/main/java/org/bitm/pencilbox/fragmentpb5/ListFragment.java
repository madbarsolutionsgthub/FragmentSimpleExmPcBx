package org.bitm.pencilbox.fragmentpb5;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {
    private static final String TAG = ListFragment.class.getSimpleName();
    private ListView listView;
    private PersonAdapter adapter;
    private ListFragmentListener listener;
    private Context context;


    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e(TAG, "onCreateView: ");
        View v = inflater.inflate(R.layout.fragment_list, container, false);
        listView = v.findViewById(R.id.listView);
        adapter = new PersonAdapter(getActivity(),generateList());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Person person = generateList().get(position);
                listener.getPerson(person);
            }
        });
        return v;
    }

    private List<Person> generateList(){
        List<Person>persons = new ArrayList<>();
        persons.add(new Person("abc",32,"Dhaka"));
        persons.add(new Person("fhsdkf",32,"Dhaka"));
        persons.add(new Person("absfc",32,"Dhaka"));
        persons.add(new Person("absdfewc",32,"Dhaka"));
        persons.add(new Person("erw",32,"Dhaka"));
        persons.add(new Person("fdfsd",32,"Dhaka"));
        return persons;
    }

    public interface ListFragmentListener{
        void getPerson(Person person);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
        listener = (ListFragmentListener) context;
        Log.e(TAG, "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "onActivityCreated");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e(TAG, "onViewCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }
}
