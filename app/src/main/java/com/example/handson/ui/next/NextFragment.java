package com.example.handson.ui.next;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.handson.R;
import com.example.handson.databinding.MainFragmentBinding;
import com.example.handson.databinding.NextFragmentBinding;

public class NextFragment extends Fragment {

    private NextViewModel mViewModel;

    public static NextFragment newInstance() {
        return new NextFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final NextFragmentBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.next_fragment, container, false);

        mViewModel = new ViewModelProvider(this).get(NextViewModel.class);

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
        // navigationで定義したNextFragmentからMainFragmentに遷移するactionのIDを指定する
        Navigation.findNavController(view).navigate(R.id.action_next_to_main);
    }
}