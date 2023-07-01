package com.davedevab.agentpro;

import java.io.Serializable;

public class AgentItem implements Serializable {

    private int bgImage;
    private int imageAgent;
    public String nameAgent;
    public String roleAgent;
    public String descriptionAgent;
    private int iconoAbility1;
    private int iconoAbility2;
    private int iconoAbility3;
    private int iconoAbility4;
    public String nameAbility1;
    public String nameAbility2;
    public String nameAbility3;
    public String nameAbility4;
    public String descriptionAbility1;
    public String descriptionAbility2;
    public String descriptionAbility3;
    public String descriptionAbility4;


    public AgentItem(int bgImage, int imageAgent, String nameAgent, String roleAgent, String descriptionAgent, int iconoAbility1, int iconoAbility2, int iconoAbility3, int iconoAbility4 , String nameAbility1, String nameAbility2, String nameAbility3, String nameAbility4, String descriptionAbility1, String descriptionAbility2, String descriptionAbility3, String descriptionAbility4){
        this.bgImage = bgImage;
        this.imageAgent = imageAgent;
        this.nameAgent = nameAgent;
        this.roleAgent = roleAgent;
        this.descriptionAgent = descriptionAgent;
        this.iconoAbility1 = iconoAbility1;
        this.iconoAbility2 = iconoAbility2;
        this.iconoAbility3 = iconoAbility3;
        this.iconoAbility4 = iconoAbility4;
        this.nameAbility1 = nameAbility1;
        this.nameAbility2 = nameAbility2;
        this.nameAbility3 = nameAbility3;
        this.nameAbility4 = nameAbility4;
        this.descriptionAbility1 = descriptionAbility1;
        this.descriptionAbility2 = descriptionAbility2;
        this.descriptionAbility3 = descriptionAbility3;
        this.descriptionAbility4 = descriptionAbility4;

    }

    public int getBgImage(){return bgImage;}

    public int getImageAgent(){return  imageAgent;}

    public String getNameAgent(){return nameAgent;}

    public String getRoleAgent(){return roleAgent;}

    public String getDescriptionAgent(){return descriptionAgent;}

    public int getIconoAbility1(){return iconoAbility1;}

    public int getIconoAbility2(){return iconoAbility2;}

    public int getIconoAbility3(){return iconoAbility3;}

    public int getIconoAbility4(){return iconoAbility4;}

    public String getNameAbility1(){return nameAbility1;}

    public String getNameAbility2(){return nameAbility2;}

    public String getNameAbility3(){return nameAbility3;}

    public String getNameAbility4(){return nameAbility4;}

    public String getDescriptionAbility1(){return descriptionAbility1;}

    public String getDescriptionAbility2(){return descriptionAbility2;}

    public String getDescriptionAbility3(){return descriptionAbility3;}

    public String getDescriptionAbility4(){return descriptionAbility4;}

}
