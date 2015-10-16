package materialslidenerd.com.materialslidenerd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import materialslidenerd.com.materialslidenerd.adapter.MyPagerApdater;
import materialslidenerd.com.materialslidenerd.tabs.SlidingTabLayout;

public class MainActivity extends ActionBarActivity {

    private Toolbar toolbar;
    private NavigationDrawerFragment navigationDrawerFragment;

    private ViewPager mPager;
    private SlidingTabLayout mTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.app_toolbar);
        setSupportActionBar(toolbar);

        mPager = (ViewPager) findViewById(R.id.viewpager);
        mTabs = (SlidingTabLayout) findViewById(R.id.tabs);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        navigationDrawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.nav_drawer_fragment);
        navigationDrawerFragment.setup(R.id.nav_drawer_fragment , (DrawerLayout)findViewById(R.id.drawerLayout) , toolbar);

        mPager.setAdapter(new MyPagerApdater(getSupportFragmentManager(), this));

        mTabs.setDistributeEvenly(true);
        mTabs.setCustomTabView(R.layout.custom_tab_view, R.id.tabText);
        mTabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.accent);
            }
        });
        mTabs.setViewPager(mPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }else if(id == R.id.action_about){
            startActivity(new Intent(this , ActivityB.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
