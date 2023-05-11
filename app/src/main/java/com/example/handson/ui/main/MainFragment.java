package com.example.handson.ui.main;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.handson.R;
import com.example.handson.databinding.MainFragmentBinding;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final MainFragmentBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.main_fragment, container, false);

        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        binding.setFragment(this);
        binding.setViewModel(mViewModel);
        binding.setLifecycleOwner(getViewLifecycleOwner());

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public void onClick(View view) {
        // navigationで定義したMainFragmentからNextFragmentに遷移するactionのIDを指定する
        Navigation.findNavController(view).navigate(R.id.action_main_to_next);
    }
}