package com.example.edusoho.adapter;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class HomePagerAdapter extends FragmentPagerAdapter {

	private ArrayList<Fragment> fragments;
	
	public HomePagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments){
		super(fm);
		this.fragments = fragments;
	}
	
	
	@Override
	public Fragment getItem(int position) {
		return fragments.get(position);
	}

	@Override
	public int getCount() {
		return fragments.size();
	}

}
