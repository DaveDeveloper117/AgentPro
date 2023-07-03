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
        agentItems.add(new AgentItem(R.drawable.unstoppable_viper_card_large, R.drawable.viper_artwork_full, getString(R.string.viper_name), getString(R.string.controller_role), getString(R.string.viper_desc), R.drawable.snake_bite, R.drawable.poison_cloud, R.drawable.toxic_screen, R.drawable.viper_pit, getString(R.string.viper_ability_basic1_name), getString(R.string.viper_ability_basic2_name), getString(R.string.viper_ability_signature_name), getString(R.string.viper_ability_ultimate_name), getString(R.string.viper_ability_basic1_desc), getString(R.string.viper_ability_basic2_desc), getString(R.string.viper_ability_signature_desc), getString(R.string.viper_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.unstoppable_omen_card_large, R.drawable.omen_artwork_full, getString(R.string.omen_name), getString(R.string.controller_role), getString(R.string.omen_desc), R.drawable.shrouded_step, R.drawable.paranoia, R.drawable.dark_cover, R.drawable.from_the_shadows, getString(R.string.omen_ability_basic1_name), getString(R.string.omen_ability_basic2_name), getString(R.string.omen_ability_signature_name), getString(R.string.omen_ability_ultimate_name), getString(R.string.omen_ability_basic1_desc), getString(R.string.omen_ability_basic2_desc), getString(R.string.omen_ability_signature_desc), getString(R.string.omen_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.killjoy_id_card_large, R.drawable.killjoy_artwork_full, getString(R.string.killjoy_name), getString(R.string.sentinel_role), getString(R.string.killjoy_desc), R.drawable.nanoswarm, R.drawable.alarmbot, R.drawable.turret, R.drawable.lockdown, getString(R.string.killjoy_ability_basic1_name), getString(R.string.killjoy_ability_basic2_name), getString(R.string.killjoy_ability_signature_name), getString(R.string.killjoy_ability_ultimate_name), getString(R.string.killjoy_ability_basic1_desc), getString(R.string.killjoy_ability_basic2_desc), getString(R.string.killjoy_ability_signature_desc), getString(R.string.killjoy_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.home_again_cypher_card_large, R.drawable.cypher_artwork_full, getString(R.string.cypher_name), getString(R.string.sentinel_role), getString(R.string.cypher_desc), R.drawable.trapwire, R.drawable.cyber_cage, R.drawable.spycam, R.drawable.neural_theft, getString(R.string.cypher_ability_basic1_name), getString(R.string.cypher_ability_basic2_name), getString(R.string.cypher_ability_signature_name), getString(R.string.cypher_ability_ultimate_name), getString(R.string.cypher_ability_basic1_desc), getString(R.string.cypher_ability_basic2_desc), getString(R.string.cypher_ability_signature_desc), getString(R.string.cypher_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.versus_sova_card_large, R.drawable.sova_artwork_full, getString(R.string.sova_name), getString(R.string.initiator_role), getString(R.string.sova_desc), R.drawable.owl_drone, R.drawable.shock_bolt, R.drawable.recon_bolt, R.drawable.hunter_fury, getString(R.string.sova_ability_basic1_name), getString(R.string.sova_ability_basic2_name), getString(R.string.sova_ability_signature_name), getString(R.string.sova_ability_ultimate_name), getString(R.string.sova_ability_basic1_desc), getString(R.string.sova_ability_basic2_desc), getString(R.string.sova_ability_signature_desc), getString(R.string.sova_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.unstoppable_sage_card_large, R.drawable.sage_artwork_full, getString(R.string.sage_name), getString(R.string.sentinel_role), getString(R.string.sage_desc), R.drawable.barrier_orb, R.drawable.slow_orb, R.drawable.healing_orb, R.drawable.resurrection, getString(R.string.sage_ability_basic1_name), getString(R.string.sage_ability_basic2_name), getString(R.string.sage_ability_signature_name), getString(R.string.sage_ability_ultimate_name), getString(R.string.sage_ability_basic1_desc), getString(R.string.sage_ability_basic2_desc), getString(R.string.sage_ability_signature_desc), getString(R.string.sage_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.unstoppable_phoenix_card_large, R.drawable.phoenix_artwork_full, getString(R.string.phoenix_name), getString(R.string.duelist_role), getString(R.string.phoenix_desc), R.drawable.blaze, R.drawable.curveball, R.drawable.hot_hands, R.drawable.run_it_back, getString(R.string.phoenix_ability_basic1_name), getString(R.string.phoenix_ability_basic2_name), getString(R.string.phoenix_ability_signature_name), getString(R.string.phoenix_ability_ultimate_name), getString(R.string.phoenix_ability_basic1_desc), getString(R.string.phoenix_ability_basic2_desc), getString(R.string.phoenix_ability_signature_desc), getString(R.string.phoenix_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.unstoppable_jett_card_large, R.drawable.jett_artwork_full, getString(R.string.jett_name), getString(R.string.duelist_role), getString(R.string.jett_desc), R.drawable.cloudburst, R.drawable.updraft, R.drawable.tailwind, R.drawable.blade_storm, getString(R.string.jett_ability_basic1_name), getString(R.string.jett_ability_basic2_name), getString(R.string.jett_ability_signature_name), getString(R.string.jett_ability_ultimate_name), getString(R.string.jett_ability_basic1_desc), getString(R.string.jett_ability_basic2_desc), getString(R.string.jett_ability_signature_desc), getString(R.string.jett_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.unstoppable_reyna_card_large, R.drawable.reyna_artwork_full, getString(R.string.reyna_name), getString(R.string.duelist_role), getString(R.string.reyna_desc), R.drawable.leer, R.drawable.devour, R.drawable.dismiss, R.drawable.empress, getString(R.string.reyna_ability_basic1_name), getString(R.string.reyna_ability_basic2_name), getString(R.string.reyna_ability_signature_name), getString(R.string.reyna_ability_ultimate_name), getString(R.string.reyna_ability_basic1_desc), getString(R.string.reyna_ability_basic2_desc), getString(R.string.reyna_ability_signature_desc), getString(R.string.reyna_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.raze_card_large, R.drawable.raze_artwork_full, getString(R.string.raze_name), getString(R.string.duelist_role), getString(R.string.raze_desc), R.drawable.boom_bot, R.drawable.blast_pack, R.drawable.paint_shells, R.drawable.showstopper, getString(R.string.raze_ability_basic1_name), getString(R.string.raze_ability_basic2_name), getString(R.string.raze_ability_signature_name), getString(R.string.raze_ability_ultimate_name), getString(R.string.raze_ability_basic1_desc), getString(R.string.raze_ability_basic2_desc), getString(R.string.raze_ability_signature_desc), getString(R.string.raze_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.breach_card_large, R.drawable.breach_artwork_full, getString(R.string.breach_name), getString(R.string.initiator_role), getString(R.string.breach_desc), R.drawable.aftershock, R.drawable.flashpoint, R.drawable.fault_line, R.drawable.rolling_thunder, getString(R.string.breach_ability_basic1_name), getString(R.string.breach_ability_basic2_name), getString(R.string.breach_ability_signature_name), getString(R.string.breach_ability_ultimate_name), getString(R.string.breach_ability_basic1_desc), getString(R.string.breach_ability_basic2_desc), getString(R.string.breach_ability_signature_desc), getString(R.string.breach_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.skye_card_large, R.drawable.skye_artwork_full, getString(R.string.skye_name), getString(R.string.initiator_role), getString(R.string.skye_desc), R.drawable.regrowth, R.drawable.trailblazer, R.drawable.guiding_light, R.drawable.seekers, getString(R.string.skye_ability_basic1_name), getString(R.string.skye_ability_basic2_name), getString(R.string.skye_ability_signature_name), getString(R.string.skye_ability_ultimate_name), getString(R.string.skye_ability_basic1_desc), getString(R.string.skye_ability_basic2_desc), getString(R.string.skye_ability_signature_desc), getString(R.string.skye_ability_ultimate_desc)));

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
