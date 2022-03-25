package com.dianping.shield.manager.feature

import androidx.recyclerview.widget.RecyclerView;

interface CellManagerScrollListenerInterface {
    fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int)

    fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int)
}