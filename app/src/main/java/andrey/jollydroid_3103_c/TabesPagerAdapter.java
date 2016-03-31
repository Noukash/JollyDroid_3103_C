package andrey.jollydroid_3103_c;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Andrey on 31.03.2016.
 */
public class TabesPagerAdapter extends FragmentPagerAdapter {
    public TabesPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new Fragment_draw();
            case 1:
                return new Fragment_upload();
            case 2:
                return new Fragment_profit();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
