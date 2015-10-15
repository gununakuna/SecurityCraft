package net.geforcemods.securitycraft.gui;

import org.lwjgl.opengl.GL11;

import net.geforcemods.securitycraft.containers.ContainerGeneric;
import net.geforcemods.securitycraft.main.Utils.ClientUtils;
import net.geforcemods.securitycraft.tileentity.TileEntityIMS;
import net.geforcemods.securitycraft.tileentity.TileEntityIMS.EnumIMSTargetingMode;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiIMS extends GuiContainer{
	
    private static final ResourceLocation field_110410_t = new ResourceLocation("securitycraft:textures/gui/container/blank.png");

	private TileEntityIMS tileEntity;
    private GuiButton targetButton;
    private int targetingOptionIndex = 0;

	public GuiIMS(InventoryPlayer par1InventoryPlayer, TileEntityIMS par2TileEntity) {
        super(new ContainerGeneric(par1InventoryPlayer, par2TileEntity));
        this.tileEntity = par2TileEntity;
        this.targetingOptionIndex = tileEntity.getTargetingOption().modeIndex;
	}
	
	public void initGui(){
		super.initGui();
		
		this.buttonList.add(this.targetButton = new GuiButton(0, this.width / 2 - 38, this.height / 2 - 58, 120, 20, tileEntity.getTargetingOption() == EnumIMSTargetingMode.PLAYERS_AND_MOBS ? "Hostile mobs & players" : "Players"));
	}
	
    public void drawScreen(int par1, int par2, float par3){
		super.drawScreen(par1, par2, par3);
	}
    
    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2){
        this.fontRendererObj.drawString("Intelligent Munitions System", this.xSize / 2 - this.fontRendererObj.getStringWidth("Intelligent Munitions System") / 2, 6, 4210752);
        this.fontRendererObj.drawString("Target:", this.xSize / 2 - 78, 30, 4210752);
    }

	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(field_110410_t);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	}
	
	protected void actionPerformed(GuiButton guibutton){
    	switch(guibutton.id){
    	case 0:
    		targetingOptionIndex++;
    		
    		if(targetingOptionIndex > 1){
    			targetingOptionIndex = 0;
    		}
    		    		
    		tileEntity.setTargetingOption(EnumIMSTargetingMode.values()[targetingOptionIndex]);
    		
        	ClientUtils.syncTileEntity(tileEntity);
    		
    		this.updateButtonText();
    	}
    }

	private void updateButtonText() {
		if(EnumIMSTargetingMode.values()[targetingOptionIndex] == EnumIMSTargetingMode.PLAYERS){
			targetButton.displayString = "Players";
		}else if(EnumIMSTargetingMode.values()[targetingOptionIndex] == EnumIMSTargetingMode.PLAYERS_AND_MOBS){
			targetButton.displayString = "Hostile mobs & players";
		}
	}	

}
