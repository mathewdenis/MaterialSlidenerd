package materialslidenerd.com.materialslidenerd.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import materialslidenerd.com.materialslidenerd.R;
import materialslidenerd.com.materialslidenerd.fragment.My_fragment;

/**
 * Created by Dell on 10/16/2015.
 */
public class MyPagerAdapterB extends FragmentStatePagerAdapter {

    int icons[] = {R.drawable.ic_action_email , R.drawable.ic_action_refresh , R.drawable.ic_action_settings ,
            R.drawable.ic_action_email , R.drawable.ic_action_refresh , R.drawable.ic_action_settings ,
            R.drawable.ic_action_email , R.drawable.ic_action_refresh , R.drawable.ic_action_settings ,
            R.drawable.icon_about};
    Context context;
    public MyPagerAdapterB(FragmentManager fm , Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return My_fragment.getInstance(position);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return context.getResources().getStringArray(R.array.tabs)[position];
    }

    public Drawable getIcons(int position){
        return context.getResources().getDrawable(icons[position]);
    }
}
