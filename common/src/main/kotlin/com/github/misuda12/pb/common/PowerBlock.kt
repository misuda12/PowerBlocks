package com.github.misuda12.pb.common

import org.bukkit.Location
import org.bukkit.block.Block

data class PowerBlock(val blockId: String, var name: String, val location: Location, val block: Block)