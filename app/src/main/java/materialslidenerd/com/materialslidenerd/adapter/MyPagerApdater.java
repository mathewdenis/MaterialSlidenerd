package materialslidenerd.com.materialslidenerd.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import materialslidenerd.com.materialslidenerd.R;
import materialslidenerd.com.materialslidenerd.fragment.My_fragment;

/**
 * Created by Dell on 10/16/2015.
 */
public class MyPagerApdater extends FragmentPagerAdapter {

    String[] tabs;
    Context context;

    public MyPagerApdater(FragmentManager fm , Context context) {
        super(fm);
        tabs = context.getResources().getStringArray(R.array.tabs);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
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
