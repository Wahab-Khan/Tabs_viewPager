package com.example.khan.basicfragmenttest01;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by KHAN on 11/1/2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentAdapter(FragmentManager fm , Context context) {
        super(fm);
        this.context = context;
    }


    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new First();
            case 1:
                return new Secound();
            case 2:
                return new Third();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getString(R.string.first_page);
            case 1:
                return context.getString(R.string.secound_page);
            case 2:
                return context.getString(R.string.third_page);
            default:
                return null;
        }
    }


}
