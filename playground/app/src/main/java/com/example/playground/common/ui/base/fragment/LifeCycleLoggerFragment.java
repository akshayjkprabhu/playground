package com.example.playground.common.ui.base.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.*;
import com.example.playground.common.constants.AppConstants;
import com.example.playground.common.utils.Logger;

public abstract class LifeCycleLoggerFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        logFragmentCallbacks("onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        logFragmentCallbacks("onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        logFragmentCallbacks("onViewCreated");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        logFragmentCallbacks("onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        logFragmentCallbacks("onCreateOptionsMenu");
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        logFragmentCallbacks("onPrepareOptionsMenu");
        super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onStart() {
        logFragmentCallbacks("onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        logFragmentCallbacks("onResume");
        super.onResume();
    }

    @Override
    public void onStop() {
        logFragmentCallbacks("onStop");
        super.onStop();
    }

    @Override
    public void onPause() {
        logFragmentCallbacks("onPause");
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        logFragmentCallbacks("onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        logFragmentCallbacks("onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDestroyOptionsMenu() {
        logFragmentCallbacks("onDestroyOptionsMenu");
        super.onDestroyOptionsMenu();
    }

    @Override
    public void onDetach() {
        logFragmentCallbacks("onDetach");
        super.onDetach();
    }

    @Override
    public void onAttach(Context context) {
        logFragmentCallbacks("onAttach");
        super.onAttach(context);
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        logFragmentCallbacks("onAttachFragment : " + childFragment.getClass().getSimpleName());
        super.onAttachFragment(childFragment);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        logFragmentCallbacks("onActivityResult" + "\n"
                + "requestCode : " + requestCode + "\n"
                + "resultCode : " + resultCode);
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        logFragmentCallbacks("onRequestPermissionsResult" + "\n" + "requestCode : " + requestCode);
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    private void logFragmentCallbacks(String callback) {
        Logger.d(AppConstants.LogTag.FRAGMENT_CALLBACKS, this.getClass().getSimpleName() + " : " + callback);
    }
}
