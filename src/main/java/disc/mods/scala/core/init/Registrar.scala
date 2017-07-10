package disc.mods.scala.core.init

import net.minecraftforge.fml.common.registry.GameRegistry
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.ItemBlock
import net.minecraft.item.crafting.IRecipe

object Registrar {
  def Register(block: Block) = GameRegistry.register(block)

  def Register(item: Item) = GameRegistry.register(item)

  def Register(itemBlock: ItemBlock) = GameRegistry.register(itemBlock)

  object Recipes {
    def Register(recipe: IRecipe) = GameRegistry.addRecipe(recipe)

    def Register(output: Item, qty: Int, params: Object*) = GameRegistry.addRecipe(new ItemStack(output, qty), params)
    
  }
  
  object Smelting{
    def Register(input: ItemStack, output: ItemStack, xp : Float) : Unit = GameRegistry.addSmelting(input, output, xp)
    
    def Register(input: Item, output: Item, xp : Float) : Unit = Register(new ItemStack(input), new ItemStack(output), xp)
    
    def Register(input: Block, output: Item, xp : Float) : Unit = Register(new ItemStack(input), new ItemStack(output), xp)
    
    def Register(input: Item, output: Block, xp : Float) : Unit = Register(new ItemStack(input), new ItemStack(output), xp)
    
    def Register(input: Block, output: Block, xp : Float) : Unit = Register(new ItemStack(input), new ItemStack(output), xp)
  }
   
}