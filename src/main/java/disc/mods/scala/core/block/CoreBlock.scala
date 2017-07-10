package disc.mods.scala.core.block

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import disc.mods.scala.core.creativetab._

class CoreBlock(mat: Material, name: String) extends Block(mat) {
  setUnlocalizedName(name)
  setRegistryName(name)
  setCreativeTab(Tabs.CoreBlocks)
}