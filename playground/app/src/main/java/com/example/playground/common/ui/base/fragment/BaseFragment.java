package com.example.playground.common.ui.base.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
 * Copyright © 2018, DB Corp,
 * Written under contract by Robosoft Technologies Pvt. Ltd.
 */
public abstract class BaseFragment extends LifeCycleLoggerFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflateView(inflater, container);
    }

    private View inflateView(LayoutInflater inflater, ViewGroup container) {
        readFromBundle();
        return inflater.inflate(getLayoutResourceId(), container);
    }

    private void readFromBundle() {
        if (getArguments() != null) {
            readFromBundle(getArguments());
        }
    }

    protected abstract void readFromBundle(@NonNull Bundle arguments);

    /**
     * should return the layout resourceId
     *
     * @return resourceId of layout
     */
    protected abstract int getLayoutResourceId();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
    }

    protected abstract void initViews();

    protected String getTAG() {
        return this.getClass().getSimpleName();
    }
}
