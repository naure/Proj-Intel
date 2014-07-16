package com.fricionlessportal.projintel.init;

import com.fricionlessportal.projintel.item.ItemPI;
import com.fricionlessportal.projintel.item.ItemRainbowIngot;
import com.fricionlessportal.projintel.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemPI rainbowIngot = new ItemRainbowIngot();

    public static void init()
    {
        GameRegistry.registerItem(rainbowIngot, "rainbowIngot");
    }
}


