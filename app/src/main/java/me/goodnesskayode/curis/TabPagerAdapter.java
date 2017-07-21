package me.goodnesskayode.curis;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public TabPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.tabCount = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                PendingFragment pending = new PendingFragment();
                return pending;
            case 1:
                DoneFragment done = new DoneFragment();
                return done;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
