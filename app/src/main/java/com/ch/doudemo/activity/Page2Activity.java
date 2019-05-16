package com.ch.doudemo.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ch.doudemo.R;
import com.ch.doudemo.base.BaseRecAdapter;
import com.ch.doudemo.base.BaseRecViewHolder;
import com.ch.doudemo.fragment.Page2Fragment;
import com.ch.doudemo.widget.MyVideoPlayer;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.jzvd.JZVideoPlayer;
import cn.jzvd.JZVideoPlayerStandard;

/**
 * 翻页2
 */
public class Page2Activity extends BaseActivity {

    @BindView(R.id.vp)
    ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        ButterKnife.bind(this);
        initView();
        addListener();
    }

    private void initView() {
        vp.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return new Page2Fragment();
            }

            @Override
            public int getCount() {
                return 3;
            }
        });
        vp.setOffscreenPageLimit(1);
        vp.setCurrentItem(1);
    }

    private void addListener() {

    }
}
