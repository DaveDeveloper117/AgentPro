package com.davedevab.agentpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AgentDetailActivity extends AppCompatActivity {

    ImageView bgImage, agentImageView, abilityBasic1Image, abilityBasic2Image, abilitySignatureImage, abilityUltimateImage;
    TextView agentNameDetail, agentRoleDetail, agentDescriptionDetail, abilityBasic1TextView, abilityBasic2TextView, abilitySignatureTextView, abilityUltimateTextView
            , abilityBasic1DescriptionTextView, abilityBasic2DescriptionTextView, abilitySignatureDescriptionTextView, abilityUltimateDescriptionTextView;
    FloatingActionButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_detail);

        AgentItem agentItem = (AgentItem) getIntent().getSerializableExtra("ListElement");

        bgImage = findViewById(R.id.bgImage);
        agentImageView = findViewById(R.id.agentImageView);
        abilityBasic1Image = findViewById(R.id.abilityBasic1Image);
        abilityBasic2Image = findViewById(R.id.abilityBasic2Image);
        abilitySignatureImage = findViewById(R.id.abilitySignatureImage);
        abilityUltimateImage = findViewById(R.id.abilityUltimateImage);
        agentNameDetail = findViewById(R.id.agentNameDetail);
        agentRoleDetail = findViewById(R.id.agentRoleDetail);
        agentDescriptionDetail = findViewById(R.id.agentDescriptionDetail);
        abilityBasic1TextView = findViewById(R.id.abilityBasic1TextView);
        abilityBasic2TextView = findViewById(R.id.abilityBasic2TextView);
        abilitySignatureTextView = findViewById(R.id.abilitySignatureTextView);
        abilityUltimateTextView = findViewById(R.id.abilityUltimateTextView);
        abilityBasic1DescriptionTextView = findViewById(R.id.abilityBasic1DescriptionTextView);
        abilityBasic2DescriptionTextView = findViewById(R.id.abilityBasic2DescriptionTextView);
        abilitySignatureDescriptionTextView = findViewById(R.id.abilitySignatureDescriptionTextView);
        abilityUltimateDescriptionTextView = findViewById(R.id.abilityUltimateDescriptionTextView);
        backButton = findViewById(R.id.backButton);

        bgImage.setImageResource(agentItem.getBgImage());
        agentImageView.setImageResource(agentItem.getImageAgent());
        abilityBasic1Image.setImageResource(agentItem.getIconoAbility1());
        abilityBasic2Image.setImageResource(agentItem.getIconoAbility2());
        abilitySignatureImage.setImageResource(agentItem.getIconoAbility3());
        abilityUltimateImage.setImageResource(agentItem.getIconoAbility4());
        agentNameDetail.setText(agentItem.getNameAgent());
        agentRoleDetail.setText(agentItem.getRoleAgent());
        agentDescriptionDetail.setText(agentItem.getDescriptionAgent());
        abilityBasic1TextView.setText(agentItem.getNameAbility1());
        abilityBasic2TextView.setText(agentItem.getNameAbility2());
        abilitySignatureTextView.setText(agentItem.getNameAbility3());
        abilityUltimateTextView.setText(agentItem.getNameAbility4());
        abilityBasic1DescriptionTextView.setText(agentItem.getDescriptionAbility1());
        abilityBasic2DescriptionTextView.setText(agentItem.getDescriptionAbility2());
        abilitySignatureDescriptionTextView.setText(agentItem.getDescriptionAbility3());
        abilityUltimateDescriptionTextView.setText(agentItem.getDescriptionAbility4());

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AgentDetailActivity.this, DashboardActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(AgentDetailActivity.this, DashboardActivity.class);
        startActivity(intent);
        finish();
    }
}