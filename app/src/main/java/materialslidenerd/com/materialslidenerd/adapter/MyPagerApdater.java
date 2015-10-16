package materialslidenerd.com.materialslidenerd.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Dell on 10/16/2015.
 */
public class MyPagerApdater extends FragmentPagerAdapter {

    public MyPagerApdater(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
