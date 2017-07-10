package disc.mods.scala.core.creativetab

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.ItemStack
import net.minecraft.init.Items

object Tabs {
  val CoreBlocks = new CreativeTabs("dcs.CoreBlocks")
  {
    def getTabIconItem = new ItemStack(Items.GUNPOWDER)
  }
}