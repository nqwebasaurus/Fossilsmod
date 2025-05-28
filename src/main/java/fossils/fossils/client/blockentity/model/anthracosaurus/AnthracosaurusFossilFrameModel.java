package fossils.fossils.client.blockentity.model.anthracosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AnthracosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Shoulderslope;
	private final ModelPart Head;
	private final ModelPart Lowerjawback;
	private final ModelPart Lowerjawmidbase;
	private final ModelPart Lowerjawmidfront;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerjawslopefront;
	private final ModelPart Lowerfrontteeth;
	private final ModelPart Rightlowerteeth;
	private final ModelPart Rightlowerteeth2;
	private final ModelPart Leftlowerteeth;
	private final ModelPart Upperjawbase;
	private final ModelPart Upperjawmiddle;
	private final ModelPart Upperjawfront;
	private final ModelPart Snoutfront;
	private final ModelPart Upperfrontteeth;
	private final ModelPart Snoutmiddle;
	private final ModelPart Rightupperteeth;
	private final ModelPart Leftupperteeth;
	private final ModelPart Snoutbase;
	private final ModelPart Upperjawbase2;
	private final ModelPart Upperjawmiddle2;
	private final ModelPart Upperjawfront2;
	private final ModelPart Snoutfront2;
	private final ModelPart Upperfrontteeth2;
	private final ModelPart Snoutmiddle2;
	private final ModelPart Rightupperteeth2;
	private final ModelPart Leftupperteeth2;
	private final ModelPart Snoutbase2;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;

	public AnthracosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Shoulderslope = this.Bodyfront.getChild("Shoulderslope");
		this.Head = this.Bodyfront.getChild("Head");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.Lowerjawmidbase = this.Lowerjawback.getChild("Lowerjawmidbase");
		this.Lowerjawmidfront = this.Lowerjawmidbase.getChild("Lowerjawmidfront");
		this.Lowerjawfront = this.Lowerjawmidfront.getChild("Lowerjawfront");
		this.Lowerjawslopefront = this.Lowerjawfront.getChild("Lowerjawslopefront");
		this.Lowerfrontteeth = this.Lowerjawfront.getChild("Lowerfrontteeth");
		this.Rightlowerteeth = this.Lowerjawmidfront.getChild("Rightlowerteeth");
		this.Rightlowerteeth2 = this.Lowerjawmidfront.getChild("Rightlowerteeth2");
		this.Leftlowerteeth = this.Lowerjawmidfront.getChild("Leftlowerteeth");
		this.Upperjawbase = this.Head.getChild("Upperjawbase");
		this.Upperjawmiddle = this.Upperjawbase.getChild("Upperjawmiddle");
		this.Upperjawfront = this.Upperjawmiddle.getChild("Upperjawfront");
		this.Snoutfront = this.Upperjawfront.getChild("Snoutfront");
		this.Upperfrontteeth = this.Upperjawfront.getChild("Upperfrontteeth");
		this.Snoutmiddle = this.Upperjawmiddle.getChild("Snoutmiddle");
		this.Rightupperteeth = this.Upperjawmiddle.getChild("Rightupperteeth");
		this.Leftupperteeth = this.Upperjawmiddle.getChild("Leftupperteeth");
		this.Snoutbase = this.Upperjawbase.getChild("Snoutbase");
		this.Upperjawbase2 = this.Head.getChild("Upperjawbase2");
		this.Upperjawmiddle2 = this.Upperjawbase2.getChild("Upperjawmiddle2");
		this.Upperjawfront2 = this.Upperjawmiddle2.getChild("Upperjawfront2");
		this.Snoutfront2 = this.Upperjawfront2.getChild("Snoutfront2");
		this.Upperfrontteeth2 = this.Upperjawfront2.getChild("Upperfrontteeth2");
		this.Snoutmiddle2 = this.Upperjawmiddle2.getChild("Snoutmiddle2");
		this.Rightupperteeth2 = this.Upperjawmiddle2.getChild("Rightupperteeth2");
		this.Leftupperteeth2 = this.Upperjawmiddle2.getChild("Leftupperteeth2");
		this.Snoutbase2 = this.Upperjawbase2.getChild("Snoutbase2");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.Tailmiddleend = this.Tailmiddle.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Righthindfoot = this.Rightshin.getChild("Righthindfoot");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Lefthindfoot = this.Leftshin.getChild("Lefthindfoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 9.0F, 0.0F, -0.1958F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(5, 5).addBox(-2.6F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 0.8259F, 15.0075F, 1.5708F, -0.1484F, -1.5708F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(10, 10).addBox(-0.5F, 1.5F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.0F, 0.5302F, 13.0294F, 1.4224F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -1.0194F, 6.9966F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.2194F, 6.8966F, 0.1991F, -0.1712F, -0.0344F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, 0.2F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4762F, -8.9003F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, 0.3744F, -10.965F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6507F, -8.9353F, 0.1222F, -0.192F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0979F, 0.8227F, -19.4203F, 0.2447F, -0.3495F, 0.0288F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(39, 34).addBox(2.8F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0194F, -7.207F, -1.5708F, -0.0262F, 1.5708F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(46, 41).addBox(-0.5F, 3.5F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.9147F, -3.2083F, -1.5446F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(42, 37).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5196F, -7.2201F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(46, 26).addBox(-0.5F, -0.145F, -6.7834F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7196F, -7.3201F, 0.2356F, 0.0F, 0.0F));

		PartDefinition Shoulderslope = Bodyfront.addOrReplaceChild("Shoulderslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3804F, 0.8799F, 0.1772F, 0.0F, 0.0F));

		PartDefinition Head = Bodyfront.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7196F, -13.6201F, 0.0628F, -0.3222F, 0.0301F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.484F, 3.5363F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbase = Lowerjawback.addOrReplaceChild("Lowerjawmidbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1282F, -0.829F, 1.2779F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidfront = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidfront", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2256F, -5.7775F));

		PartDefinition Lowerjawfront = Lowerjawmidfront.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.0213F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopefront = Lowerjawfront.addOrReplaceChild("Lowerjawslopefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 0.1F, -0.3396F, 0.0F, 0.0F));

		PartDefinition Lowerfrontteeth = Lowerjawfront.addOrReplaceChild("Lowerfrontteeth", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -2.6F));

		PartDefinition Rightlowerteeth = Lowerjawmidfront.addOrReplaceChild("Rightlowerteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, 0.5F, -1.0F, 0.0F, 0.1911F, 0.0F));

		PartDefinition Rightlowerteeth2 = Lowerjawmidfront.addOrReplaceChild("Rightlowerteeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 0.5F, -1.0F, 0.0F, -0.1911F, 0.0F));

		PartDefinition Leftlowerteeth = Lowerjawmidfront.addOrReplaceChild("Leftlowerteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 0.5F, -1.0F, 0.0F, -0.1911F, 0.0F));

		PartDefinition Upperjawbase = Head.addOrReplaceChild("Upperjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.516F, -0.4637F, 0.0213F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle = Upperjawbase.addOrReplaceChild("Upperjawmiddle", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -3.0F));

		PartDefinition Upperjawfront = Upperjawmiddle.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, -0.0213F, 0.0F, 0.0F));

		PartDefinition Snoutfront = Upperjawfront.addOrReplaceChild("Snoutfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.02F, -0.1F, 0.2972F, 0.0F, 0.0F));

		PartDefinition Upperfrontteeth = Upperjawfront.addOrReplaceChild("Upperfrontteeth", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -2.7F));

		PartDefinition Snoutmiddle = Upperjawmiddle.addOrReplaceChild("Snoutmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0559F, -1.3767F, 0.3721F, 0.0F, 0.0F));

		PartDefinition Rightupperteeth = Upperjawmiddle.addOrReplaceChild("Rightupperteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, 1.5F, -1.1F, 0.0F, 0.1911F, 0.0F));

		PartDefinition Leftupperteeth = Upperjawmiddle.addOrReplaceChild("Leftupperteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 1.5F, -1.1F, 0.0F, -0.1911F, 0.0F));

		PartDefinition Snoutbase = Upperjawbase.addOrReplaceChild("Snoutbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.3187F, 0.0F, 0.0F));

		PartDefinition Upperjawbase2 = Head.addOrReplaceChild("Upperjawbase2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.516F, -0.4637F, 0.0213F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle2 = Upperjawbase2.addOrReplaceChild("Upperjawmiddle2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -3.0F));

		PartDefinition Upperjawfront2 = Upperjawmiddle2.addOrReplaceChild("Upperjawfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, -0.0213F, 0.0F, 0.0F));

		PartDefinition Snoutfront2 = Upperjawfront2.addOrReplaceChild("Snoutfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.02F, -0.1F, 0.2972F, 0.0F, 0.0F));

		PartDefinition Upperfrontteeth2 = Upperjawfront2.addOrReplaceChild("Upperfrontteeth2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -2.7F));

		PartDefinition Snoutmiddle2 = Upperjawmiddle2.addOrReplaceChild("Snoutmiddle2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0559F, -1.3767F, 0.3721F, 0.0F, 0.0F));

		PartDefinition Rightupperteeth2 = Upperjawmiddle2.addOrReplaceChild("Rightupperteeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 1.5F, -1.1F, 0.0F, -0.1911F, 0.0F));

		PartDefinition Leftupperteeth2 = Upperjawmiddle2.addOrReplaceChild("Leftupperteeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, 1.5F, -1.1F, 0.0F, 0.1911F, 0.0F));

		PartDefinition Snoutbase2 = Upperjawbase2.addOrReplaceChild("Snoutbase2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.3187F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1313F, 4.1269F, -7.4067F, 0.1717F, -1.4481F, -0.3616F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0858F, 0.1059F, 0.5969F, -0.3712F, -0.3035F, -1.1647F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.429F, 4.7042F, -0.7941F, 1.8006F, -0.14F, 0.1039F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1313F, 4.1269F, -7.4067F, 0.1717F, 1.4481F, 0.3616F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0858F, 0.1059F, 0.5969F, -0.3712F, 0.3035F, 1.1647F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.429F, 4.7042F, -0.7941F, 1.8006F, 0.14F, -0.1039F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.7806F, 17.9966F, -0.2474F, 0.2117F, -0.053F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(25, 14).addBox(-0.5F, 0.3F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2002F, 0.0192F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9998F, 9.9192F, 0.0053F, 0.3507F, -0.0802F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(25, 26).addBox(-0.5F, 0.2F, 0.7F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0684F, -0.9099F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(26, -1).addBox(-0.5F, 0.1F, -0.7F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7684F, 8.9901F, -0.0249F, 0.4353F, -0.0948F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(21, 37).addBox(-0.5F, 0.2874F, -0.0201F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, 8.7F, 0.0194F, 0.3951F, -0.0768F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, 0.1F, -0.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0874F, 8.7799F, 0.0089F, -0.309F, 0.1221F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2223F, 2.6235F, 14.2081F, 2.7787F, -0.1761F, -1.6876F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.455F, 0.9656F, -5.3113F, -1.118F, 0.0967F, -0.1959F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4686F, 4.3979F, -0.315F, 0.7441F, 0.1227F, -0.1583F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2223F, 2.6235F, 14.2081F, 2.7787F, 0.1761F, 1.6876F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.455F, 0.9656F, -5.3113F, -1.118F, -0.0967F, 0.1959F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4686F, 4.3979F, -0.315F, 0.7441F, -0.1227F, 0.1583F));

		return LayerDefinition.create(meshdefinition, 90, 90);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}