package io.virtualapp.home.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import io.virtualapp.App;
import io.virtualapp.R;
import io.virtualapp.home.device.DeviceFragment;

/**
 * @author Lody
 */
public class DevicePagerAdapter extends FragmentPagerAdapter {
    private List<String> titles = new ArrayList<>();

    public DevicePagerAdapter(FragmentManager fm) {
        super(fm);
        titles.add(App.getApp().getResources().getString(R.string.title_user_device));
    }

    @Override
    public Fragment getItem(int position) {
        return DeviceFragment.newInstance();
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
