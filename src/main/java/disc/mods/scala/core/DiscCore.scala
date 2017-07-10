package disc.mods.scala.core

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import disc.mods.scala.core.init.CoreBlocks


@Mod(name = "DiscCore Scala", modid = "dcs", modLanguage = "scala", version = "0.1")
object DiscCore {
  
  
  @EventHandler
  def preInit(e : FMLPreInitializationEvent) = {
    CoreBlocks.init
  }
  
}