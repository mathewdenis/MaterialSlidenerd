package materialslidenerd.com.materialslidenerd.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import materialslidenerd.com.materialslidenerd.fragment.My_fragment;

/**
 * Created by Dell on 10/16/2015.
 */
public class MyPagerApdater extends FragmentPagerAdapter {

    public MyPagerApdater(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        My_fragment fragment = My_fragment.getInstance(position);
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
