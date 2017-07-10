package disc.mods.scala.core.init

import net.minecraft.block.material.Material
import disc.mods.scala.core.block.CoreBlock
import net.minecraft.item.ItemBlock
import net.minecraft.block.Block
import net.minecraftforge.fml.common.registry.GameRegistry

object CoreBlocks {
  val CoreBlock = new CoreBlock(Material.IRON, "test")
  
  def init = {
    register(CoreBlock)
  }

  def register[T <: Block](block: T, itemBlock: ItemBlock) =
    {
      Registrar.Register(block)
      Registrar.Register(itemBlock)
      block
    }

  def register[T <: Block](block: T): Block = {
    val itemBlock = new ItemBlock(block)
    itemBlock.setRegistryName(block.getRegistryName)
    register(block, itemBlock)
    block
  }
}