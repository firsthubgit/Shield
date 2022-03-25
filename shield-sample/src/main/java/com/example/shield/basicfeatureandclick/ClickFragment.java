package com.example.shield.basicfeatureandclick;

import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dianping.agentsdk.framework.AgentListConfig;
import com.example.shield.fragments.AbsExampleFragment;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by bingweizhou on 17/7/12.
 */

public class ClickFragment extends AbsExampleFragment {

    RecyclerView mRecyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRecyclerView = new RecyclerView(getContext());
        return mRecyclerView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setAgentContainerView(mRecyclerView);
    }

    @Override
    protected ArrayList<AgentListConfig> generaterDefaultConfigAgentList() {
        ArrayList<AgentListConfig> configs = new ArrayList<>();
        configs.add(new ClickAgentConfig());
        return configs;
    }

    @Override
    public String functionName() {
        return "Basic Feature&Click";
    }
}
