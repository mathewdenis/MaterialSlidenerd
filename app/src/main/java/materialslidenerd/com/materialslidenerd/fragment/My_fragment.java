package materialslidenerd.com.materialslidenerd.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import materialslidenerd.com.materialslidenerd.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class My_fragment extends Fragment {

    private TextView textView;
    public static My_fragment getInstance(int position)
    {
        My_fragment fragment = new My_fragment();
        Bundle args = new Bundle();
        args.putInt("position" , position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.my_fragment, container, false);
        textView = (TextView) layout.findViewById(R.id.position);

        Bundle bundle = getArguments();
        if(bundle != null){
            textView.setText("The selected page is: "+bundle.getInt("position"));
        }

        return layout;
    }


}
