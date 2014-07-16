package com.fricionlessportal.projintel.creativetab;

import com.fricionlessportal.projintel.init.ModItems;
import com.fricionlessportal.projintel.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabPI
{
    public static final CreativeTabs PI_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.rainbowIngot;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Proj-Intel";
        }
    };
}
