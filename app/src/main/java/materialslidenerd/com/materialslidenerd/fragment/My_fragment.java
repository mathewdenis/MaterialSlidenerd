package materialslidenerd.com.materialslidenerd.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import materialslidenerd.com.materialslidenerd.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class My_fragment extends Fragment {


    public My_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.my_fragment, container, false);
        return layout;
    }


}
