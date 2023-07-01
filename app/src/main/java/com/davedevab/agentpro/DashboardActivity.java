package com.davedevab.agentpro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;

    AgentAdapter agentAdapter;

    List<AgentItem> agentItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        viewPager2 = findViewById(R.id.agentsViewPager);

        List<AgentItem> agentItems = new ArrayList<>();

        agentItems.add(new AgentItem(R.drawable.mmxx_founder_card_large, R.drawable.brimstone_artwork_full, getString(R.string.brim_name), getString(R.string.controller_role), getString(R.string.brim_desc), R.drawable.stim_beacon, R.drawable.incendiary, R.drawable.sky_smoke, R.drawable.orbital_strike, getString(R.string.brim_ability_basic1_name), getString(R.string.brim_ability_basic2_name), getString(R.string.brim_ability_signature_name), getString(R.string.brim_ability_ultimate_name), getString(R.string.brim_ability_basic1_desc), getString(R.string.brim_ability_basic2_desc), getString(R.string.brim_ability_signature_desc), getString(R.string.brim_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.mmxx_founder_card_large, R.drawable.brimstone_artwork_full, "Nombre", "Role", "Descripción", R.drawable.stim_beacon, R.drawable.stim_beacon, R.drawable.stim_beacon, R.drawable.stim_beacon, "Habilidad", "Habilidad", "Habilidad", "Habilidad", "Descripción", "Descripción", "Descripción", "Descripción"));
        agentItems.add(new AgentItem(R.drawable.mmxx_founder_card_large, R.drawable.brimstone_artwork_full, "Nombre", "Role", "Descripción", R.drawable.stim_beacon, R.drawable.stim_beacon, R.drawable.stim_beacon, R.drawable.stim_beacon, "Habilidad", "Habilidad", "Habilidad", "Habilidad", "Descripción", "Descripción", "Descripción", "Descripción"));
        agentItems.add(new AgentItem(R.drawable.mmxx_founder_card_large, R.drawable.brimstone_artwork_full, "Nombre", "Role", "Descripción", R.drawable.stim_beacon, R.drawable.stim_beacon, R.drawable.stim_beacon, R.drawable.stim_beacon, "Habilidad", "Habilidad", "Habilidad", "Habilidad", "Descripción", "Descripción", "Descripción", "Descripción"));
        agentItems.add(new AgentItem(R.drawable.mmxx_founder_card_large, R.drawable.brimstone_artwork_full, "Nombre", "Role", "Descripción", R.drawable.stim_beacon, R.drawable.stim_beacon, R.drawable.stim_beacon, R.drawable.stim_beacon, "Habilidad", "Habilidad", "Habilidad", "Habilidad", "Descripción", "Descripción", "Descripción", "Descripción"));

        agentAdapter = new AgentAdapter(agentItems, this, this::moveToDetail);

        viewPager2.setAdapter(agentAdapter);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        viewPager2.setPageTransformer(compositePageTransformer);
        }
        public void moveToDetail(AgentItem agentItem){
        Intent intent = new Intent( DashboardActivity.this, AgentDetailActivity.class);
        intent.putExtra("ListElement", agentItem);
        startActivity(intent);
        finish();
        }
}
