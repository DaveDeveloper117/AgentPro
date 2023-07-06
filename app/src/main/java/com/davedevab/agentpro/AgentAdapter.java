package com.davedevab.agentpro;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class AgentAdapter extends RecyclerView.Adapter<AgentAdapter.AgentViewHolder> {

    private List<AgentItem> agentItems;

    private  LayoutInflater mInflater;

    private  Context context;

    private OnItemClickListener listener;

    public interface OnItemClickListener{
        void onItemClick(AgentItem agentItem);
    }

    public AgentAdapter(List<AgentItem> agentItems, Context context, OnItemClickListener listener){
        this.agentItems = agentItems;
        this.context = context;
        this.listener = listener;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AgentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.agent_container, parent, false);
        return  new AgentViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AgentViewHolder holder, int position) {
        AgentItem agentItem = agentItems.get(position);
        holder.bindData(agentItem, listener);
    }

    @Override
    public int getItemCount() {
        return agentItems.size();
    }

    public void setAgentItems(List<AgentItem> items) {agentItems = items; }

    public class AgentViewHolder extends RecyclerView.ViewHolder{

        private ImageView bgImage, agentImage;
        private TextView agentName, agentRole, agentDescription, abilityName1, abilityName2, abilityName3, abilityName4, abilityDescription1, abilityDescription2, abilityDescription3, abilityDescription4;
        private ImageView ability1, ability2, ability3, ability4;

        public AgentViewHolder(@NonNull View itemView) {
            super(itemView);
            bgImage = itemView.findViewById(R.id.bgImageView);
            agentImage = itemView.findViewById(R.id.agentImageView);
            agentName = itemView.findViewById(R.id.agentNameTextView);
            agentRole = itemView.findViewById(R.id.agentRoleTextView);
            agentDescription = itemView.findViewById(R.id.agentDescriptionTextView);
            abilityName1 = itemView.findViewById(R.id.abilityBasic1);
            abilityName2 = itemView.findViewById(R.id.abilityBasic2);
            abilityName3 = itemView.findViewById(R.id.abilitySignature);
            abilityName4 = itemView.findViewById(R.id.abilityUltimate);
            abilityDescription1 = itemView.findViewById(R.id.abilityBasic1Description);
            abilityDescription2 = itemView.findViewById(R.id.abilityBasic2Description);
            abilityDescription3 = itemView.findViewById(R.id.abilitySignatureDescription);
            abilityDescription4 = itemView.findViewById(R.id.abilityUltimateDescription);
            ability1 = itemView.findViewById(R.id.fabBasic1);
            ability2 = itemView.findViewById(R.id.fabBasic2);
            ability3 = itemView.findViewById(R.id.fabSignature);
            ability4 = itemView.findViewById(R.id.fabUltimate);
        }

        public void bindData(final AgentItem agentItem, OnItemClickListener listener){
            bgImage.setImageResource(agentItem.getBgImage());
            agentImage.setImageResource(agentItem.getImageAgent());
            agentName.setText(agentItem.getNameAgent());
            agentRole.setText(agentItem.getRoleAgent());
            agentDescription.setText(agentItem.getDescriptionAgent());
            abilityName1.setText(agentItem.getNameAbility1());
            abilityName2.setText(agentItem.getNameAbility2());
            abilityName3.setText(agentItem.getNameAbility3());
            abilityName4.setText(agentItem.getNameAbility4());
            abilityDescription1.setText(agentItem.getDescriptionAbility1());
            abilityDescription2.setText(agentItem.getDescriptionAbility2());
            abilityDescription3.setText(agentItem.getDescriptionAbility3());
            abilityDescription4.setText(agentItem.getDescriptionAbility4());
            ability1.setImageResource(agentItem.getIconoAbility1());
            ability2.setImageResource(agentItem.getIconoAbility2());
            ability3.setImageResource(agentItem.getIconoAbility3());
            ability4.setImageResource(agentItem.getIconoAbility4());
            itemView.setOnClickListener(v -> listener.onItemClick(agentItem));
        }
    }
}
