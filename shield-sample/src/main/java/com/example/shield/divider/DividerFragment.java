package com.example.shield.divider;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dianping.agentsdk.framework.AgentListConfig;
import com.dianping.shield.entity.PageDividerThemeParams;
import com.example.shield.fragments.AbsExampleFragment;

import java.util.ArrayList;

/**
 * Created by bingweizhou on 17/7/12.
 */

public class DividerFragment extends AbsExampleFragment {

    RecyclerView mRecyclerView;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
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
        setPageDividerTheme(PageDividerThemeParams.needLastFooter(false));
        setPageDividerTheme(PageDividerThemeParams.headerHeight(0));
//        setPageDividerTheme(PageDividerThemeParams.enableDivider(false));
    }

    @Override
    protected ArrayList<AgentListConfig> generaterDefaultConfigAgentList() {
        ArrayList<AgentListConfig> configs = new ArrayList<>();
        configs.add(new DividerAgentConfig());
        return configs;
    }

    @Override
    public String functionName() {
        return "Divider";
    }
}
