package materialslidenerd.com.materialslidenerd.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;

import materialslidenerd.com.materialslidenerd.R;
import materialslidenerd.com.materialslidenerd.fragment.My_fragment;

/**
 * Created by Dell on 10/16/2015.
 */
public class MyPagerApdater extends FragmentPagerAdapter {

    int icons[] = {R.drawable.ic_action_email , R.drawable.ic_action_refresh , R.drawable.ic_action_settings};
    String[] tabs;
    Context context;

    public MyPagerApdater(FragmentManager fm , Context context) {
        super(fm);
        this.context = context;
        tabs = context.getResources().getStringArray(R.array.tabs);
    }

    @Override
    public CharSequence getPageTitle(int position) {

        Drawable drawable = context.getResources().getDrawable(icons[position]);
        drawable.setBounds(0 , 0 , 36 ,36);
        ImageSpan imageSpan = new ImageSpan(drawable);
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(imageSpan , 0 , spannableString.length() , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
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
