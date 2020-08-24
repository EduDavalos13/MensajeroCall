package com.example.mensajerocall.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.mensajerocall.Fragments.ContactosFragment;
import com.example.mensajerocall.Fragments.LlamadasFragment;
import com.example.mensajerocall.Fragments.MensajesFragment;
import com.example.mensajerocall.Fragments.PerfilFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    private int numberOfTabs;

    public PagerAdapter(@NonNull FragmentManager fm, int numberOfTabs) {
        super(fm, numberOfTabs);
        this.numberOfTabs = numberOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new ContactosFragment();
            case 1:
                return new LlamadasFragment();
            case 2:
                return new MensajesFragment();
            case 3:
                return new PerfilFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}