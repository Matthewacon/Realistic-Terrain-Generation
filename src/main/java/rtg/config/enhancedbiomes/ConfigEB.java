package rtg.config.enhancedbiomes;

import java.io.File;

import net.minecraft.world.biome.BiomeGenBase;

import net.minecraftforge.common.config.Configuration;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Level;

import rtg.world.biome.BiomeBase;

public class ConfigEB 
{
	public static Configuration config;
	
    public static final int biomeWeightMin = BiomeBase.MIN_BIOME_WEIGHT;
    public static final int biomeWeightMax = BiomeBase.MAX_BIOME_WEIGHT;
    public static final int biomeWeightDefault = BiomeBase.DEFAULT_BIOME_WEIGHT;
	
	public static boolean generateEBBiomes = true;
			
	public static boolean generateEBAlpineMountains = true;
	public static boolean generateEBAlpineMountainsEdge = true;
	public static boolean generateEBAlpineMountainsM = true;
	public static boolean generateEBAlpineTundra = true;
	public static boolean generateEBAspenForest = true;
	public static boolean generateEBAspenHills = true;
	public static boolean generateEBBadlands = true;
	public static boolean generateEBBasin =true;
	public static boolean generateEBBlossomHills = true;
	public static boolean generateEBBlossomWoods = true;
	public static boolean generateEBBorealArchipelago = true;
	public static boolean generateEBBorealForest = true;
	public static boolean generateEBBorealPlateau = true;
	public static boolean generateEBBorealPlateauM = true;
	public static boolean generateEBCarr = true;
	public static boolean generateEBClayHills =true;
	public static boolean generateEBClearing = true;
	public static boolean generateEBColdBorealForest = true;
	public static boolean generateEBColdCypressForest = true;
	public static boolean generateEBColdFirForest = true;
	public static boolean generateEBColdPineForest = true;
	public static boolean generateEBCypressForest = true;
	public static boolean generateEBDesertArchipelago = true;
	public static boolean generateEBEphemeralLake =true;
	public static boolean generateEBEphemeralLakeEdge =true;
	public static boolean generateEBFens = true;
	public static boolean generateEBFirForest = true;
	public static boolean generateEBFloweryArchipelago = true;
	public static boolean generateEBForestedArchipelago = true;
	public static boolean generateEBForestedMountains = true;
	public static boolean generateEBForestedValley = true;
	public static boolean generateEBFrozenArchipelago = true;
	public static boolean generateEBGlacier = true;
	public static boolean generateEBGrassyArchipelago = true;
	public static boolean generateEBIceSheet =true;
	public static boolean generateEBKakadu = true;
	public static boolean generateEBLake = true;
	public static boolean generateEBLowHills = true;
	public static boolean generateEBMangroves = true;
	public static boolean generateEBMarsh = true;
	public static boolean generateEBMeadow = true;
	public static boolean generateEBMeadowM = true;
	public static boolean generateEBMountainousArchipelago = true;
	public static boolean generateEBMountains = true;
	public static boolean generateEBMountainsEdge = true;
	public static boolean generateEBOakForest = true;
	public static boolean generateEBOasis = true;
	public static boolean generateEBPineForest = true;
	public static boolean generateEBPineForestArchipelago = true;
	public static boolean generateEBPlateau = true;
	public static boolean generateEBPolarDesert =true;
	public static boolean generateEBPrairie = true;
	public static boolean generateEBRainforest = true;
	public static boolean generateEBRainforestValley = true;
	public static boolean generateEBRedDesert = true;
	public static boolean generateEBRockyDesert =true;
	public static boolean generateEBRockyHills =true;
	public static boolean generateEBRoofedShrublands = true;
	public static boolean generateEBSahara = true;
	public static boolean generateEBSandstoneCanyon =true;
	public static boolean generateEBSandstoneCanyons =true;
	public static boolean generateEBSandstoneRanges =true;
	public static boolean generateEBSandstoneRangesM =true;
	public static boolean generateEBScree =true;
	public static boolean generateEBScrub =true;
	public static boolean generateEBShield = true;
	public static boolean generateEBShrublands = true;
	public static boolean generateEBSilverPineForest = true;
	public static boolean generateEBSilverPineHills = true;
	public static boolean generateEBSnowyDesert = true;
	public static boolean generateEBSnowyPlateau = true;
	public static boolean generateEBSnowyRanges = true;
	public static boolean generateEBSnowyWastelands =true;
	public static boolean generateEBSteppe = true;
	public static boolean generateEBStoneCanyon =true;
	public static boolean generateEBStoneCanyons =true;
	public static boolean generateEBTropicalArchipelago = true;
	public static boolean generateEBTundra = true;
	public static boolean generateEBVolcano =true;
	public static boolean generateEBVolcanoM =true;
	public static boolean generateEBWastelands =true;
	public static boolean generateEBWoodlandField = true;
	public static boolean generateEBWoodlandHills = true;
	public static boolean generateEBWoodlandLake = true;
	public static boolean generateEBWoodlandLakeEdge = true;
	public static boolean generateEBWoodlands = true;
	public static boolean generateEBXericSavannah = true;
	public static boolean generateEBXericShrubland = true;
	
	public static int weightEBAlpineMountains = biomeWeightDefault;
	public static int weightEBAlpineMountainsEdge = biomeWeightDefault;
	public static int weightEBAlpineMountainsM = biomeWeightDefault;
	public static int weightEBAlpineTundra = biomeWeightDefault;
	public static int weightEBAspenForest = biomeWeightDefault;
	public static int weightEBAspenHills = biomeWeightDefault;
	public static int weightEBBadlands = biomeWeightDefault;
	public static int weightEBBasin = biomeWeightDefault;
	public static int weightEBBlossomHills = biomeWeightDefault;
	public static int weightEBBlossomWoods = biomeWeightDefault;
	public static int weightEBBorealArchipelago = biomeWeightDefault;
	public static int weightEBBorealForest = biomeWeightDefault;
	public static int weightEBBorealPlateau = biomeWeightDefault;
	public static int weightEBBorealPlateauM = biomeWeightDefault;
	public static int weightEBCarr = biomeWeightDefault;
	public static int weightEBClayHills = biomeWeightDefault;
	public static int weightEBClearing = biomeWeightDefault;
	public static int weightEBColdBorealForest = biomeWeightDefault;
	public static int weightEBColdCypressForest = biomeWeightDefault;
	public static int weightEBColdFirForest = biomeWeightDefault;
	public static int weightEBColdPineForest = biomeWeightDefault;
	public static int weightEBCypressForest = biomeWeightDefault;
	public static int weightEBDesertArchipelago = biomeWeightDefault;
	public static int weightEBEphemeralLake = biomeWeightDefault;
	public static int weightEBEphemeralLakeEdge = biomeWeightDefault;
	public static int weightEBFens = biomeWeightDefault;
	public static int weightEBFirForest = biomeWeightDefault;
	public static int weightEBFloweryArchipelago = biomeWeightDefault;
	public static int weightEBForestedArchipelago = biomeWeightDefault;
	public static int weightEBForestedMountains = biomeWeightDefault;
	public static int weightEBForestedValley = biomeWeightDefault;
	public static int weightEBFrozenArchipelago = biomeWeightDefault;
	public static int weightEBGlacier = biomeWeightDefault;
	public static int weightEBGrassyArchipelago = biomeWeightDefault;
	public static int weightEBIceSheet = biomeWeightDefault;
	public static int weightEBKakadu = biomeWeightDefault;
	public static int weightEBLake = biomeWeightDefault;
	public static int weightEBLowHills = biomeWeightDefault;
	public static int weightEBMangroves = biomeWeightDefault;
	public static int weightEBMarsh = biomeWeightDefault;
	public static int weightEBMeadow = biomeWeightDefault;
	public static int weightEBMeadowM = biomeWeightDefault;
	public static int weightEBMountainousArchipelago = biomeWeightDefault;
	public static int weightEBMountains = biomeWeightDefault;
	public static int weightEBMountainsEdge = biomeWeightDefault;
	public static int weightEBOakForest = biomeWeightDefault;
	public static int weightEBOasis = biomeWeightDefault;
	public static int weightEBPineForest = biomeWeightDefault;
	public static int weightEBPineForestArchipelago = biomeWeightDefault;
	public static int weightEBPlateau = biomeWeightDefault;
	public static int weightEBPolarDesert = biomeWeightDefault;
	public static int weightEBPrairie = biomeWeightDefault;
	public static int weightEBRainforest = biomeWeightDefault;
	public static int weightEBRainforestValley = biomeWeightDefault;
	public static int weightEBRedDesert = biomeWeightDefault;
	public static int weightEBRockyDesert = biomeWeightDefault;
	public static int weightEBRockyHills = biomeWeightDefault;
	public static int weightEBRoofedShrublands = biomeWeightDefault;
	public static int weightEBSahara = biomeWeightDefault;
	public static int weightEBSandstoneCanyon = biomeWeightDefault;
	public static int weightEBSandstoneCanyons = biomeWeightDefault;
	public static int weightEBSandstoneRanges = biomeWeightDefault;
	public static int weightEBSandstoneRangesM = biomeWeightDefault;
	public static int weightEBScree = biomeWeightDefault;
	public static int weightEBScrub = biomeWeightDefault;
	public static int weightEBShield = biomeWeightDefault;
	public static int weightEBShrublands = biomeWeightDefault;
	public static int weightEBSilverPineForest = biomeWeightDefault;
	public static int weightEBSilverPineHills = biomeWeightDefault;
	public static int weightEBSnowyDesert = biomeWeightDefault;
	public static int weightEBSnowyPlateau = biomeWeightDefault;
	public static int weightEBSnowyRanges = biomeWeightDefault;
	public static int weightEBSnowyWastelands = biomeWeightDefault;
	public static int weightEBSteppe = biomeWeightDefault;
	public static int weightEBStoneCanyon = biomeWeightDefault;
	public static int weightEBStoneCanyons = biomeWeightDefault;
	public static int weightEBTropicalArchipelago = biomeWeightDefault;
	public static int weightEBTundra = biomeWeightDefault;
	public static int weightEBVolcano = biomeWeightDefault;
	public static int weightEBVolcanoM = biomeWeightDefault;
	public static int weightEBWastelands = biomeWeightDefault;
	public static int weightEBWoodlandField = biomeWeightDefault;
	public static int weightEBWoodlandHills = biomeWeightDefault;
	public static int weightEBWoodlandLake = biomeWeightDefault;
	public static int weightEBWoodlandLakeEdge = biomeWeightDefault;
	public static int weightEBWoodlands = biomeWeightDefault;
	public static int weightEBXericSavannah = biomeWeightDefault;
	public static int weightEBXericShrubland = biomeWeightDefault;
		
	public static void init(File configFile) 
	{
		config = new Configuration(configFile);
	
		try 
		{
			config.load();
			
			generateEBBiomes = config.getBoolean("Generate Biomes", "Biomes", generateEBBiomes, "If TRUE, uses the individual biome settings below. If FALSE, disables all biomes from this mod.");
			
			generateEBAlpineMountains = config.getBoolean("generateEBAlpineMountains", "Biomes", generateEBAlpineMountains, "");
			generateEBAlpineMountainsEdge = config.getBoolean("generateEBAlpineMountainsEdge", "Biomes", generateEBAlpineMountainsEdge, "");
			generateEBAlpineMountainsM = config.getBoolean("generateEBAlpineMountainsM", "Biomes", generateEBAlpineMountainsM, "");
			generateEBAlpineTundra = config.getBoolean("generateEBAlpineTundra", "Biomes", generateEBAlpineTundra, "");
			generateEBAspenForest = config.getBoolean("generateEBAspenForest", "Biomes", generateEBAspenForest, "");
			generateEBAspenHills = config.getBoolean("generateEBAspenHills", "Biomes", generateEBAspenHills, "");
			generateEBBadlands = config.getBoolean("generateEBBadlands", "Biomes", generateEBBadlands, "");
			generateEBBasin = config.getBoolean("generateEBBasin", "Biomes", generateEBBasin, "");
			generateEBBlossomHills = config.getBoolean("generateEBBlossomHills", "Biomes", generateEBBlossomHills, "");
			generateEBBlossomWoods = config.getBoolean("generateEBBlossomWoods", "Biomes", generateEBBlossomWoods, "");
			generateEBBorealArchipelago = config.getBoolean("generateEBBorealArchipelago", "Biomes", generateEBBorealArchipelago, "");
			generateEBBorealForest = config.getBoolean("generateEBBorealForest", "Biomes", generateEBBorealForest, "");
			generateEBBorealPlateau = config.getBoolean("generateEBBorealPlateau", "Biomes", generateEBBorealPlateau, "");
			generateEBBorealPlateauM = config.getBoolean("generateEBBorealPlateauM", "Biomes", generateEBBorealPlateauM, "");
			generateEBCarr = config.getBoolean("generateEBCarr", "Biomes", generateEBCarr, "");
			generateEBClayHills = config.getBoolean("generateEBClayHills", "Biomes", generateEBClayHills, "");
			generateEBClearing = config.getBoolean("generateEBClearing", "Biomes", generateEBClearing, "");
			generateEBColdBorealForest = config.getBoolean("generateEBColdBorealForest", "Biomes", generateEBColdBorealForest, "");
			generateEBColdCypressForest = config.getBoolean("generateEBColdCypressForest", "Biomes", generateEBColdCypressForest, "");
			generateEBColdFirForest = config.getBoolean("generateEBColdFirForest", "Biomes", generateEBColdFirForest, "");
			generateEBColdPineForest = config.getBoolean("generateEBColdPineForest", "Biomes", generateEBColdPineForest, "");
			generateEBCypressForest = config.getBoolean("generateEBCypressForest", "Biomes", generateEBCypressForest, "");
			generateEBDesertArchipelago = config.getBoolean("generateEBDesertArchipelago", "Biomes", generateEBDesertArchipelago, "");
			generateEBEphemeralLake = config.getBoolean("generateEBEphemeralLake", "Biomes", generateEBEphemeralLake, "");
			generateEBEphemeralLakeEdge = config.getBoolean("generateEBEphemeralLakeEdge", "Biomes", generateEBEphemeralLakeEdge, "");
			generateEBFens = config.getBoolean("generateEBFens", "Biomes", generateEBFens, "");
			generateEBFirForest = config.getBoolean("generateEBFirForest", "Biomes", generateEBFirForest, "");
			generateEBFloweryArchipelago = config.getBoolean("generateEBFloweryArchipelago", "Biomes", generateEBFloweryArchipelago, "");
			generateEBForestedArchipelago = config.getBoolean("generateEBForestedArchipelago", "Biomes", generateEBForestedArchipelago, "");
			generateEBForestedMountains = config.getBoolean("generateEBForestedMountains", "Biomes", generateEBForestedMountains, "");
			generateEBForestedValley = config.getBoolean("generateEBForestedValley", "Biomes", generateEBForestedValley, "");
			generateEBFrozenArchipelago = config.getBoolean("generateEBFrozenArchipelago", "Biomes", generateEBFrozenArchipelago, "");
			generateEBGlacier = config.getBoolean("generateEBGlacier", "Biomes", generateEBGlacier, "");
			generateEBGrassyArchipelago = config.getBoolean("generateEBGrassyArchipelago", "Biomes", generateEBGrassyArchipelago, "");
			generateEBIceSheet = config.getBoolean("generateEBIceSheet", "Biomes", generateEBIceSheet, "");
			generateEBKakadu = config.getBoolean("generateEBKakadu", "Biomes", generateEBKakadu, "");
			generateEBLake = config.getBoolean("generateEBLake", "Biomes", generateEBLake, "");
			generateEBLowHills = config.getBoolean("generateEBLowHills", "Biomes", generateEBLowHills, "");
			generateEBMangroves = config.getBoolean("generateEBMangroves", "Biomes", generateEBMangroves, "");
			generateEBMarsh = config.getBoolean("generateEBMarsh", "Biomes", generateEBMarsh, "");
			generateEBMeadow = config.getBoolean("generateEBMeadow", "Biomes", generateEBMeadow, "");
			generateEBMeadowM = config.getBoolean("generateEBMeadowM", "Biomes", generateEBMeadowM, "");
			generateEBMountainousArchipelago = config.getBoolean("generateEBMountainousArchipelago", "Biomes", generateEBMountainousArchipelago, "");
			generateEBMountains = config.getBoolean("generateEBMountains", "Biomes", generateEBMountains, "");
			generateEBMountainsEdge = config.getBoolean("generateEBMountainsEdge", "Biomes", generateEBMountainsEdge, "");
			generateEBOakForest = config.getBoolean("generateEBOakForest", "Biomes", generateEBOakForest, "");
			generateEBOasis = config.getBoolean("generateEBOasis", "Biomes", generateEBOasis, "");
			generateEBPineForest = config.getBoolean("generateEBPineForest", "Biomes", generateEBPineForest, "");
			generateEBPineForestArchipelago = config.getBoolean("generateEBPineForestArchipelago", "Biomes", generateEBPineForestArchipelago, "");
			generateEBPlateau = config.getBoolean("generateEBPlateau", "Biomes", generateEBPlateau, "");
			generateEBPolarDesert = config.getBoolean("generateEBPolarDesert", "Biomes", generateEBPolarDesert, "");
			generateEBPrairie = config.getBoolean("generateEBPrairie", "Biomes", generateEBPrairie, "");
			generateEBRainforest = config.getBoolean("generateEBRainforest", "Biomes", generateEBRainforest, "");
			generateEBRainforestValley = config.getBoolean("generateEBRainforestValley", "Biomes", generateEBRainforestValley, "");
			generateEBRedDesert = config.getBoolean("generateEBRedDesert", "Biomes", generateEBRedDesert, "");
			generateEBRockyDesert = config.getBoolean("generateEBRockyDesert", "Biomes", generateEBRockyDesert, "");
			generateEBRockyHills = config.getBoolean("generateEBRockyHills", "Biomes", generateEBRockyHills, "");
			generateEBRoofedShrublands = config.getBoolean("generateEBRoofedShrublands", "Biomes", generateEBRoofedShrublands, "");
			generateEBSahara = config.getBoolean("generateEBSahara", "Biomes", generateEBSahara, "");
			generateEBSandstoneCanyon = config.getBoolean("generateEBSandstoneCanyon", "Biomes", generateEBSandstoneCanyon, "");
			generateEBSandstoneCanyons = config.getBoolean("generateEBSandstoneCanyons", "Biomes", generateEBSandstoneCanyons, "");
			generateEBSandstoneRanges = config.getBoolean("generateEBSandstoneRanges", "Biomes", generateEBSandstoneRanges, "");
			generateEBSandstoneRangesM = config.getBoolean("generateEBSandstoneRangesM", "Biomes", generateEBSandstoneRangesM, "");
			generateEBScree = config.getBoolean("generateEBScree", "Biomes", generateEBScree, "");
			generateEBScrub = config.getBoolean("generateEBScrub", "Biomes", generateEBScrub, "");
			generateEBShield = config.getBoolean("generateEBShield", "Biomes", generateEBShield, "");
			generateEBShrublands = config.getBoolean("generateEBShrublands", "Biomes", generateEBShrublands, "");
			generateEBSilverPineForest = config.getBoolean("generateEBSilverPineForest", "Biomes", generateEBSilverPineForest, "");
			generateEBSilverPineHills = config.getBoolean("generateEBSilverPineHills", "Biomes", generateEBSilverPineHills, "");
			generateEBSnowyDesert = config.getBoolean("generateEBSnowyDesert", "Biomes", generateEBSnowyDesert, "");
			generateEBSnowyPlateau = config.getBoolean("generateEBSnowyPlateau", "Biomes", generateEBSnowyPlateau, "");
			generateEBSnowyRanges = config.getBoolean("generateEBSnowyRanges", "Biomes", generateEBSnowyRanges, "");
			generateEBSnowyWastelands = config.getBoolean("generateEBSnowyWastelands", "Biomes", generateEBSnowyWastelands, "");
			generateEBSteppe = config.getBoolean("generateEBSteppe", "Biomes", generateEBSteppe, "");
			generateEBStoneCanyon = config.getBoolean("generateEBStoneCanyon", "Biomes", generateEBStoneCanyon, "");
			generateEBStoneCanyons = config.getBoolean("generateEBStoneCanyons", "Biomes", generateEBStoneCanyons, "");
			generateEBTropicalArchipelago = config.getBoolean("generateEBTropicalArchipelago", "Biomes", generateEBTropicalArchipelago, "");
			generateEBTundra = config.getBoolean("generateEBTundra", "Biomes", generateEBTundra, "");
			generateEBVolcano = config.getBoolean("generateEBVolcano", "Biomes", generateEBVolcano, "");
			generateEBVolcanoM = config.getBoolean("generateEBVolcanoM", "Biomes", generateEBVolcanoM, "");
			generateEBWastelands = config.getBoolean("generateEBWastelands", "Biomes", generateEBWastelands, "");
			generateEBWoodlandField = config.getBoolean("generateEBWoodlandField", "Biomes", generateEBWoodlandField, "");
			generateEBWoodlandHills = config.getBoolean("generateEBWoodlandHills", "Biomes", generateEBWoodlandHills, "");
			generateEBWoodlandLake = config.getBoolean("generateEBWoodlandLake", "Biomes", generateEBWoodlandLake, "");
			generateEBWoodlandLakeEdge = config.getBoolean("generateEBWoodlandLakeEdge", "Biomes", generateEBWoodlandLakeEdge, "");
			generateEBWoodlands = config.getBoolean("generateEBWoodlands", "Biomes", generateEBWoodlands, "");
			generateEBXericSavannah = config.getBoolean("generateEBXericSavannah", "Biomes", generateEBXericSavannah, "");
			generateEBXericShrubland = config.getBoolean("generateEBXericShrubland", "Biomes", generateEBXericShrubland, "");
			
			weightEBAlpineMountains = config.getInt("weightEBAlpineMountains", "Weights", weightEBAlpineMountains, biomeWeightMin, biomeWeightMax, "");
			weightEBAlpineMountainsEdge = config.getInt("weightEBAlpineMountainsEdge", "Weights", weightEBAlpineMountainsEdge, biomeWeightMin, biomeWeightMax, "");
			weightEBAlpineMountainsM = config.getInt("weightEBAlpineMountainsM", "Weights", weightEBAlpineMountainsM, biomeWeightMin, biomeWeightMax, "");
			weightEBAlpineTundra = config.getInt("weightEBAlpineTundra", "Weights", weightEBAlpineTundra, biomeWeightMin, biomeWeightMax, "");
			weightEBAspenForest = config.getInt("weightEBAspenForest", "Weights", weightEBAspenForest, biomeWeightMin, biomeWeightMax, "");
			weightEBAspenHills = config.getInt("weightEBAspenHills", "Weights", weightEBAspenHills, biomeWeightMin, biomeWeightMax, "");
			weightEBBadlands = config.getInt("weightEBBadlands", "Weights", weightEBBadlands, biomeWeightMin, biomeWeightMax, "");
			weightEBBasin = config.getInt("weightEBBasin", "Weights", weightEBBasin, biomeWeightMin, biomeWeightMax, "");
			weightEBBlossomHills = config.getInt("weightEBBlossomHills", "Weights", weightEBBlossomHills, biomeWeightMin, biomeWeightMax, "");
			weightEBBlossomWoods = config.getInt("weightEBBlossomWoods", "Weights", weightEBBlossomWoods, biomeWeightMin, biomeWeightMax, "");
			weightEBBorealArchipelago = config.getInt("weightEBBorealArchipelago", "Weights", weightEBBorealArchipelago, biomeWeightMin, biomeWeightMax, "");
			weightEBBorealForest = config.getInt("weightEBBorealForest", "Weights", weightEBBorealForest, biomeWeightMin, biomeWeightMax, "");
			weightEBBorealPlateau = config.getInt("weightEBBorealPlateau", "Weights", weightEBBorealPlateau, biomeWeightMin, biomeWeightMax, "");
			weightEBBorealPlateauM = config.getInt("weightEBBorealPlateauM", "Weights", weightEBBorealPlateauM, biomeWeightMin, biomeWeightMax, "");
			weightEBCarr = config.getInt("weightEBCarr", "Weights", weightEBCarr, biomeWeightMin, biomeWeightMax, "");
			weightEBClayHills = config.getInt("weightEBClayHills", "Weights", weightEBClayHills, biomeWeightMin, biomeWeightMax, "");
			weightEBClearing = config.getInt("weightEBClearing", "Weights", weightEBClearing, biomeWeightMin, biomeWeightMax, "");
			weightEBColdBorealForest = config.getInt("weightEBColdBorealForest", "Weights", weightEBColdBorealForest, biomeWeightMin, biomeWeightMax, "");
			weightEBColdCypressForest = config.getInt("weightEBColdCypressForest", "Weights", weightEBColdCypressForest, biomeWeightMin, biomeWeightMax, "");
			weightEBColdFirForest = config.getInt("weightEBColdFirForest", "Weights", weightEBColdFirForest, biomeWeightMin, biomeWeightMax, "");
			weightEBColdPineForest = config.getInt("weightEBColdPineForest", "Weights", weightEBColdPineForest, biomeWeightMin, biomeWeightMax, "");
			weightEBCypressForest = config.getInt("weightEBCypressForest", "Weights", weightEBCypressForest, biomeWeightMin, biomeWeightMax, "");
			weightEBDesertArchipelago = config.getInt("weightEBDesertArchipelago", "Weights", weightEBDesertArchipelago, biomeWeightMin, biomeWeightMax, "");
			weightEBEphemeralLake = config.getInt("weightEBEphemeralLake", "Weights", weightEBEphemeralLake, biomeWeightMin, biomeWeightMax, "");
			weightEBEphemeralLakeEdge = config.getInt("weightEBEphemeralLakeEdge", "Weights", weightEBEphemeralLakeEdge, biomeWeightMin, biomeWeightMax, "");
			weightEBFens = config.getInt("weightEBFens", "Weights", weightEBFens, biomeWeightMin, biomeWeightMax, "");
			weightEBFirForest = config.getInt("weightEBFirForest", "Weights", weightEBFirForest, biomeWeightMin, biomeWeightMax, "");
			weightEBFloweryArchipelago = config.getInt("weightEBFloweryArchipelago", "Weights", weightEBFloweryArchipelago, biomeWeightMin, biomeWeightMax, "");
			weightEBForestedArchipelago = config.getInt("weightEBForestedArchipelago", "Weights", weightEBForestedArchipelago, biomeWeightMin, biomeWeightMax, "");
			weightEBForestedMountains = config.getInt("weightEBForestedMountains", "Weights", weightEBForestedMountains, biomeWeightMin, biomeWeightMax, "");
			weightEBForestedValley = config.getInt("weightEBForestedValley", "Weights", weightEBForestedValley, biomeWeightMin, biomeWeightMax, "");
			weightEBFrozenArchipelago = config.getInt("weightEBFrozenArchipelago", "Weights", weightEBFrozenArchipelago, biomeWeightMin, biomeWeightMax, "");
			weightEBGlacier = config.getInt("weightEBGlacier", "Weights", weightEBGlacier, biomeWeightMin, biomeWeightMax, "");
			weightEBGrassyArchipelago = config.getInt("weightEBGrassyArchipelago", "Weights", weightEBGrassyArchipelago, biomeWeightMin, biomeWeightMax, "");
			weightEBIceSheet = config.getInt("weightEBIceSheet", "Weights", weightEBIceSheet, biomeWeightMin, biomeWeightMax, "");
			weightEBKakadu = config.getInt("weightEBKakadu", "Weights", weightEBKakadu, biomeWeightMin, biomeWeightMax, "");
			weightEBLake = config.getInt("weightEBLake", "Weights", weightEBLake, biomeWeightMin, biomeWeightMax, "");
			weightEBLowHills = config.getInt("weightEBLowHills", "Weights", weightEBLowHills, biomeWeightMin, biomeWeightMax, "");
			weightEBMangroves = config.getInt("weightEBMangroves", "Weights", weightEBMangroves, biomeWeightMin, biomeWeightMax, "");
			weightEBMarsh = config.getInt("weightEBMarsh", "Weights", weightEBMarsh, biomeWeightMin, biomeWeightMax, "");
			weightEBMeadow = config.getInt("weightEBMeadow", "Weights", weightEBMeadow, biomeWeightMin, biomeWeightMax, "");
			weightEBMeadowM = config.getInt("weightEBMeadowM", "Weights", weightEBMeadowM, biomeWeightMin, biomeWeightMax, "");
			weightEBMountainousArchipelago = config.getInt("weightEBMountainousArchipelago", "Weights", weightEBMountainousArchipelago, biomeWeightMin, biomeWeightMax, "");
			weightEBMountains = config.getInt("weightEBMountains", "Weights", weightEBMountains, biomeWeightMin, biomeWeightMax, "");
			weightEBMountainsEdge = config.getInt("weightEBMountainsEdge", "Weights", weightEBMountainsEdge, biomeWeightMin, biomeWeightMax, "");
			weightEBOakForest = config.getInt("weightEBOakForest", "Weights", weightEBOakForest, biomeWeightMin, biomeWeightMax, "");
			weightEBOasis = config.getInt("weightEBOasis", "Weights", weightEBOasis, biomeWeightMin, biomeWeightMax, "");
			weightEBPineForest = config.getInt("weightEBPineForest", "Weights", weightEBPineForest, biomeWeightMin, biomeWeightMax, "");
			weightEBPineForestArchipelago = config.getInt("weightEBPineForestArchipelago", "Weights", weightEBPineForestArchipelago, biomeWeightMin, biomeWeightMax, "");
			weightEBPlateau = config.getInt("weightEBPlateau", "Weights", weightEBPlateau, biomeWeightMin, biomeWeightMax, "");
			weightEBPolarDesert = config.getInt("weightEBPolarDesert", "Weights", weightEBPolarDesert, biomeWeightMin, biomeWeightMax, "");
			weightEBPrairie = config.getInt("weightEBPrairie", "Weights", weightEBPrairie, biomeWeightMin, biomeWeightMax, "");
			weightEBRainforest = config.getInt("weightEBRainforest", "Weights", weightEBRainforest, biomeWeightMin, biomeWeightMax, "");
			weightEBRainforestValley = config.getInt("weightEBRainforestValley", "Weights", weightEBRainforestValley, biomeWeightMin, biomeWeightMax, "");
			weightEBRedDesert = config.getInt("weightEBRedDesert", "Weights", weightEBRedDesert, biomeWeightMin, biomeWeightMax, "");
			weightEBRockyDesert = config.getInt("weightEBRockyDesert", "Weights", weightEBRockyDesert, biomeWeightMin, biomeWeightMax, "");
			weightEBRockyHills = config.getInt("weightEBRockyHills", "Weights", weightEBRockyHills, biomeWeightMin, biomeWeightMax, "");
			weightEBRoofedShrublands = config.getInt("weightEBRoofedShrublands", "Weights", weightEBRoofedShrublands, biomeWeightMin, biomeWeightMax, "");
			weightEBSahara = config.getInt("weightEBSahara", "Weights", weightEBSahara, biomeWeightMin, biomeWeightMax, "");
			weightEBSandstoneCanyon = config.getInt("weightEBSandstoneCanyon", "Weights", weightEBSandstoneCanyon, biomeWeightMin, biomeWeightMax, "");
			weightEBSandstoneCanyons = config.getInt("weightEBSandstoneCanyons", "Weights", weightEBSandstoneCanyons, biomeWeightMin, biomeWeightMax, "");
			weightEBSandstoneRanges = config.getInt("weightEBSandstoneRanges", "Weights", weightEBSandstoneRanges, biomeWeightMin, biomeWeightMax, "");
			weightEBSandstoneRangesM = config.getInt("weightEBSandstoneRangesM", "Weights", weightEBSandstoneRangesM, biomeWeightMin, biomeWeightMax, "");
			weightEBScree = config.getInt("weightEBScree", "Weights", weightEBScree, biomeWeightMin, biomeWeightMax, "");
			weightEBScrub = config.getInt("weightEBScrub", "Weights", weightEBScrub, biomeWeightMin, biomeWeightMax, "");
			weightEBShield = config.getInt("weightEBShield", "Weights", weightEBShield, biomeWeightMin, biomeWeightMax, "");
			weightEBShrublands = config.getInt("weightEBShrublands", "Weights", weightEBShrublands, biomeWeightMin, biomeWeightMax, "");
			weightEBSilverPineForest = config.getInt("weightEBSilverPineForest", "Weights", weightEBSilverPineForest, biomeWeightMin, biomeWeightMax, "");
			weightEBSilverPineHills = config.getInt("weightEBSilverPineHills", "Weights", weightEBSilverPineHills, biomeWeightMin, biomeWeightMax, "");
			weightEBSnowyDesert = config.getInt("weightEBSnowyDesert", "Weights", weightEBSnowyDesert, biomeWeightMin, biomeWeightMax, "");
			weightEBSnowyPlateau = config.getInt("weightEBSnowyPlateau", "Weights", weightEBSnowyPlateau, biomeWeightMin, biomeWeightMax, "");
			weightEBSnowyRanges = config.getInt("weightEBSnowyRanges", "Weights", weightEBSnowyRanges, biomeWeightMin, biomeWeightMax, "");
			weightEBSnowyWastelands = config.getInt("weightEBSnowyWastelands", "Weights", weightEBSnowyWastelands, biomeWeightMin, biomeWeightMax, "");
			weightEBSteppe = config.getInt("weightEBSteppe", "Weights", weightEBSteppe, biomeWeightMin, biomeWeightMax, "");
			weightEBStoneCanyon = config.getInt("weightEBStoneCanyon", "Weights", weightEBStoneCanyon, biomeWeightMin, biomeWeightMax, "");
			weightEBStoneCanyons = config.getInt("weightEBStoneCanyons", "Weights", weightEBStoneCanyons, biomeWeightMin, biomeWeightMax, "");
			weightEBTropicalArchipelago = config.getInt("weightEBTropicalArchipelago", "Weights", weightEBTropicalArchipelago, biomeWeightMin, biomeWeightMax, "");
			weightEBTundra = config.getInt("weightEBTundra", "Weights", weightEBTundra, biomeWeightMin, biomeWeightMax, "");
			weightEBVolcano = config.getInt("weightEBVolcano", "Weights", weightEBVolcano, biomeWeightMin, biomeWeightMax, "");
			weightEBVolcanoM = config.getInt("weightEBVolcanoM", "Weights", weightEBVolcanoM, biomeWeightMin, biomeWeightMax, "");
			weightEBWastelands = config.getInt("weightEBWastelands", "Weights", weightEBWastelands, biomeWeightMin, biomeWeightMax, "");
			weightEBWoodlandField = config.getInt("weightEBWoodlandField", "Weights", weightEBWoodlandField, biomeWeightMin, biomeWeightMax, "");
			weightEBWoodlandHills = config.getInt("weightEBWoodlandHills", "Weights", weightEBWoodlandHills, biomeWeightMin, biomeWeightMax, "");
			weightEBWoodlandLake = config.getInt("weightEBWoodlandLake", "Weights", weightEBWoodlandLake, biomeWeightMin, biomeWeightMax, "");
			weightEBWoodlandLakeEdge = config.getInt("weightEBWoodlandLakeEdge", "Weights", weightEBWoodlandLakeEdge, biomeWeightMin, biomeWeightMax, "");
			weightEBWoodlands = config.getInt("weightEBWoodlands", "Weights", weightEBWoodlands, biomeWeightMin, biomeWeightMax, "");
			weightEBXericSavannah = config.getInt("weightEBXericSavannah", "Weights", weightEBXericSavannah, biomeWeightMin, biomeWeightMax, "");
			weightEBXericShrubland = config.getInt("weightEBXericShrubland", "Weights", weightEBXericShrubland, biomeWeightMin, biomeWeightMax, "");
		}
		catch (Exception e)
		{
			FMLLog.log(Level.ERROR, e, "RTG has had a problem loading EB configuration.");	
		}
		finally 
		{
			if (config.hasChanged())
			{
				config.save();
			}
		}
	}
}