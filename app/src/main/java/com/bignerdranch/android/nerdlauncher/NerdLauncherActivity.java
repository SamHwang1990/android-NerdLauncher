package com.bignerdranch.android.nerdlauncher;

import android.support.v4.app.Fragment;

public class NerdLauncherActivity extends SimpleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newInstance();
    }
}
