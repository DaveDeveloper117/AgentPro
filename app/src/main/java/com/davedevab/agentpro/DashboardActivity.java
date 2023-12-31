package com.davedevab.agentpro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    AgentAdapter agentAdapter;
    List<AgentItem> agentItems;
    private final Handler autoScrollHandler = new Handler();
    private int currentItem = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        viewPager2 = findViewById(R.id.agentsViewPager);
        viewPager2.setPageTransformer(new HalfwaySlideTransformer());

        agentItems = new ArrayList<>();

        agentItems.add(new AgentItem(R.drawable.mmxx_founder_card_large, R.drawable.brimstone_artwork_full, getString(R.string.brim_name), getString(R.string.controller_role), getString(R.string.brim_desc), R.drawable.stim_beacon, R.drawable.incendiary, R.drawable.sky_smoke, R.drawable.orbital_strike, getString(R.string.brim_ability_basic1_name), getString(R.string.brim_ability_basic2_name), getString(R.string.brim_ability_signature_name), getString(R.string.brim_ability_ultimate_name), getString(R.string.brim_ability_basic1_desc), getString(R.string.brim_ability_basic2_desc), getString(R.string.brim_ability_signature_desc), getString(R.string.brim_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.unstoppable_viper_card_large, R.drawable.viper_artwork_full, getString(R.string.viper_name), getString(R.string.controller_role), getString(R.string.viper_desc), R.drawable.snake_bite, R.drawable.poison_cloud, R.drawable.toxic_screen, R.drawable.viper_pit, getString(R.string.viper_ability_basic1_name), getString(R.string.viper_ability_basic2_name), getString(R.string.viper_ability_signature_name), getString(R.string.viper_ability_ultimate_name), getString(R.string.viper_ability_basic1_desc), getString(R.string.viper_ability_basic2_desc), getString(R.string.viper_ability_signature_desc), getString(R.string.viper_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.unstoppable_omen_card_large, R.drawable.omen_artwork_full, getString(R.string.omen_name), getString(R.string.controller_role), getString(R.string.omen_desc), R.drawable.shrouded_step, R.drawable.paranoia, R.drawable.dark_cover, R.drawable.from_the_shadows, getString(R.string.omen_ability_basic1_name), getString(R.string.omen_ability_basic2_name), getString(R.string.omen_ability_signature_name), getString(R.string.omen_ability_ultimate_name), getString(R.string.omen_ability_basic1_desc), getString(R.string.omen_ability_basic2_desc), getString(R.string.omen_ability_signature_desc), getString(R.string.omen_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.killjoy_card_large, R.drawable.killjoy_artwork_full, getString(R.string.killjoy_name), getString(R.string.sentinel_role), getString(R.string.killjoy_desc), R.drawable.nanoswarm, R.drawable.alarmbot, R.drawable.turret, R.drawable.lockdown, getString(R.string.killjoy_ability_basic1_name), getString(R.string.killjoy_ability_basic2_name), getString(R.string.killjoy_ability_signature_name), getString(R.string.killjoy_ability_ultimate_name), getString(R.string.killjoy_ability_basic1_desc), getString(R.string.killjoy_ability_basic2_desc), getString(R.string.killjoy_ability_signature_desc), getString(R.string.killjoy_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.cypher_card_large, R.drawable.cypher_artwork_full, getString(R.string.cypher_name), getString(R.string.sentinel_role), getString(R.string.cypher_desc), R.drawable.trapwire, R.drawable.cyber_cage, R.drawable.spycam, R.drawable.neural_theft, getString(R.string.cypher_ability_basic1_name), getString(R.string.cypher_ability_basic2_name), getString(R.string.cypher_ability_signature_name), getString(R.string.cypher_ability_ultimate_name), getString(R.string.cypher_ability_basic1_desc), getString(R.string.cypher_ability_basic2_desc), getString(R.string.cypher_ability_signature_desc), getString(R.string.cypher_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.sova_card_large, R.drawable.sova_artwork_full, getString(R.string.sova_name), getString(R.string.initiator_role), getString(R.string.sova_desc), R.drawable.owl_drone, R.drawable.shock_bolt, R.drawable.recon_bolt, R.drawable.hunter_fury, getString(R.string.sova_ability_basic1_name), getString(R.string.sova_ability_basic2_name), getString(R.string.sova_ability_signature_name), getString(R.string.sova_ability_ultimate_name), getString(R.string.sova_ability_basic1_desc), getString(R.string.sova_ability_basic2_desc), getString(R.string.sova_ability_signature_desc), getString(R.string.sova_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.sage_card_large, R.drawable.sage_artwork_full, getString(R.string.sage_name), getString(R.string.sentinel_role), getString(R.string.sage_desc), R.drawable.barrier_orb, R.drawable.slow_orb, R.drawable.healing_orb, R.drawable.resurrection, getString(R.string.sage_ability_basic1_name), getString(R.string.sage_ability_basic2_name), getString(R.string.sage_ability_signature_name), getString(R.string.sage_ability_ultimate_name), getString(R.string.sage_ability_basic1_desc), getString(R.string.sage_ability_basic2_desc), getString(R.string.sage_ability_signature_desc), getString(R.string.sage_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.phoenix_card_large, R.drawable.phoenix_artwork_full, getString(R.string.phoenix_name), getString(R.string.duelist_role), getString(R.string.phoenix_desc), R.drawable.blaze, R.drawable.curveball, R.drawable.hot_hands, R.drawable.run_it_back, getString(R.string.phoenix_ability_basic1_name), getString(R.string.phoenix_ability_basic2_name), getString(R.string.phoenix_ability_signature_name), getString(R.string.phoenix_ability_ultimate_name), getString(R.string.phoenix_ability_basic1_desc), getString(R.string.phoenix_ability_basic2_desc), getString(R.string.phoenix_ability_signature_desc), getString(R.string.phoenix_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.jett_card_large, R.drawable.jett_artwork_full, getString(R.string.jett_name), getString(R.string.duelist_role), getString(R.string.jett_desc), R.drawable.cloudburst, R.drawable.updraft, R.drawable.tailwind, R.drawable.blade_storm, getString(R.string.jett_ability_basic1_name), getString(R.string.jett_ability_basic2_name), getString(R.string.jett_ability_signature_name), getString(R.string.jett_ability_ultimate_name), getString(R.string.jett_ability_basic1_desc), getString(R.string.jett_ability_basic2_desc), getString(R.string.jett_ability_signature_desc), getString(R.string.jett_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.reyna_card_large, R.drawable.reyna_artwork_full, getString(R.string.reyna_name), getString(R.string.duelist_role), getString(R.string.reyna_desc), R.drawable.leer, R.drawable.devour, R.drawable.dismiss, R.drawable.empress, getString(R.string.reyna_ability_basic1_name), getString(R.string.reyna_ability_basic2_name), getString(R.string.reyna_ability_signature_name), getString(R.string.reyna_ability_ultimate_name), getString(R.string.reyna_ability_basic1_desc), getString(R.string.reyna_ability_basic2_desc), getString(R.string.reyna_ability_signature_desc), getString(R.string.reyna_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.raze_card_large, R.drawable.raze_artwork_full, getString(R.string.raze_name), getString(R.string.duelist_role), getString(R.string.raze_desc), R.drawable.boom_bot, R.drawable.blast_pack, R.drawable.paint_shells, R.drawable.showstopper, getString(R.string.raze_ability_basic1_name), getString(R.string.raze_ability_basic2_name), getString(R.string.raze_ability_signature_name), getString(R.string.raze_ability_ultimate_name), getString(R.string.raze_ability_basic1_desc), getString(R.string.raze_ability_basic2_desc), getString(R.string.raze_ability_signature_desc), getString(R.string.raze_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.breach_card_large, R.drawable.breach_artwork_full, getString(R.string.breach_name), getString(R.string.initiator_role), getString(R.string.breach_desc), R.drawable.aftershock, R.drawable.flashpoint, R.drawable.fault_line, R.drawable.rolling_thunder, getString(R.string.breach_ability_basic1_name), getString(R.string.breach_ability_basic2_name), getString(R.string.breach_ability_signature_name), getString(R.string.breach_ability_ultimate_name), getString(R.string.breach_ability_basic1_desc), getString(R.string.breach_ability_basic2_desc), getString(R.string.breach_ability_signature_desc), getString(R.string.breach_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.skye_card_large, R.drawable.skye_artwork_full, getString(R.string.skye_name), getString(R.string.initiator_role), getString(R.string.skye_desc), R.drawable.regrowth, R.drawable.trailblazer, R.drawable.guiding_light, R.drawable.seekers, getString(R.string.skye_ability_basic1_name), getString(R.string.skye_ability_basic2_name), getString(R.string.skye_ability_signature_name), getString(R.string.skye_ability_ultimate_name), getString(R.string.skye_ability_basic1_desc), getString(R.string.skye_ability_basic2_desc), getString(R.string.skye_ability_signature_desc), getString(R.string.skye_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.yoru_card_large, R.drawable.yoru_artwork_full, getString(R.string.yoru_name), getString(R.string.duelist_role), getString(R.string.yoru_desc), R.drawable.fakeout, R.drawable.blindside, R.drawable.gatecrash, R.drawable.dimensional_drift, getString(R.string.yoru_ability_basic1_name), getString(R.string.yoru_ability_basic2_name), getString(R.string.yoru_ability_signature_name), getString(R.string.yoru_ability_ultimate_name), getString(R.string.yoru_ability_basic1_desc), getString(R.string.yoru_ability_basic2_desc), getString(R.string.yoru_ability_signature_desc), getString(R.string.yoru_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.astra_card_large, R.drawable.astra_artwork_full, getString(R.string.astra_name), getString(R.string.controller_role), getString(R.string.astra_desc), R.drawable.gravity_well, R.drawable.nova_pulse, R.drawable.nebula_dissipate, R.drawable.cosmic_divide, getString(R.string.astra_ability_basic1_name), getString(R.string.astra_ability_basic2_name), getString(R.string.astra_ability_signature_name), getString(R.string.astra_ability_ultimate_name), getString(R.string.astra_ability_basic1_desc), getString(R.string.astra_ability_basic2_desc), getString(R.string.astra_ability_signature_desc), getString(R.string.astra_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.kayo_card_large, R.drawable.kayo_artwork_full, getString(R.string.kayo_name), getString(R.string.initiator_role), getString(R.string.kayo_desc), R.drawable.fragment, R.drawable.flashdrive, R.drawable.zeropoint, R.drawable.nullcmd, getString(R.string.kayo_ability_basic1_name), getString(R.string.kayo_ability_basic2_name), getString(R.string.kayo_ability_signature_name), getString(R.string.kayo_ability_ultimate_name), getString(R.string.kayo_ability_basic1_desc), getString(R.string.kayo_ability_basic2_desc), getString(R.string.kayo_ability_signature_desc), getString(R.string.kayo_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.chamber_card_large, R.drawable.chamber_artwork_full, getString(R.string.chamber_name), getString(R.string.sentinel_role), getString(R.string.chamber_desc), R.drawable.trademark, R.drawable.headhunter, R.drawable.rendezvous, R.drawable.tour_de_force, getString(R.string.chamber_ability_basic1_name), getString(R.string.chamber_ability_basic2_name), getString(R.string.chamber_ability_signature_name), getString(R.string.chamber_ability_ultimate_name), getString(R.string.chamber_ability_basic1_desc), getString(R.string.chamber_ability_basic2_desc), getString(R.string.chamber_ability_signature_desc), getString(R.string.chamber_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.neon_card_large, R.drawable.neon_artwork_full, getString(R.string.neon_name), getString(R.string.duelist_role), getString(R.string.neon_desc), R.drawable.fast_lane, R.drawable.relay_bolt, R.drawable.high_gear, R.drawable.overdrive, getString(R.string.neon_ability_basic1_name), getString(R.string.neon_ability_basic2_name), getString(R.string.neon_ability_signature_name), getString(R.string.neon_ability_ultimate_name), getString(R.string.neon_ability_basic1_desc), getString(R.string.neon_ability_basic2_desc), getString(R.string.neon_ability_signature_desc), getString(R.string.neon_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.fade_card_large, R.drawable.fade_artwork_full, getString(R.string.fade_name), getString(R.string.initiator_role), getString(R.string.fade_desc), R.drawable.prowler, R.drawable.seize, R.drawable.haunt, R.drawable.nightfall, getString(R.string.fade_ability_basic1_name), getString(R.string.fade_ability_basic2_name), getString(R.string.fade_ability_signature_name), getString(R.string.fade_ability_ultimate_name), getString(R.string.fade_ability_basic1_desc), getString(R.string.fade_ability_basic2_desc), getString(R.string.fade_ability_signature_desc), getString(R.string.fade_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.harbor_card_large, R.drawable.harbor_artwork_full, getString(R.string.harbor_name), getString(R.string.controller_role), getString(R.string.harbor_desc), R.drawable.cascade, R.drawable.cove, R.drawable.high_tide, R.drawable.reckoning, getString(R.string.harbor_ability_basic1_name), getString(R.string.harbor_ability_basic2_name), getString(R.string.harbor_ability_signature_name), getString(R.string.harbor_ability_ultimate_name), getString(R.string.harbor_ability_basic1_desc), getString(R.string.harbor_ability_basic2_desc), getString(R.string.harbor_ability_signature_desc), getString(R.string.harbor_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.gekko_card_large, R.drawable.gekko_artwork_full, getString(R.string.gekko_name), getString(R.string.initiator_role), getString(R.string.gekko_desc), R.drawable.mosh_pit, R.drawable.wingman, R.drawable.dizzy, R.drawable.thrash, getString(R.string.gekko_ability_basic1_name), getString(R.string.gekko_ability_basic2_name), getString(R.string.gekko_ability_signature_name), getString(R.string.gekko_ability_ultimate_name), getString(R.string.gekko_ability_basic1_desc), getString(R.string.gekko_ability_basic2_desc), getString(R.string.gekko_ability_signature_desc), getString(R.string.gekko_ability_ultimate_desc)));
        agentItems.add(new AgentItem(R.drawable.deadlock_card_large, R.drawable.deadlock_artwork_full, getString(R.string.deadlock_name), getString(R.string.sentinel_role), getString(R.string.deadlock_desc), R.drawable.gravnet, R.drawable.sonic_sensor, R.drawable.barrier_mesh, R.drawable.annihilation, getString(R.string.deadlock_ability_basic1_name), getString(R.string.deadlock_ability_basic2_name), getString(R.string.deadlock_ability_signature_name), getString(R.string.deadlock_ability_ultimate_name), getString(R.string.deadlock_ability_basic1_desc), getString(R.string.deadlock_ability_basic2_desc), getString(R.string.deadlock_ability_signature_desc), getString(R.string.deadlock_ability_ultimate_desc)));

        agentAdapter = new AgentAdapter(agentItems, this, this::moveToDetail);

        viewPager2.setAdapter(agentAdapter);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer((page, position) -> {
            float r = 1 - Math.abs(position);
            page.setScaleX(0.85f + r * 0.15f);
        });

        viewPager2.setPageTransformer(compositePageTransformer);
        viewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);

        startAutoScroll();
    }

    private final Runnable autoScrollRunnable = new Runnable() {
        @Override
        public void run() {
            currentItem++;
            if (currentItem >= agentItems.size()) {
                currentItem = 0;// Reiniciar al primer elemento
            }
            viewPager2.setCurrentItem(currentItem, true);
            startAutoScroll();
        }
    };

    private void startAutoScroll() {
        autoScrollHandler.postDelayed(autoScrollRunnable, 3000); // Establecer el tiempo de espera entre desplazamientos
    }

    private void stopAutoScroll() {
        autoScrollHandler.removeCallbacks(autoScrollRunnable);
    }

    public void moveToDetail(AgentItem item){
        stopAutoScroll();
        Intent intent = new Intent( DashboardActivity.this, AgentDetailActivity.class);
        intent.putExtra("ListElement", item);
        intent.putExtra("CurrentItem", currentItem);
        startActivity(intent);

    }
/*
    @Override
    protected void onPause() {
        super.onPause();
        stopAutoScroll();
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewPager2.setCurrentItem(currentItem, true); // Configura el elemento actual
        startAutoScroll(); // Reinicia el desplazamiento automático
    }
*/
}
